package com.ocmms.cmms.model.edm;

import com.ocmms.cmms.model.asset.AssetClassification;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import com.ocmms.cmms.model.asset.AssetStatus;
import com.ocmms.cmms.model.asset.AssetStatusChangeRecord;
import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.assistance.WorkLog;
import com.ocmms.cmms.model.eshem.CriticalClassification;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.loto.LotoDetail;
import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.model.loto.LotoIssueReport;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import com.ocmms.cmms.model.mm.procurement.PurchaseExpedite;
import com.ocmms.cmms.model.mm.storage.InstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringPoint;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringRecord;
import com.ocmms.cmms.model.pm.notification.NotificationItem;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceExecution;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.EquipmentReplaceRecord;
import com.ocmms.cmms.model.pm.routine.EquipmentScrappingRecord;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.PartReplaceRecord;
import com.ocmms.cmms.model.pm.routine.PartScrappingRecord;
import com.ocmms.cmms.model.pm.routine.PreventiveMaintenanceFinding;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentLubrication;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentParameter;
import com.ocmms.cmms.model.pm.technicalobject.FunctionalLocation;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.ocmms.cmms.model.pp.operation.AutonomousMaintenanceFinding;
import com.ocmms.cmms.model.pp.operation.FailureMaintenanceReport;
import com.ocmms.cmms.model.system.BugReport;
import com.ocmms.cmms.model.system.RecordStatus;

import io.springlets.format.EntityFormat;

@RooJavaBean
@RooToString
@RooJpaEntity(table = "EDM_DOCUMENT", entityFormatMessage = "entity_format_message_edm_document")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class Document {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "documentGen", sequenceName = "SEQ_EDM_DOCUMENT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "documentGen")
    @Column(name = "ID")
    private Long id;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NotNull
    @Column(name = "FILENAME", unique = true)
    private String fileName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "FILETYPE")
    private String fileType;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "UPLOADDATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "MM")
    private Calendar uploadDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOTOINFO")
    @EntityFormat
    private LotoInfo lotoInfo;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOTOISSUEREPORT")
    @EntityFormat
    private LotoIssueReport lotoIssueReport;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ASSETINVENTORYRECORD")
    @EntityFormat
    private AssetInventoryRecord assetInventoryRecord;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOTODETAIL")
    private LotoDetail lotoDetail;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "UPLOADER")
    @EntityFormat
    private Employee uploader;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NOTIFICATIONITEM")
    @EntityFormat
    private NotificationItem notificationItem;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "systemBugReport")
    @EntityFormat
    private BugReport systemBugReport;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PMFINDING")
    @EntityFormat
    private PreventiveMaintenanceFinding preventiveMaintenanceFinding;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AMFINDING")
    @EntityFormat
    private AutonomousMaintenanceFinding autonomousMaintenanceFinding;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FAILUREMAINTENANCEREPORT")
    @EntityFormat
    private FailureMaintenanceReport failureMaintenanceReport;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORKORDERHEADER")
    @EntityFormat
    private WorkOrderHeader workOrderHeader;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FUNCTIONALLOCATION")
    @EntityFormat
    private FunctionalLocation functionalLocation;

    /**
     * TODO Auto-generated attribute documentation
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
    @JoinColumn(name = "MATERIALCATALOG")
    @EntityFormat
    private MaterialCatalog materialCatalog;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MATERIALINSTOCKDETAIL")
    @EntityFormat
    private MaterialInstockDetail materialInstockDetail;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEASURINGPOINT")
    @EntityFormat
    private MeasuringPoint measuringPoint;
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEASURINGRECORD")
    @EntityFormat
    private MeasuringRecord measuringRecord;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EQUIPMENTMAINTENANCERECORD")
    @EntityFormat
    private EquipmentMaintenanceRecord equipmentMaintenanceRecord;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTMAINTENANCERECORD")
    @EntityFormat
    private PartMaintenanceRecord partMaintenanceRecord;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EQUIPMENTREPLACERECORD")
    @EntityFormat
    private EquipmentReplaceRecord equipmentReplaceRecord;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTREPLACERECORD")
    @EntityFormat
    private PartReplaceRecord partReplaceRecord;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EQUIPMENTSCRAPPINGRECORD")
    @EntityFormat
    private EquipmentScrappingRecord equipmentScrappingRecord;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTSCRAPPINGRECORD")
    @EntityFormat
    private PartScrappingRecord partScrappingRecord;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EQUIPMENTPARAMETER")
    @EntityFormat
    private EquipmentParameter equipmentParameter;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PREVENTIVEMAINTENANCESTANDARD")
    @EntityFormat
    private PreventiveMaintenanceStandard preventiveMaintenanceStandard;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PREVENTIVEMAINTENANCECONTENT")
    @EntityFormat
    private PreventiveMaintenanceContent preventiveMaintenanceContent;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PREVENTIVEMAINTENANCEEXECUTION")
    @EntityFormat
    private PreventiveMaintenanceExecution preventiveMaintenanceExecution;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASKTRACKING")
    @EntityFormat
    private TaskTracking taskTracking;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORKLOG")
    @EntityFormat
    private WorkLog workLog;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "procurementRequest")
    @EntityFormat
    private ProcurementRequest procurementRequest;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "procurementOrder")
    @EntityFormat
    private ProcurementOrder procurementOrder;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "procurementItemDetail")
    @EntityFormat
    private ProcurementItemDetail procurementItemDetail;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assetClassification")
    @EntityFormat
    private AssetClassification assetClassification;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assetStatus")
    @EntityFormat
    private AssetStatus assetStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assetStatusChangeRecord")
    @EntityFormat
    private AssetStatusChangeRecord assetStatusChangeRecord;
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "criticalClassification")
    @EntityFormat
    private CriticalClassification criticalClassification;
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "costCenter")
    @EntityFormat
    private CostCenter costCenter;
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee")
    @EntityFormat
    private Employee employee;
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purchaseExpedite")
    @EntityFormat
    private PurchaseExpedite purchaseExpedite;
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "instockDetail")
    @EntityFormat
    private InstockDetail instockDetail;
    
    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "materialOutstockDetail")
    @EntityFormat
    private MaterialOutstockDetail materialOutstockDetail;
    
     /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "technicalObject")
    @EntityFormat
    private TechnicalObject technicalObject;
    
     /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipmentLubrication")
    @EntityFormat
    private EquipmentLubrication equipmentLubrication;
    
            
    /**
     * ** General Information Generated By System Start ***
     */
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
    /**
     * ** General Information Generated By System End *****
     */

}
