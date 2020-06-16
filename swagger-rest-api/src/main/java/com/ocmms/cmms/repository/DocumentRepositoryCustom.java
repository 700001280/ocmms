package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.edm.Document;

import com.ocmms.cmms.model.asset.AssetClassification;
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

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = DocumentRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface DocumentRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentReplaceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByEquipmentReplaceRecord(EquipmentReplaceRecord equipmentReplaceRecord,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetClassification
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByAssetClassification(AssetClassification assetClassification,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceReceiveDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByServiceReceiveDetail(ServiceReceiveDetail serviceReceiveDetail,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentMaintenanceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByEquipmentMaintenanceRecord(
			EquipmentMaintenanceRecord equipmentMaintenanceRecord, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByTechnicalObject(TechnicalObject technicalObject, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoIssueReport
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByLotoIssueReport(LotoIssueReport lotoIssueReport, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param employee
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByEmployee(Employee employee, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetStatusChangeRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByAssetStatusChangeRecord(AssetStatusChangeRecord assetStatusChangeRecord,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoInfo
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByLotoInfo(LotoInfo lotoInfo, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTracking
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByTaskTracking(TaskTracking taskTracking, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderHeader
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByWorkOrderHeader(WorkOrderHeader workOrderHeader, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementRequest
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByProcurementRequest(ProcurementRequest procurementRequest,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByMaterialCatalog(MaterialCatalog materialCatalog, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partReplaceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByPartReplaceRecord(PartReplaceRecord partReplaceRecord,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceStandard
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByPreventiveMaintenanceStandard(
			PreventiveMaintenanceStandard preventiveMaintenanceStandard, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workLog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByWorkLog(WorkLog workLog, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param failureMaintenanceReport
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByFailureMaintenanceReport(FailureMaintenanceReport failureMaintenanceReport,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationItem
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByNotificationItem(NotificationItem notificationItem, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param autonomousMaintenanceFinding
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByAutonomousMaintenanceFinding(
			AutonomousMaintenanceFinding autonomousMaintenanceFinding, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param outstockDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByOutstockDetail(OutstockDetail outstockDetail, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrderFinanceTracking
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByProcurementOrderFinanceTracking(
			ProcurementOrderFinanceTracking procurementOrderFinanceTracking, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param instockDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByInstockDetail(InstockDetail instockDetail, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param costCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByCostCenter(CostCenter costCenter, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param measuringPoint
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByMeasuringPoint(MeasuringPoint measuringPoint, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByEquipment(Equipment equipment, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetInventoryRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByAssetInventoryRecord(AssetInventoryRecord assetInventoryRecord,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentParameter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByEquipmentParameter(EquipmentParameter equipmentParameter,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param purchaseExpedite
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByPurchaseExpedite(PurchaseExpedite purchaseExpedite, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partScrappingRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByPartScrappingRecord(PartScrappingRecord partScrappingRecord,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementItemDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByProcurementItemDetail(ProcurementItemDetail procurementItemDetail,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param criticalClassification
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByCriticalClassification(CriticalClassification criticalClassification,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceContent
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByPreventiveMaintenanceContent(
			PreventiveMaintenanceContent preventiveMaintenanceContent, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceFinding
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByPreventiveMaintenanceFinding(
			PreventiveMaintenanceFinding preventiveMaintenanceFinding, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param measuringRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByMeasuringRecord(MeasuringRecord measuringRecord, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceExecution
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByPreventiveMaintenanceExecution(
			PreventiveMaintenanceExecution preventiveMaintenanceExecution, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param functionalLocation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByFunctionalLocation(FunctionalLocation functionalLocation,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrder
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByProcurementOrder(ProcurementOrder procurementOrder, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param systemBugReport
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findBySystemBugReport(BugReport systemBugReport, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partMaintenanceRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByPartMaintenanceRecord(PartMaintenanceRecord partMaintenanceRecord,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByLotoDetail(LotoDetail lotoDetail, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentScrappingRecord
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByEquipmentScrappingRecord(EquipmentScrappingRecord equipmentScrappingRecord,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetStatus
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByAssetStatus(AssetStatus assetStatus, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentLubrication
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findByEquipmentLubrication(EquipmentLubrication equipmentLubrication,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Document> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
