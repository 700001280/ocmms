/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ocmms.cmms.model.pm.technicalobject;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import io.springlets.format.EntityFormat;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.AbcIndicator;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceExecution;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import com.ocmms.cmms.model.pm.task.TaskHeader;
import com.ocmms.cmms.model.system.RecordStatus;

import javax.persistence.ManyToMany;

/**
 * = TechnicalObject TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(inheritanceType = "SINGLE_TABLE", table = "PM_TECHNICALOBJECT", entityFormatMessage = "entity_format_message_pm_technicalobject")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class TechnicalObject {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "technicalObjectGen", sequenceName = "SEQ_PM_TECHNICALOBJECT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "technicalObjectGen")
	@Column(name = "ID")
	private Long id;
	
	/**
	 *This change per extend regulation technical object
	 *@since 20200214 from {@link Equipment} to {@link TechnicalObject} by @author Alex Qin
	 *
	 */
	@Column(name = "TAG", unique = true, length=25)
	private String tag;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "DESCRIPTION")
	private String description;
	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DESCRIPTIONLOCAL")
	private String descriptionLocal;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ABCINDICATOR")
	@EntityFormat
	private AbcIndicator abcIndicator;

	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORGANIZATION")
	@EntityFormat
	private Organization organization;
	
	/**
	 *This change per extend regulation technical object
	 *@since 20200214 from {@link Equipment} to {@link TechnicalObject} by @author Alex Qin
	 *
	 */
	@Column(name = "MANUFACTURERMODELNUMBER")
	private String manufacturerModelNumber;

	/**
	 *This change per extend regulation technical object
	 *@since 20200214 from {@link Equipment} to {@link TechnicalObject} by @author Alex Qin
	 *
	 */
	@Column(name = "MANUFACTURERSERIALNUMBER")
	private String manufacturerSerialNumber;

	/**
	 *This change per extend regulation technical object
	 *@since 20200214 from {@link Equipment} to {@link TechnicalObject} by @author Alex Qin
	 *
	 */
	@Column(name = "MANUFACTURERPARTNUMBER")
	private String manufacturerPartNumber;	
	
	
	
	
	//@OneToOne(mappedBy = "technicalObject")
    //private RegulatoryTechnicalObject regulatoryTechnicalObject;
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObjects")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<PreventiveMaintenanceStandard> preventiveMaintenanceStandards = new HashSet<PreventiveMaintenanceStandard>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObjects")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<BillOfMaterial> billOfMaterials = new HashSet<BillOfMaterial>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObject")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<TaskHeader> taskHeaders = new HashSet<TaskHeader>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "superiorEquipment")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Equipment> equipments = new HashSet<Equipment>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObject")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<NotificationHeader> notificationHeaders = new HashSet<NotificationHeader>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObject")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<PreventiveMaintenanceExecution> preventiveMaintenanceExecutions = new HashSet<PreventiveMaintenanceExecution>();
        
        /**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObject")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Document> documents = new HashSet<Document>();
        
         /**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObject")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<ImageDocument> images = new HashSet<ImageDocument>();
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MEMO")
	private String memo;
	

	
	/**** General Information Generated By System Start ****/

        /**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RECORDSTATUS")
	@EntityFormat
	private RecordStatus recordStatus;
        
	/**
	 * record version, while changed or updated should be plus one;
	 *
	 */
	@Version
	@Column(name = "VERSION")
	private Long version;

	/**
	 * record created date, while created record this filed will be set;
	 *
	 */
	@Column(name = "CREATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	@CreatedDate
	private Calendar createdDate;

	/**
	 * record created user, while created record this filed will be set;
	 *
	 */
	@Column(name = "CREATED_BY")
	@CreatedBy
	private String createdBy;

	/**
	 * record update date, while update record this filed will be set;
	 *
	 */
	@Column(name = "LASTMODIFIED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	@LastModifiedDate
	private Calendar lastModifiedDate;

	/**
	 * Record last update user, while last update record this filed will be set;
	 *
	 */
	@Column(name = "LASTMODIFIED_BY")
	@LastModifiedBy
	private String lastModifiedBy;
	/**** General Information Generated By System End ******/
}
