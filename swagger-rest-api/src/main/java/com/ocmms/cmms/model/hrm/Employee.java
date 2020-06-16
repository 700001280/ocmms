package com.ocmms.cmms.model.hrm;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.assistance.WorkLog;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import com.ocmms.cmms.model.system.RecordStatus;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import lombok.Data;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.Assert;

/**
 * = Employee TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "HRM_PERSON")
@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class Employee implements Serializable {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "personGen", sequenceName = "SEQ_HRM_PERSON_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORGANIZATION")

	private Organization organization;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COSTCENTER")

	private CostCenter costCenter;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAINTWORKCENTER")

	private MainWorkCenter maintWorkCenter;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "PERSONNUMBER")
	private String personNumber;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "USERNAME")
	private String username;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Email
	@Column(name = "EMAIL")
	private String email;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@NotNull
	@Column(name = "PHONE")
	private String phone;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "FIRSTNAME")
	private String firstName;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "LASTNAME")
	private String lastName;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "TITLE")
	private String title;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "FAX")
	private String fax;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "sex", nullable = true, length = 1)
	private String sex;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "BIRTHDAY")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar birthday;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MEMO")
	private String memo;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "reportedBy")

	private Set<NotificationHeader> notificationHeaders = new HashSet<NotificationHeader>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "employee")

	private Set<Document> documents = new HashSet<Document>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "employee")

	private Set<ImageDocument> images = new HashSet<ImageDocument>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "taskOwner")

	private Set<TaskTracking> taskTrackings = new HashSet<TaskTracking>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "logger")

	private Set<WorkLog> workLogs = new HashSet<WorkLog>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "requester")

	private Set<ProcurementItemDetail> procurementItemDetails = new HashSet<ProcurementItemDetail>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "requester")

	private Set<ProcurementRequest> procurementRequests = new HashSet<ProcurementRequest>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "owner")

	private Set<PreventiveMaintenanceStandard> preventiveMaintenanceStandards = new HashSet<PreventiveMaintenanceStandard>();

	/**
	 * ** General Information Generated By System Start ***
	 */
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
		if (!(obj instanceof Employee)) {
			return false;
		}
		return getId() != null && Objects.equals(getId(), ((Employee) obj).getId());
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
		return firstName+ ", "+ lastName;
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
			item.setReportedBy(this);
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
			item.setReportedBy(null);
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
			item.setEmployee(this);
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
			item.setEmployee(null);
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
			item.setEmployee(this);
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
			item.setEmployee(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTrackingsToAdd
	 */
	public void addToTaskTrackings(Iterable<TaskTracking> taskTrackingsToAdd) {
		Assert.notNull(taskTrackingsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (TaskTracking item : taskTrackingsToAdd) {
			this.taskTrackings.add(item);
			item.setTaskOwner(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTrackingsToRemove
	 */
	public void removeFromTaskTrackings(Iterable<TaskTracking> taskTrackingsToRemove) {
		Assert.notNull(taskTrackingsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (TaskTracking item : taskTrackingsToRemove) {
			this.taskTrackings.remove(item);
			item.setTaskOwner(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workLogsToAdd
	 */
	public void addToWorkLogs(Iterable<WorkLog> workLogsToAdd) {
		Assert.notNull(workLogsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (WorkLog item : workLogsToAdd) {
			this.workLogs.add(item);
			item.setLogger(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workLogsToRemove
	 */
	public void removeFromWorkLogs(Iterable<WorkLog> workLogsToRemove) {
		Assert.notNull(workLogsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (WorkLog item : workLogsToRemove) {
			this.workLogs.remove(item);
			item.setLogger(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementItemDetailsToAdd
	 */
	public void addToProcurementItemDetails(Iterable<ProcurementItemDetail> procurementItemDetailsToAdd) {
		Assert.notNull(procurementItemDetailsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (ProcurementItemDetail item : procurementItemDetailsToAdd) {
			this.procurementItemDetails.add(item);
			item.setRequester(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementItemDetailsToRemove
	 */
	public void removeFromProcurementItemDetails(Iterable<ProcurementItemDetail> procurementItemDetailsToRemove) {
		Assert.notNull(procurementItemDetailsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (ProcurementItemDetail item : procurementItemDetailsToRemove) {
			this.procurementItemDetails.remove(item);
			item.setRequester(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementRequestsToAdd
	 */
	public void addToProcurementRequests(Iterable<ProcurementRequest> procurementRequestsToAdd) {
		Assert.notNull(procurementRequestsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (ProcurementRequest item : procurementRequestsToAdd) {
			this.procurementRequests.add(item);
			item.setRequester(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementRequestsToRemove
	 */
	public void removeFromProcurementRequests(Iterable<ProcurementRequest> procurementRequestsToRemove) {
		Assert.notNull(procurementRequestsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (ProcurementRequest item : procurementRequestsToRemove) {
			this.procurementRequests.remove(item);
			item.setRequester(null);
		}
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
			item.setOwner(this);
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
			item.setOwner(null);
		}
	}
}
