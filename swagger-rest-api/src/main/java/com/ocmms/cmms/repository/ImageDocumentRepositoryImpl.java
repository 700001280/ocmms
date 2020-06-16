package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.asset.AssetClassification;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import com.ocmms.cmms.model.asset.AssetStatus;
import com.ocmms.cmms.model.asset.AssetStatusChangeRecord;
import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.assistance.WorkLog;
import com.ocmms.cmms.model.edm.QImageDocument;
import com.ocmms.cmms.model.eshem.CriticalClassification;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.loto.LotoDetail;
import com.ocmms.cmms.model.loto.LotoInfo;
import com.ocmms.cmms.model.loto.LotoIssueReport;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrderFinanceTracking;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import com.ocmms.cmms.model.mm.procurement.PurchaseExpedite;
import com.ocmms.cmms.model.mm.storage.InstockDetail;
import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;
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
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = ImageDocumentRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ImageDocumentRepositoryImpl extends QueryDslRepositorySupportExt<ImageDocument>
		implements ImageDocumentRepositoryCustom {

	/**
	 * Default constructor
	 */
	ImageDocumentRepositoryImpl() {
		super(ImageDocument.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT_LUBRICATION = "equipmentLubrication";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEASURING_RECORD = "measuringRecord";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOTO_INFO = "lotoInfo";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FUNCTIONAL_LOCATION = "functionalLocation";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOTO_ISSUE_REPORT = "lotoIssueReport";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FILE_NAME = "fileName";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEASURING_POINT = "measuringPoint";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PROCUREMENT_REQUEST = "procurementRequest";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String INSTOCK_DETAIL = "instockDetail";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OUTSTOCK_DETAIL = "outstockDetail";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOTO_DETAIL = "lotoDetail";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PART_MAINTENANCE_RECORD = "partMaintenanceRecord";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UPLOAD_DATE = "uploadDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PROCUREMENT_ITEM_DETAIL = "procurementItemDetail";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UPLOADER = "uploader";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TECHNICAL_OBJECT = "technicalObject";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ASSET_INVENTORY_RECORD = "assetInventoryRecord";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SYSTEM_BUG_REPORT = "systemBugReport";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ASSET_CLASSIFICATION = "assetClassification";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TASK_TRACKING = "taskTracking";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORK_LOG = "workLog";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PREVENTIVE_MAINTENANCE_STANDARD = "preventiveMaintenanceStandard";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT_MAINTENANCE_RECORD = "equipmentMaintenanceRecord";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String IMAGE_ENCODE = "imageEncode";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PREVENTIVE_MAINTENANCE_FINDING = "preventiveMaintenanceFinding";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SERVICE_RECEIVE_DETAIL = "serviceReceiveDetail";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ASSET_STATUS_CHANGE_RECORD = "assetStatusChangeRecord";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String COST_CENTER = "costCenter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NOTIFICATION_ITEM = "notificationItem";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PREVENTIVE_MAINTENANCE_EXECUTION = "preventiveMaintenanceExecution";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PART_SCRAPPING_RECORD = "partScrappingRecord";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT = "equipment";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORK_ORDER_HEADER = "workOrderHeader";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT_REPLACE_RECORD = "equipmentReplaceRecord";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FAILURE_MAINTENANCE_REPORT = "failureMaintenanceReport";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT_SCRAPPING_RECORD = "equipmentScrappingRecord";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT_PARAMETER = "equipmentParameter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PROCUREMENT_ORDER = "procurementOrder";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_CATALOG = "materialCatalog";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PART_REPLACE_RECORD = "partReplaceRecord";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PREVENTIVE_MAINTENANCE_CONTENT = "preventiveMaintenanceContent";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EMPLOYEE = "employee";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PROCUREMENT_ORDER_FINANCE_TRACKING = "procurementOrderFinanceTracking";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String AUTONOMOUS_MAINTENANCE_FINDING = "autonomousMaintenanceFinding";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PURCHASE_EXPEDITE = "purchaseExpedite";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ASSET_STATUS = "assetStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FILE_TYPE = "fileType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CRITICAL_CLASSIFICATION = "criticalClassification";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(imageDocument.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetClassification
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByAssetClassification(AssetClassification assetClassification,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(assetClassification, "assetClassification is required");
		query.where(imageDocument.assetClassification.eq(assetClassification));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetInventoryRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByAssetInventoryRecord(AssetInventoryRecord assetInventoryRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(assetInventoryRecord, "assetInventoryRecord is required");
		query.where(imageDocument.assetInventoryRecord.eq(assetInventoryRecord));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetStatus
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByAssetStatus(AssetStatus assetStatus, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(assetStatus, "assetStatus is required");
		query.where(imageDocument.assetStatus.eq(assetStatus));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetStatusChangeRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByAssetStatusChangeRecord(AssetStatusChangeRecord assetStatusChangeRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(assetStatusChangeRecord, "assetStatusChangeRecord is required");
		query.where(imageDocument.assetStatusChangeRecord.eq(assetStatusChangeRecord));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param autonomousMaintenanceFinding
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByAutonomousMaintenanceFinding(
			AutonomousMaintenanceFinding autonomousMaintenanceFinding, GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(autonomousMaintenanceFinding, "autonomousMaintenanceFinding is required");
		query.where(imageDocument.autonomousMaintenanceFinding.eq(autonomousMaintenanceFinding));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param costCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByCostCenter(CostCenter costCenter, GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(costCenter, "costCenter is required");
		query.where(imageDocument.costCenter.eq(costCenter));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param criticalClassification
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByCriticalClassification(CriticalClassification criticalClassification,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(criticalClassification, "criticalClassification is required");
		query.where(imageDocument.criticalClassification.eq(criticalClassification));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param employee
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByEmployee(Employee employee, GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(employee, "employee is required");
		query.where(imageDocument.employee.eq(employee));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByEquipment(Equipment equipment, GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(equipment, "equipment is required");
		query.where(imageDocument.equipment.eq(equipment));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentLubrication
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByEquipmentLubrication(EquipmentLubrication equipmentLubrication,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(equipmentLubrication, "equipmentLubrication is required");
		query.where(imageDocument.equipmentLubrication.eq(equipmentLubrication));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentMaintenanceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByEquipmentMaintenanceRecord(EquipmentMaintenanceRecord equipmentMaintenanceRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(equipmentMaintenanceRecord, "equipmentMaintenanceRecord is required");
		query.where(imageDocument.equipmentMaintenanceRecord.eq(equipmentMaintenanceRecord));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentParameter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByEquipmentParameter(EquipmentParameter equipmentParameter,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(equipmentParameter, "equipmentParameter is required");
		query.where(imageDocument.equipmentParameter.eq(equipmentParameter));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentReplaceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByEquipmentReplaceRecord(EquipmentReplaceRecord equipmentReplaceRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(equipmentReplaceRecord, "equipmentReplaceRecord is required");
		query.where(imageDocument.equipmentReplaceRecord.eq(equipmentReplaceRecord));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentScrappingRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByEquipmentScrappingRecord(EquipmentScrappingRecord equipmentScrappingRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(equipmentScrappingRecord, "equipmentScrappingRecord is required");
		query.where(imageDocument.equipmentScrappingRecord.eq(equipmentScrappingRecord));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param failureMaintenanceReport
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByFailureMaintenanceReport(FailureMaintenanceReport failureMaintenanceReport,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(failureMaintenanceReport, "failureMaintenanceReport is required");
		query.where(imageDocument.failureMaintenanceReport.eq(failureMaintenanceReport));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param functionalLocation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByFunctionalLocation(FunctionalLocation functionalLocation,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(functionalLocation, "functionalLocation is required");
		query.where(imageDocument.functionalLocation.eq(functionalLocation));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param instockDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByInstockDetail(InstockDetail instockDetail, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(instockDetail, "instockDetail is required");
		query.where(imageDocument.instockDetail.eq(instockDetail));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByLotoDetail(LotoDetail lotoDetail, GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(lotoDetail, "lotoDetail is required");
		query.where(imageDocument.lotoDetail.eq(lotoDetail));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoInfo
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByLotoInfo(LotoInfo lotoInfo, GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(lotoInfo, "lotoInfo is required");
		query.where(imageDocument.lotoInfo.eq(lotoInfo));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoIssueReport
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByLotoIssueReport(LotoIssueReport lotoIssueReport, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(lotoIssueReport, "lotoIssueReport is required");
		query.where(imageDocument.lotoIssueReport.eq(lotoIssueReport));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByMaterialCatalog(MaterialCatalog materialCatalog, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(materialCatalog, "materialCatalog is required");
		query.where(imageDocument.materialCatalog.eq(materialCatalog));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param measuringPoint
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByMeasuringPoint(MeasuringPoint measuringPoint, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(measuringPoint, "measuringPoint is required");
		query.where(imageDocument.measuringPoint.eq(measuringPoint));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param measuringRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByMeasuringRecord(MeasuringRecord measuringRecord, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(measuringRecord, "measuringRecord is required");
		query.where(imageDocument.measuringRecord.eq(measuringRecord));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationItem
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByNotificationItem(NotificationItem notificationItem, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(notificationItem, "notificationItem is required");
		query.where(imageDocument.notificationItem.eq(notificationItem));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param outstockDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByOutstockDetail(OutstockDetail outstockDetail, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(outstockDetail, "outstockDetail is required");
		query.where(imageDocument.outstockDetail.eq(outstockDetail));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partMaintenanceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByPartMaintenanceRecord(PartMaintenanceRecord partMaintenanceRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(partMaintenanceRecord, "partMaintenanceRecord is required");
		query.where(imageDocument.partMaintenanceRecord.eq(partMaintenanceRecord));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partReplaceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByPartReplaceRecord(PartReplaceRecord partReplaceRecord, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(partReplaceRecord, "partReplaceRecord is required");
		query.where(imageDocument.partReplaceRecord.eq(partReplaceRecord));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partScrappingRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByPartScrappingRecord(PartScrappingRecord partScrappingRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(partScrappingRecord, "partScrappingRecord is required");
		query.where(imageDocument.partScrappingRecord.eq(partScrappingRecord));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceContent
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByPreventiveMaintenanceContent(
			PreventiveMaintenanceContent preventiveMaintenanceContent, GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(preventiveMaintenanceContent, "preventiveMaintenanceContent is required");
		query.where(imageDocument.preventiveMaintenanceContent.eq(preventiveMaintenanceContent));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceExecution
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByPreventiveMaintenanceExecution(
			PreventiveMaintenanceExecution preventiveMaintenanceExecution, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(preventiveMaintenanceExecution, "preventiveMaintenanceExecution is required");
		query.where(imageDocument.preventiveMaintenanceExecution.eq(preventiveMaintenanceExecution));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceFinding
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByPreventiveMaintenanceFinding(
			PreventiveMaintenanceFinding preventiveMaintenanceFinding, GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(preventiveMaintenanceFinding, "preventiveMaintenanceFinding is required");
		query.where(imageDocument.preventiveMaintenanceFinding.eq(preventiveMaintenanceFinding));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceStandard
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByPreventiveMaintenanceStandard(
			PreventiveMaintenanceStandard preventiveMaintenanceStandard, GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(preventiveMaintenanceStandard, "preventiveMaintenanceStandard is required");
		query.where(imageDocument.preventiveMaintenanceStandard.eq(preventiveMaintenanceStandard));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementItemDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByProcurementItemDetail(ProcurementItemDetail procurementItemDetail,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(procurementItemDetail, "procurementItemDetail is required");
		query.where(imageDocument.procurementItemDetail.eq(procurementItemDetail));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrder
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByProcurementOrder(ProcurementOrder procurementOrder, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(procurementOrder, "procurementOrder is required");
		query.where(imageDocument.procurementOrder.eq(procurementOrder));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrderFinanceTracking
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByProcurementOrderFinanceTracking(
			ProcurementOrderFinanceTracking procurementOrderFinanceTracking, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(procurementOrderFinanceTracking, "procurementOrderFinanceTracking is required");
		query.where(imageDocument.procurementOrderFinanceTracking.eq(procurementOrderFinanceTracking));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementRequest
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByProcurementRequest(ProcurementRequest procurementRequest,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(procurementRequest, "procurementRequest is required");
		query.where(imageDocument.procurementRequest.eq(procurementRequest));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param purchaseExpedite
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByPurchaseExpedite(PurchaseExpedite purchaseExpedite, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(purchaseExpedite, "purchaseExpedite is required");
		query.where(imageDocument.purchaseExpedite.eq(purchaseExpedite));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceReceiveDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByServiceReceiveDetail(ServiceReceiveDetail serviceReceiveDetail,
			GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(serviceReceiveDetail, "serviceReceiveDetail is required");
		query.where(imageDocument.serviceReceiveDetail.eq(serviceReceiveDetail));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param systemBugReport
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findBySystemBugReport(BugReport systemBugReport, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(systemBugReport, "systemBugReport is required");
		query.where(imageDocument.systemBugReport.eq(systemBugReport));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTracking
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByTaskTracking(TaskTracking taskTracking, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(taskTracking, "taskTracking is required");
		query.where(imageDocument.taskTracking.eq(taskTracking));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByTechnicalObject(TechnicalObject technicalObject, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(technicalObject, "technicalObject is required");
		query.where(imageDocument.technicalObject.eq(technicalObject));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workLog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByWorkLog(WorkLog workLog, GlobalSearch globalSearch, Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(workLog, "workLog is required");
		query.where(imageDocument.workLog.eq(workLog));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderHeader
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ImageDocument> findByWorkOrderHeader(WorkOrderHeader workOrderHeader, GlobalSearch globalSearch,
			Pageable pageable) {
		QImageDocument imageDocument = QImageDocument.imageDocument;
		JPQLQuery<ImageDocument> query = from(imageDocument);
		Assert.notNull(workOrderHeader, "workOrderHeader is required");
		query.where(imageDocument.workOrderHeader.eq(workOrderHeader));
		Path<?>[] paths = new Path<?>[] { imageDocument.fileName, imageDocument.description, imageDocument.fileType,
				imageDocument.imageEncode, imageDocument.uploadDate, imageDocument.lotoInfo,
				imageDocument.lotoIssueReport, imageDocument.assetInventoryRecord, imageDocument.lotoDetail,
				imageDocument.uploader, imageDocument.notificationItem, imageDocument.systemBugReport,
				imageDocument.taskTracking, imageDocument.workLog, imageDocument.preventiveMaintenanceFinding,
				imageDocument.autonomousMaintenanceFinding, imageDocument.failureMaintenanceReport,
				imageDocument.workOrderHeader, imageDocument.functionalLocation, imageDocument.equipment,
				imageDocument.materialCatalog, imageDocument.measuringPoint, imageDocument.measuringRecord,
				imageDocument.equipmentMaintenanceRecord, imageDocument.partMaintenanceRecord,
				imageDocument.equipmentReplaceRecord, imageDocument.partReplaceRecord,
				imageDocument.equipmentScrappingRecord, imageDocument.partScrappingRecord,
				imageDocument.equipmentParameter, imageDocument.preventiveMaintenanceStandard,
				imageDocument.preventiveMaintenanceContent, imageDocument.preventiveMaintenanceExecution,
				imageDocument.procurementRequest, imageDocument.procurementOrder, imageDocument.procurementItemDetail,
				imageDocument.assetClassification, imageDocument.assetStatus, imageDocument.assetStatusChangeRecord,
				imageDocument.criticalClassification, imageDocument.costCenter, imageDocument.employee,
				imageDocument.purchaseExpedite, imageDocument.instockDetail, imageDocument.outstockDetail,
				imageDocument.technicalObject, imageDocument.equipmentLubrication, imageDocument.serviceReceiveDetail,
				imageDocument.procurementOrderFinanceTracking, imageDocument.recordStatus, imageDocument.createdDate,
				imageDocument.createdBy, imageDocument.lastModifiedDate, imageDocument.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, imageDocument.fileName)
				.map(DESCRIPTION, imageDocument.description).map(FILE_TYPE, imageDocument.fileType)
				.map(IMAGE_ENCODE, imageDocument.imageEncode).map(UPLOAD_DATE, imageDocument.uploadDate)
				.map(LOTO_INFO, imageDocument.lotoInfo).map(LOTO_ISSUE_REPORT, imageDocument.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, imageDocument.assetInventoryRecord)
				.map(LOTO_DETAIL, imageDocument.lotoDetail).map(UPLOADER, imageDocument.uploader)
				.map(NOTIFICATION_ITEM, imageDocument.notificationItem)
				.map(SYSTEM_BUG_REPORT, imageDocument.systemBugReport).map(TASK_TRACKING, imageDocument.taskTracking)
				.map(WORK_LOG, imageDocument.workLog)
				.map(PREVENTIVE_MAINTENANCE_FINDING, imageDocument.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, imageDocument.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, imageDocument.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, imageDocument.workOrderHeader)
				.map(FUNCTIONAL_LOCATION, imageDocument.functionalLocation).map(EQUIPMENT, imageDocument.equipment)
				.map(MATERIAL_CATALOG, imageDocument.materialCatalog).map(MEASURING_POINT, imageDocument.measuringPoint)
				.map(MEASURING_RECORD, imageDocument.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, imageDocument.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, imageDocument.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, imageDocument.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, imageDocument.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, imageDocument.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, imageDocument.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, imageDocument.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, imageDocument.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, imageDocument.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, imageDocument.preventiveMaintenanceExecution)
				.map(PROCUREMENT_REQUEST, imageDocument.procurementRequest)
				.map(PROCUREMENT_ORDER, imageDocument.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, imageDocument.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, imageDocument.assetClassification)
				.map(ASSET_STATUS, imageDocument.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, imageDocument.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, imageDocument.criticalClassification)
				.map(COST_CENTER, imageDocument.costCenter).map(EMPLOYEE, imageDocument.employee)
				.map(PURCHASE_EXPEDITE, imageDocument.purchaseExpedite).map(INSTOCK_DETAIL, imageDocument.instockDetail)
				.map(OUTSTOCK_DETAIL, imageDocument.outstockDetail).map(TECHNICAL_OBJECT, imageDocument.technicalObject)
				.map(EQUIPMENT_LUBRICATION, imageDocument.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, imageDocument.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, imageDocument.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, imageDocument.recordStatus).map(CREATED_DATE, imageDocument.createdDate)
				.map(CREATED_BY, imageDocument.createdBy).map(LAST_MODIFIED_DATE, imageDocument.lastModifiedDate)
				.map(LAST_MODIFIED_BY, imageDocument.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, imageDocument);
	}
}
