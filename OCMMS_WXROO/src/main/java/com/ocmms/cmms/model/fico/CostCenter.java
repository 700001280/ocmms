package com.ocmms.cmms.model.fico;


import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import com.ocmms.cmms.model.system.RecordStatus;
import io.springlets.format.EntityFormat;

/**
 * For define the A,B,C class and risk level by user. General classify for
 * {@link Equipment} and {@link FunctionalLocation}
 * 
 * @author Alex Qin http://www.ocmms.com
 * @version 0.0.4 Revised Feb 3rd, 2018
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "FICO_COSTCENTER", entityFormatMessage = "entity_format_message_fico_costcenter")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class CostCenter {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "costCenterGen", sequenceName = "SEQ_FICO_COSTCENTER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "costCenterGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * Department Code Plus Cost Center Code
	 *
	 */
	@NotNull
	@Column(name = "CODE", unique = true, length=10)
	private String code;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "DESCRIPTION", unique = true)
	private String description;	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "costCenter")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Employee> employees = new HashSet<Employee>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORGANIZATION")
	@EntityFormat
	private Organization organization;
	
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "costCenter")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<MainWorkCenter> mainWorkCenters = new HashSet<MainWorkCenter>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "costCenter")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<OperationalWorkCenter> operationalWorkCenters = new HashSet<OperationalWorkCenter>();

	/**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "costCenter")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Document> documents = new HashSet<Document>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = {javax.persistence.CascadeType.MERGE,
        javax.persistence.CascadeType.PERSIST}, fetch = FetchType.LAZY, mappedBy = "costCenter")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<ImageDocument> images = new HashSet<ImageDocument>();
	

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