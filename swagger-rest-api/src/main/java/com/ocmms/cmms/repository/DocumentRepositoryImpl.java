package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.asset.AssetClassification;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import com.ocmms.cmms.model.asset.AssetStatus;
import com.ocmms.cmms.model.asset.AssetStatusChangeRecord;
import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.assistance.WorkLog;
import com.ocmms.cmms.model.edm.QDocument;
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
 * = DocumentRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class DocumentRepositoryImpl extends QueryDslRepositorySupportExt<Document> implements DocumentRepositoryCustom {

	/**
	 * Default constructor
	 */
	DocumentRepositoryImpl() {
		super(Document.class);
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
	public Page<Document> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(document.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetClassification
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByAssetClassification(AssetClassification assetClassification, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(assetClassification, "assetClassification is required");
		query.where(document.assetClassification.eq(assetClassification));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetInventoryRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByAssetInventoryRecord(AssetInventoryRecord assetInventoryRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(assetInventoryRecord, "assetInventoryRecord is required");
		query.where(document.assetInventoryRecord.eq(assetInventoryRecord));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetStatus
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByAssetStatus(AssetStatus assetStatus, GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(assetStatus, "assetStatus is required");
		query.where(document.assetStatus.eq(assetStatus));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetStatusChangeRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByAssetStatusChangeRecord(AssetStatusChangeRecord assetStatusChangeRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(assetStatusChangeRecord, "assetStatusChangeRecord is required");
		query.where(document.assetStatusChangeRecord.eq(assetStatusChangeRecord));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param autonomousMaintenanceFinding
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByAutonomousMaintenanceFinding(AutonomousMaintenanceFinding autonomousMaintenanceFinding,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(autonomousMaintenanceFinding, "autonomousMaintenanceFinding is required");
		query.where(document.autonomousMaintenanceFinding.eq(autonomousMaintenanceFinding));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param costCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByCostCenter(CostCenter costCenter, GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(costCenter, "costCenter is required");
		query.where(document.costCenter.eq(costCenter));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param criticalClassification
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByCriticalClassification(CriticalClassification criticalClassification,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(criticalClassification, "criticalClassification is required");
		query.where(document.criticalClassification.eq(criticalClassification));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param employee
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByEmployee(Employee employee, GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(employee, "employee is required");
		query.where(document.employee.eq(employee));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByEquipment(Equipment equipment, GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(equipment, "equipment is required");
		query.where(document.equipment.eq(equipment));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentLubrication
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByEquipmentLubrication(EquipmentLubrication equipmentLubrication,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(equipmentLubrication, "equipmentLubrication is required");
		query.where(document.equipmentLubrication.eq(equipmentLubrication));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentMaintenanceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByEquipmentMaintenanceRecord(EquipmentMaintenanceRecord equipmentMaintenanceRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(equipmentMaintenanceRecord, "equipmentMaintenanceRecord is required");
		query.where(document.equipmentMaintenanceRecord.eq(equipmentMaintenanceRecord));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentParameter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByEquipmentParameter(EquipmentParameter equipmentParameter, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(equipmentParameter, "equipmentParameter is required");
		query.where(document.equipmentParameter.eq(equipmentParameter));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentReplaceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByEquipmentReplaceRecord(EquipmentReplaceRecord equipmentReplaceRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(equipmentReplaceRecord, "equipmentReplaceRecord is required");
		query.where(document.equipmentReplaceRecord.eq(equipmentReplaceRecord));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentScrappingRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByEquipmentScrappingRecord(EquipmentScrappingRecord equipmentScrappingRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(equipmentScrappingRecord, "equipmentScrappingRecord is required");
		query.where(document.equipmentScrappingRecord.eq(equipmentScrappingRecord));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param failureMaintenanceReport
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByFailureMaintenanceReport(FailureMaintenanceReport failureMaintenanceReport,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(failureMaintenanceReport, "failureMaintenanceReport is required");
		query.where(document.failureMaintenanceReport.eq(failureMaintenanceReport));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param functionalLocation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByFunctionalLocation(FunctionalLocation functionalLocation, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(functionalLocation, "functionalLocation is required");
		query.where(document.functionalLocation.eq(functionalLocation));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param instockDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByInstockDetail(InstockDetail instockDetail, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(instockDetail, "instockDetail is required");
		query.where(document.instockDetail.eq(instockDetail));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByLotoDetail(LotoDetail lotoDetail, GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(lotoDetail, "lotoDetail is required");
		query.where(document.lotoDetail.eq(lotoDetail));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoInfo
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByLotoInfo(LotoInfo lotoInfo, GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(lotoInfo, "lotoInfo is required");
		query.where(document.lotoInfo.eq(lotoInfo));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoIssueReport
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByLotoIssueReport(LotoIssueReport lotoIssueReport, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(lotoIssueReport, "lotoIssueReport is required");
		query.where(document.lotoIssueReport.eq(lotoIssueReport));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByMaterialCatalog(MaterialCatalog materialCatalog, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(materialCatalog, "materialCatalog is required");
		query.where(document.materialCatalog.eq(materialCatalog));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param measuringPoint
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByMeasuringPoint(MeasuringPoint measuringPoint, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(measuringPoint, "measuringPoint is required");
		query.where(document.measuringPoint.eq(measuringPoint));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param measuringRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByMeasuringRecord(MeasuringRecord measuringRecord, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(measuringRecord, "measuringRecord is required");
		query.where(document.measuringRecord.eq(measuringRecord));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationItem
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByNotificationItem(NotificationItem notificationItem, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(notificationItem, "notificationItem is required");
		query.where(document.notificationItem.eq(notificationItem));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param outstockDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByOutstockDetail(OutstockDetail outstockDetail, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(outstockDetail, "outstockDetail is required");
		query.where(document.outstockDetail.eq(outstockDetail));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partMaintenanceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByPartMaintenanceRecord(PartMaintenanceRecord partMaintenanceRecord,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(partMaintenanceRecord, "partMaintenanceRecord is required");
		query.where(document.partMaintenanceRecord.eq(partMaintenanceRecord));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partReplaceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByPartReplaceRecord(PartReplaceRecord partReplaceRecord, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(partReplaceRecord, "partReplaceRecord is required");
		query.where(document.partReplaceRecord.eq(partReplaceRecord));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partScrappingRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByPartScrappingRecord(PartScrappingRecord partScrappingRecord, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(partScrappingRecord, "partScrappingRecord is required");
		query.where(document.partScrappingRecord.eq(partScrappingRecord));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceContent
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByPreventiveMaintenanceContent(PreventiveMaintenanceContent preventiveMaintenanceContent,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(preventiveMaintenanceContent, "preventiveMaintenanceContent is required");
		query.where(document.preventiveMaintenanceContent.eq(preventiveMaintenanceContent));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceExecution
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByPreventiveMaintenanceExecution(
			PreventiveMaintenanceExecution preventiveMaintenanceExecution, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(preventiveMaintenanceExecution, "preventiveMaintenanceExecution is required");
		query.where(document.preventiveMaintenanceExecution.eq(preventiveMaintenanceExecution));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceFinding
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByPreventiveMaintenanceFinding(PreventiveMaintenanceFinding preventiveMaintenanceFinding,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(preventiveMaintenanceFinding, "preventiveMaintenanceFinding is required");
		query.where(document.preventiveMaintenanceFinding.eq(preventiveMaintenanceFinding));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceStandard
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByPreventiveMaintenanceStandard(
			PreventiveMaintenanceStandard preventiveMaintenanceStandard, GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(preventiveMaintenanceStandard, "preventiveMaintenanceStandard is required");
		query.where(document.preventiveMaintenanceStandard.eq(preventiveMaintenanceStandard));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementItemDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByProcurementItemDetail(ProcurementItemDetail procurementItemDetail,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(procurementItemDetail, "procurementItemDetail is required");
		query.where(document.procurementItemDetail.eq(procurementItemDetail));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrder
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByProcurementOrder(ProcurementOrder procurementOrder, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(procurementOrder, "procurementOrder is required");
		query.where(document.procurementOrder.eq(procurementOrder));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrderFinanceTracking
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByProcurementOrderFinanceTracking(
			ProcurementOrderFinanceTracking procurementOrderFinanceTracking, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(procurementOrderFinanceTracking, "procurementOrderFinanceTracking is required");
		query.where(document.procurementOrderFinanceTracking.eq(procurementOrderFinanceTracking));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementRequest
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByProcurementRequest(ProcurementRequest procurementRequest, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(procurementRequest, "procurementRequest is required");
		query.where(document.procurementRequest.eq(procurementRequest));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param purchaseExpedite
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByPurchaseExpedite(PurchaseExpedite purchaseExpedite, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(purchaseExpedite, "purchaseExpedite is required");
		query.where(document.purchaseExpedite.eq(purchaseExpedite));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceReceiveDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByServiceReceiveDetail(ServiceReceiveDetail serviceReceiveDetail,
			GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(serviceReceiveDetail, "serviceReceiveDetail is required");
		query.where(document.serviceReceiveDetail.eq(serviceReceiveDetail));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param systemBugReport
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findBySystemBugReport(BugReport systemBugReport, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(systemBugReport, "systemBugReport is required");
		query.where(document.systemBugReport.eq(systemBugReport));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTracking
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByTaskTracking(TaskTracking taskTracking, GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(taskTracking, "taskTracking is required");
		query.where(document.taskTracking.eq(taskTracking));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByTechnicalObject(TechnicalObject technicalObject, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(technicalObject, "technicalObject is required");
		query.where(document.technicalObject.eq(technicalObject));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workLog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByWorkLog(WorkLog workLog, GlobalSearch globalSearch, Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(workLog, "workLog is required");
		query.where(document.workLog.eq(workLog));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderHeader
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Document> findByWorkOrderHeader(WorkOrderHeader workOrderHeader, GlobalSearch globalSearch,
			Pageable pageable) {
		QDocument document = QDocument.document;
		JPQLQuery<Document> query = from(document);
		Assert.notNull(workOrderHeader, "workOrderHeader is required");
		query.where(document.workOrderHeader.eq(workOrderHeader));
		Path<?>[] paths = new Path<?>[] { document.fileName, document.description, document.fileType,
				document.uploadDate, document.lotoInfo, document.lotoIssueReport, document.assetInventoryRecord,
				document.lotoDetail, document.uploader, document.notificationItem, document.systemBugReport,
				document.preventiveMaintenanceFinding, document.autonomousMaintenanceFinding,
				document.failureMaintenanceReport, document.workOrderHeader, document.functionalLocation,
				document.equipment, document.materialCatalog, document.measuringPoint, document.measuringRecord,
				document.equipmentMaintenanceRecord, document.partMaintenanceRecord, document.equipmentReplaceRecord,
				document.partReplaceRecord, document.equipmentScrappingRecord, document.partScrappingRecord,
				document.equipmentParameter, document.preventiveMaintenanceStandard,
				document.preventiveMaintenanceContent, document.preventiveMaintenanceExecution, document.taskTracking,
				document.workLog, document.procurementRequest, document.procurementOrder,
				document.procurementItemDetail, document.assetClassification, document.assetStatus,
				document.assetStatusChangeRecord, document.criticalClassification, document.costCenter,
				document.employee, document.purchaseExpedite, document.instockDetail, document.outstockDetail,
				document.technicalObject, document.equipmentLubrication, document.serviceReceiveDetail,
				document.procurementOrderFinanceTracking, document.recordStatus, document.createdDate,
				document.createdBy, document.lastModifiedDate, document.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(FILE_NAME, document.fileName)
				.map(DESCRIPTION, document.description).map(FILE_TYPE, document.fileType)
				.map(UPLOAD_DATE, document.uploadDate).map(LOTO_INFO, document.lotoInfo)
				.map(LOTO_ISSUE_REPORT, document.lotoIssueReport)
				.map(ASSET_INVENTORY_RECORD, document.assetInventoryRecord).map(LOTO_DETAIL, document.lotoDetail)
				.map(UPLOADER, document.uploader).map(NOTIFICATION_ITEM, document.notificationItem)
				.map(SYSTEM_BUG_REPORT, document.systemBugReport)
				.map(PREVENTIVE_MAINTENANCE_FINDING, document.preventiveMaintenanceFinding)
				.map(AUTONOMOUS_MAINTENANCE_FINDING, document.autonomousMaintenanceFinding)
				.map(FAILURE_MAINTENANCE_REPORT, document.failureMaintenanceReport)
				.map(WORK_ORDER_HEADER, document.workOrderHeader).map(FUNCTIONAL_LOCATION, document.functionalLocation)
				.map(EQUIPMENT, document.equipment).map(MATERIAL_CATALOG, document.materialCatalog)
				.map(MEASURING_POINT, document.measuringPoint).map(MEASURING_RECORD, document.measuringRecord)
				.map(EQUIPMENT_MAINTENANCE_RECORD, document.equipmentMaintenanceRecord)
				.map(PART_MAINTENANCE_RECORD, document.partMaintenanceRecord)
				.map(EQUIPMENT_REPLACE_RECORD, document.equipmentReplaceRecord)
				.map(PART_REPLACE_RECORD, document.partReplaceRecord)
				.map(EQUIPMENT_SCRAPPING_RECORD, document.equipmentScrappingRecord)
				.map(PART_SCRAPPING_RECORD, document.partScrappingRecord)
				.map(EQUIPMENT_PARAMETER, document.equipmentParameter)
				.map(PREVENTIVE_MAINTENANCE_STANDARD, document.preventiveMaintenanceStandard)
				.map(PREVENTIVE_MAINTENANCE_CONTENT, document.preventiveMaintenanceContent)
				.map(PREVENTIVE_MAINTENANCE_EXECUTION, document.preventiveMaintenanceExecution)
				.map(TASK_TRACKING, document.taskTracking).map(WORK_LOG, document.workLog)
				.map(PROCUREMENT_REQUEST, document.procurementRequest).map(PROCUREMENT_ORDER, document.procurementOrder)
				.map(PROCUREMENT_ITEM_DETAIL, document.procurementItemDetail)
				.map(ASSET_CLASSIFICATION, document.assetClassification).map(ASSET_STATUS, document.assetStatus)
				.map(ASSET_STATUS_CHANGE_RECORD, document.assetStatusChangeRecord)
				.map(CRITICAL_CLASSIFICATION, document.criticalClassification).map(COST_CENTER, document.costCenter)
				.map(EMPLOYEE, document.employee).map(PURCHASE_EXPEDITE, document.purchaseExpedite)
				.map(INSTOCK_DETAIL, document.instockDetail).map(OUTSTOCK_DETAIL, document.outstockDetail)
				.map(TECHNICAL_OBJECT, document.technicalObject)
				.map(EQUIPMENT_LUBRICATION, document.equipmentLubrication)
				.map(SERVICE_RECEIVE_DETAIL, document.serviceReceiveDetail)
				.map(PROCUREMENT_ORDER_FINANCE_TRACKING, document.procurementOrderFinanceTracking)
				.map(RECORD_STATUS, document.recordStatus).map(CREATED_DATE, document.createdDate)
				.map(CREATED_BY, document.createdBy).map(LAST_MODIFIED_DATE, document.lastModifiedDate)
				.map(LAST_MODIFIED_BY, document.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, document);
	}
}
