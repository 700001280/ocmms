package com.ocmms.cmms.model.pm.workorder;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.pm.notification.NotificationPriority;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.pm.technicalobject.FunctionalLocation;
import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;
import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import com.ocmms.cmms.model.system.RecordStatus;
import lombok.Data;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.Assert;

/**
 * = WorkOrderHeader TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "PM_WORKORDER_HEADER")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class WorkOrderHeader implements Serializable {

	/**
	 * Type: Long <br>
	 * database id<br>
	 * Auto Generation by System
	 *
	 * @author qinzeyong
	 * @since 3.0.0.0
	 */
	@Id
	@SequenceGenerator(name = "workOrderHeaderGen", sequenceName = "SEQ_PM_WORKORDER_HEADER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workOrderHeaderGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * Auto Generation by System <br>
	 *
	 */
	@NotNull
	@Column(name = "WORKORDERCODE", unique = true)
	private String workOrderCode;

	/**
	 * work order type<br>
	 *
	 * @see {@link WorkOrderType} <br>
	 *
	 * @author qinzeyong
	 * @since 3.0.0.0
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WORKORDERTYPE")

	private WorkOrderType workOrderType;

	/**
	 * Both the WorkOrder description and long text is used to describe the request,
	 * malfunction or problem. The failure to provide the first required by the
	 * order planner will result in the order being held for information.
	 *
	 */
	@NotNull
	@Column(name = "DESCRIPTION")
	private String description;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "workOrderHeaders")

	private Set<WorkOrderSystemStatus> systemStatus = new HashSet<WorkOrderSystemStatus>();

	/**
	 * WorkOrderPriority
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUSERSTATUS")

	private WorkOrderUserStatusWithNumber userStatus;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "workOrderHeaders")

	private Set<WorkOrderUserStatusWithoutNumber> mutiUserStatuses = new HashSet<WorkOrderUserStatusWithoutNumber>();

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NOTIFICATIONHEADER")

	private NotificationHeader notificationHeader;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLANNERGROUP")

	private PlannerGroup plannerGroup;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAINWORKCENTER")

	private MainWorkCenter mainWorkCenter;

	/**
	 * WorkOrderPriority
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACTIVITYTYPE")

	private MaintenanceActivityType activityType;

	/**
	 * WorkOrderPriority
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYSTEMCONDITION")

	private SystemCondition systemCondition;

	/**
	 * WorkOrderPriority
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIORITY")

	private NotificationPriority priority;

	/**
	 * workOrder reported date<br>
	 *
	 * @author qinzeyong
	 * @since 3.0.0.0
	 */
	@Column(name = "PLANSTARTDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "MM")
	private Calendar planStartDate;

	/**
	 * workOrder reported date<br>
	 *
	 * @author qinzeyong
	 * @since 3.0.0.0
	 */
	@Column(name = "PLANFINISHDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "MM")
	private Calendar planFinishDate;

	/**
	 * workOrder reported date<br>
	 *
	 * @author qinzeyong
	 * @since 3.0.0.0
	 */
	@Column(name = "ACTSTARTDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "MM")
	private Calendar actStartDate;

	/**
	 * workOrder reported date<br>
	 *
	 * @author qinzeyong
	 * @since 3.0.0.0
	 */
	@Column(name = "ACTFINISHDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "MM")
	private Calendar actFinishDate;

	/**
	 * WorkOrderPriority
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FUNCTIONALLOCATION")

	private FunctionalLocation functionalLocation;

	/**
	 * WorkOrderPriority
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQUIPMENT")

	private Equipment equipment;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLANTLOCATION")

	private PlantLocation plantLocation;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLANTSECTION")

	private PlantSection plantSection;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COSTCENTER")

	private CostCenter costCenter;

	@Column(name = "BREAKDOWN")
	private Boolean breakdown;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "workOrder")

	private Set<WorkOrderOperation> workOrderOperations = new HashSet<WorkOrderOperation>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "workOrder")

	private Set<WorkOrderMaterial> workOrderMaterials = new HashSet<WorkOrderMaterial>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "workOrderHeader")

	private Set<Document> documents = new HashSet<Document>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "workOrderHeader")

	private Set<ImageDocument> images = new HashSet<ImageDocument>();

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
		if (!(obj instanceof WorkOrderHeader)) {
			return false;
		}
		return getId() != null && Objects.equals(getId(), ((WorkOrderHeader) obj).getId());
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
		return "WorkOrderHeader {" + "id='" + id + '\'' + ", workOrderCode='" + workOrderCode + '\'' + ", description='"
				+ description + '\'' + ", planStartDate='" + planStartDate == null
						? null
						: java.text.DateFormat.getDateTimeInstance().format(planStartDate.getTime()) + '\''
								+ ", planFinishDate='" + planFinishDate == null
										? null
										: java.text.DateFormat.getDateTimeInstance().format(planFinishDate.getTime())
												+ '\'' + ", actStartDate='" + actStartDate == null
														? null
														: java.text.DateFormat.getDateTimeInstance()
																.format(actStartDate.getTime()) + '\''
																+ ", actFinishDate='" + actFinishDate == null
																		? null
																		: java.text.DateFormat.getDateTimeInstance()
																				.format(actFinishDate.getTime()) + '\''
																				+ ", breakdown='" + breakdown + '\''
																				+ ", version='" + version + '\''
																				+ ", createdDate='"
																				+ createdDate == null
																						? null
																						: java.text.DateFormat
																								.getDateTimeInstance()
																								.format(createdDate
																										.getTime())
																								+ '\'' + ", createdBy='"
																								+ createdBy + '\''
																								+ ", lastModifiedDate='"
																								+ lastModifiedDate == null
																										? null
																										: java.text.DateFormat
																												.getDateTimeInstance()
																												.format(lastModifiedDate
																														.getTime())
																												+ '\''
																												+ ", lastModifiedBy='"
																												+ lastModifiedBy
																												+ '\''
																												+ "}"
																												+ super.toString();
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param systemStatusToAdd
	 */
	public void addToSystemStatus(Iterable<WorkOrderSystemStatus> systemStatusToAdd) {
		Assert.notNull(systemStatusToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (WorkOrderSystemStatus item : systemStatusToAdd) {
			this.systemStatus.add(item);
			item.getWorkOrderHeaders().add(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param systemStatusToRemove
	 */
	public void removeFromSystemStatus(Iterable<WorkOrderSystemStatus> systemStatusToRemove) {
		Assert.notNull(systemStatusToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (WorkOrderSystemStatus item : systemStatusToRemove) {
			this.systemStatus.remove(item);
			item.getWorkOrderHeaders().remove(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param mutiUserStatusesToAdd
	 */
	public void addToMutiUserStatuses(Iterable<WorkOrderUserStatusWithoutNumber> mutiUserStatusesToAdd) {
		Assert.notNull(mutiUserStatusesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (WorkOrderUserStatusWithoutNumber item : mutiUserStatusesToAdd) {
			this.mutiUserStatuses.add(item);
			item.getWorkOrderHeaders().add(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param mutiUserStatusesToRemove
	 */
	public void removeFromMutiUserStatuses(Iterable<WorkOrderUserStatusWithoutNumber> mutiUserStatusesToRemove) {
		Assert.notNull(mutiUserStatusesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (WorkOrderUserStatusWithoutNumber item : mutiUserStatusesToRemove) {
			this.mutiUserStatuses.remove(item);
			item.getWorkOrderHeaders().remove(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderOperationsToAdd
	 */
	public void addToWorkOrderOperations(Iterable<WorkOrderOperation> workOrderOperationsToAdd) {
		Assert.notNull(workOrderOperationsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (WorkOrderOperation item : workOrderOperationsToAdd) {
			this.workOrderOperations.add(item);
			item.setWorkOrder(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderOperationsToRemove
	 */
	public void removeFromWorkOrderOperations(Iterable<WorkOrderOperation> workOrderOperationsToRemove) {
		Assert.notNull(workOrderOperationsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (WorkOrderOperation item : workOrderOperationsToRemove) {
			this.workOrderOperations.remove(item);
			item.setWorkOrder(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderMaterialsToAdd
	 */
	public void addToWorkOrderMaterials(Iterable<WorkOrderMaterial> workOrderMaterialsToAdd) {
		Assert.notNull(workOrderMaterialsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (WorkOrderMaterial item : workOrderMaterialsToAdd) {
			this.workOrderMaterials.add(item);
			item.setWorkOrder(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderMaterialsToRemove
	 */
	public void removeFromWorkOrderMaterials(Iterable<WorkOrderMaterial> workOrderMaterialsToRemove) {
		Assert.notNull(workOrderMaterialsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (WorkOrderMaterial item : workOrderMaterialsToRemove) {
			this.workOrderMaterials.remove(item);
			item.setWorkOrder(null);
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
			item.setWorkOrderHeader(this);
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
			item.setWorkOrderHeader(null);
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
			item.setWorkOrderHeader(this);
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
			item.setWorkOrderHeader(null);
		}
	}
}
