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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;

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

import lombok.Data;
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
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.Assert;

/**
 * = TechnicalObject TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "PM_TECHNICALOBJECT")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class TechnicalObject implements Serializable {

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
	 * This change per extend regulation technical object
	 * 
	 * @since 20200214 from {@link Equipment} to {@link TechnicalObject} by @author
	 *        Alex Qin
	 *
	 */
	@Column(name = "TAG", unique = true, length = 25)
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

	private AbcIndicator abcIndicator;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORGANIZATION")

	private Organization organization;

	/**
	 * This change per extend regulation technical object
	 * 
	 * @since 20200214 from {@link Equipment} to {@link TechnicalObject} by @author
	 *        Alex Qin
	 *
	 */
	@Column(name = "MANUFACTURERMODELNUMBER")
	private String manufacturerModelNumber;

	/**
	 * This change per extend regulation technical object
	 * 
	 * @since 20200214 from {@link Equipment} to {@link TechnicalObject} by @author
	 *        Alex Qin
	 *
	 */
	@Column(name = "MANUFACTURERSERIALNUMBER")
	private String manufacturerSerialNumber;

	/**
	 * This change per extend regulation technical object
	 * 
	 * @since 20200214 from {@link Equipment} to {@link TechnicalObject} by @author
	 *        Alex Qin
	 *
	 */
	@Column(name = "MANUFACTURERPARTNUMBER")
	private String manufacturerPartNumber;

	// @OneToOne(mappedBy = "technicalObject")
	// private RegulatoryTechnicalObject regulatoryTechnicalObject;
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObjects")

	private Set<PreventiveMaintenanceStandard> preventiveMaintenanceStandards = new HashSet<PreventiveMaintenanceStandard>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObjects")

	private Set<BillOfMaterial> billOfMaterials = new HashSet<BillOfMaterial>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObject")

	private Set<TaskHeader> taskHeaders = new HashSet<TaskHeader>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "superiorEquipment")

	private Set<Equipment> equipments = new HashSet<Equipment>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObject")

	private Set<NotificationHeader> notificationHeaders = new HashSet<NotificationHeader>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObject")

	private Set<PreventiveMaintenanceExecution> preventiveMaintenanceExecutions = new HashSet<PreventiveMaintenanceExecution>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObject")

	private Set<Document> documents = new HashSet<Document>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "technicalObject")

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

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";

	

	/**
	 * This `equals` implementation is specific for JPA entities and uses the entity
	 * identifier for it, following the article in
	 * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
	 *
	 * @param obj
	 * @return Boolean
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		// instanceof is false if the instance is null
		if (!(obj instanceof TechnicalObject)) {
			return false;
		}
		return getId() != null && Objects.equals(getId(), ((TechnicalObject) obj).getId());
	}

	/**
	 * This `hashCode` implementation is specific for JPA entities and uses a fixed
	 * `int` value to be able to identify the entity in collections after a new id
	 * is assigned to the entity, following the article in
	 * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
	 *
	 * @return Integer
	 */
	public int hashCode() {
		return 31;
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @return String
	 */
	public String toString() {
		return "TechnicalObject {" + "id='" + id + '\'' + ", tag='" + tag + '\'' + ", description='" + description
				+ '\'' + ", descriptionLocal='" + descriptionLocal + '\'' + ", manufacturerModelNumber='"
				+ manufacturerModelNumber + '\'' + ", manufacturerSerialNumber='" + manufacturerSerialNumber + '\''
				+ ", manufacturerPartNumber='" + manufacturerPartNumber + '\'' + ", memo='" + memo + '\''
				+ ", version='" + version + '\'' + ", createdDate='" + createdDate == null
						? null
						: java.text.DateFormat.getDateTimeInstance().format(createdDate.getTime()) + '\''
								+ ", createdBy='" + createdBy + '\'' + ", lastModifiedDate='" + lastModifiedDate == null
										? null
										: java.text.DateFormat.getDateTimeInstance().format(lastModifiedDate.getTime())
												+ '\'' + ", lastModifiedBy='" + lastModifiedBy + '\'' + "}"
												+ super.toString();
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceStandardsToAdd
	 */
	public void addToPreventiveMaintenanceStandards(
			Iterable<PreventiveMaintenanceStandard> preventiveMaintenanceStandardsToAdd) {
		Assert.notNull(preventiveMaintenanceStandardsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (PreventiveMaintenanceStandard item : preventiveMaintenanceStandardsToAdd) {
			this.preventiveMaintenanceStandards.add(item);
			item.getTechnicalObjects().add(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceStandardsToRemove
	 */
	public void removeFromPreventiveMaintenanceStandards(
			Iterable<PreventiveMaintenanceStandard> preventiveMaintenanceStandardsToRemove) {
		Assert.notNull(preventiveMaintenanceStandardsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (PreventiveMaintenanceStandard item : preventiveMaintenanceStandardsToRemove) {
			this.preventiveMaintenanceStandards.remove(item);
			item.getTechnicalObjects().remove(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param billOfMaterialsToAdd
	 */
	public void addToBillOfMaterials(Iterable<BillOfMaterial> billOfMaterialsToAdd) {
		Assert.notNull(billOfMaterialsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (BillOfMaterial item : billOfMaterialsToAdd) {
			this.billOfMaterials.add(item);
			item.getTechnicalObjects().add(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param billOfMaterialsToRemove
	 */
	public void removeFromBillOfMaterials(Iterable<BillOfMaterial> billOfMaterialsToRemove) {
		Assert.notNull(billOfMaterialsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (BillOfMaterial item : billOfMaterialsToRemove) {
			this.billOfMaterials.remove(item);
			item.getTechnicalObjects().remove(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskHeadersToAdd
	 */
	public void addToTaskHeaders(Iterable<TaskHeader> taskHeadersToAdd) {
		Assert.notNull(taskHeadersToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (TaskHeader item : taskHeadersToAdd) {
			this.taskHeaders.add(item);
			item.setTechnicalObject(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskHeadersToRemove
	 */
	public void removeFromTaskHeaders(Iterable<TaskHeader> taskHeadersToRemove) {
		Assert.notNull(taskHeadersToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (TaskHeader item : taskHeadersToRemove) {
			this.taskHeaders.remove(item);
			item.setTechnicalObject(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentsToAdd
	 */
	public void addToEquipments(Iterable<Equipment> equipmentsToAdd) {
		Assert.notNull(equipmentsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (Equipment item : equipmentsToAdd) {
			this.equipments.add(item);
			item.setSuperiorEquipment(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentsToRemove
	 */
	public void removeFromEquipments(Iterable<Equipment> equipmentsToRemove) {
		Assert.notNull(equipmentsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (Equipment item : equipmentsToRemove) {
			this.equipments.remove(item);
			item.setSuperiorEquipment(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationHeadersToAdd
	 */
	public void addToNotificationHeaders(Iterable<NotificationHeader> notificationHeadersToAdd) {
		Assert.notNull(notificationHeadersToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (NotificationHeader item : notificationHeadersToAdd) {
			this.notificationHeaders.add(item);
			item.setTechnicalObject(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationHeadersToRemove
	 */
	public void removeFromNotificationHeaders(Iterable<NotificationHeader> notificationHeadersToRemove) {
		Assert.notNull(notificationHeadersToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (NotificationHeader item : notificationHeadersToRemove) {
			this.notificationHeaders.remove(item);
			item.setTechnicalObject(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceExecutionsToAdd
	 */
	public void addToPreventiveMaintenanceExecutions(
			Iterable<PreventiveMaintenanceExecution> preventiveMaintenanceExecutionsToAdd) {
		Assert.notNull(preventiveMaintenanceExecutionsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (PreventiveMaintenanceExecution item : preventiveMaintenanceExecutionsToAdd) {
			this.preventiveMaintenanceExecutions.add(item);
			item.setTechnicalObject(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceExecutionsToRemove
	 */
	public void removeFromPreventiveMaintenanceExecutions(
			Iterable<PreventiveMaintenanceExecution> preventiveMaintenanceExecutionsToRemove) {
		Assert.notNull(preventiveMaintenanceExecutionsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (PreventiveMaintenanceExecution item : preventiveMaintenanceExecutionsToRemove) {
			this.preventiveMaintenanceExecutions.remove(item);
			item.setTechnicalObject(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param documentsToAdd
	 */
	public void addToDocuments(Iterable<Document> documentsToAdd) {
		Assert.notNull(documentsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (Document item : documentsToAdd) {
			this.documents.add(item);
			item.setTechnicalObject(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param documentsToRemove
	 */
	public void removeFromDocuments(Iterable<Document> documentsToRemove) {
		Assert.notNull(documentsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (Document item : documentsToRemove) {
			this.documents.remove(item);
			item.setTechnicalObject(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param imagesToAdd
	 */
	public void addToImages(Iterable<ImageDocument> imagesToAdd) {
		Assert.notNull(imagesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (ImageDocument item : imagesToAdd) {
			this.images.add(item);
			item.setTechnicalObject(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param imagesToRemove
	 */
	public void removeFromImages(Iterable<ImageDocument> imagesToRemove) {
		Assert.notNull(imagesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (ImageDocument item : imagesToRemove) {
			this.images.remove(item);
			item.setTechnicalObject(null);
		}
	}
}
