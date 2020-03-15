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
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

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

import io.springlets.format.EntityFormat;

/**
 * The following assignments will be made at Header Level of the Task List: •
 * Task List description and status • Maintenance planning plant • Planner group
 * • Maintenance strategy
 * 
 * Select TL header Select Operations no. Operation/Activity Number Work center
 * Activity Type Control key Plant "Syst.Condition (use dropdown)" Operation
 * short text check Operation Labor Unit for work No. of Required Capacity
 * Normal Operation Duration Normal duration/unit Labor Percentage Rate Key for
 * calculation Execution Factor
 * 
 * @author qinzeyong
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "PM_WORKORDER_HEADER", entityFormatMessage = "entity_format_message_pm_workorder_header")
@RooEquals(isJpaEntity = true)
@RooSerializable
@RooJpaAudit
public class WorkOrderHeader {

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
	@EntityFormat
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
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<WorkOrderSystemStatus> systemStatus = new HashSet<WorkOrderSystemStatus>();

	/**
	 * WorkOrderPriority
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUSERSTATUS")
	@EntityFormat
	private WorkOrderUserStatusWithNumber userStatus;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "workOrderHeaders")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<WorkOrderUserStatusWithoutNumber> mutiUserStatuses = new HashSet<WorkOrderUserStatusWithoutNumber>();

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NOTIFICATIONHEADER")
	@EntityFormat
	private NotificationHeader notificationHeader;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLANNERGROUP")
	@EntityFormat
	private PlannerGroup plannerGroup;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAINWORKCENTER")
	@EntityFormat
	private MainWorkCenter mainWorkCenter;

	/**
	 * WorkOrderPriority
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACTIVITYTYPE")
	@EntityFormat
	private MaintenanceActivityType activityType;

	/**
	 * WorkOrderPriority
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SYSTEMCONDITION")
	@EntityFormat
	private SystemCondition systemCondition;

	/**
	 * WorkOrderPriority
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRIORITY")
	@EntityFormat
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
	@EntityFormat
	private FunctionalLocation functionalLocation;

	/**
	 * WorkOrderPriority
	 * 
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQUIPMENT")
	@EntityFormat
	private Equipment equipment;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLANTLOCATION")
	@EntityFormat("#{location}")
	private PlantLocation plantLocation;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PLANTSECTION")
	@EntityFormat("#{section}")
	private PlantSection plantSection;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COSTCENTER")
	@EntityFormat
	private CostCenter costCenter;

	@Column(name = "BREAKDOWN")
	private Boolean breakdown;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "workOrder")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<WorkOrderOperation> workOrderOperations = new HashSet<WorkOrderOperation>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "workOrder")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<WorkOrderMaterial> workOrderMaterials = new HashSet<WorkOrderMaterial>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "workOrderHeader")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Document> documents = new HashSet<Document>();
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "workOrderHeader")
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
