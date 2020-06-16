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

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = DocumentRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "document", path = "document")
public interface DocumentRepository extends  DocumentRepositoryCustom,
		PagingAndSortingRepository<Document, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentReplaceRecord
	 * @return Long
	 */
	public abstract long countByEquipmentReplaceRecord(EquipmentReplaceRecord equipmentReplaceRecord);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetClassification
	 * @return Long
	 */
	public abstract long countByAssetClassification(AssetClassification assetClassification);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceReceiveDetail
	 * @return Long
	 */
	public abstract long countByServiceReceiveDetail(ServiceReceiveDetail serviceReceiveDetail);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentMaintenanceRecord
	 * @return Long
	 */
	public abstract long countByEquipmentMaintenanceRecord(EquipmentMaintenanceRecord equipmentMaintenanceRecord);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @return Long
	 */
	public abstract long countByTechnicalObject(TechnicalObject technicalObject);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoIssueReport
	 * @return Long
	 */
	public abstract long countByLotoIssueReport(LotoIssueReport lotoIssueReport);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param employee
	 * @return Long
	 */
	public abstract long countByEmployee(Employee employee);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetStatusChangeRecord
	 * @return Long
	 */
	public abstract long countByAssetStatusChangeRecord(AssetStatusChangeRecord assetStatusChangeRecord);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoInfo
	 * @return Long
	 */
	public abstract long countByLotoInfo(LotoInfo lotoInfo);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param taskTracking
	 * @return Long
	 */
	public abstract long countByTaskTracking(TaskTracking taskTracking);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderHeader
	 * @return Long
	 */
	public abstract long countByWorkOrderHeader(WorkOrderHeader workOrderHeader);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementRequest
	 * @return Long
	 */
	public abstract long countByProcurementRequest(ProcurementRequest procurementRequest);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @return Long
	 */
	public abstract long countByMaterialCatalog(MaterialCatalog materialCatalog);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partReplaceRecord
	 * @return Long
	 */
	public abstract long countByPartReplaceRecord(PartReplaceRecord partReplaceRecord);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceStandard
	 * @return Long
	 */
	public abstract long countByPreventiveMaintenanceStandard(
			PreventiveMaintenanceStandard preventiveMaintenanceStandard);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workLog
	 * @return Long
	 */
	public abstract long countByWorkLog(WorkLog workLog);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param failureMaintenanceReport
	 * @return Long
	 */
	public abstract long countByFailureMaintenanceReport(FailureMaintenanceReport failureMaintenanceReport);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationItem
	 * @return Long
	 */
	public abstract long countByNotificationItem(NotificationItem notificationItem);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param autonomousMaintenanceFinding
	 * @return Long
	 */
	public abstract long countByAutonomousMaintenanceFinding(AutonomousMaintenanceFinding autonomousMaintenanceFinding);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param outstockDetail
	 * @return Long
	 */
	public abstract long countByOutstockDetail(OutstockDetail outstockDetail);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrderFinanceTracking
	 * @return Long
	 */
	public abstract long countByProcurementOrderFinanceTracking(
			ProcurementOrderFinanceTracking procurementOrderFinanceTracking);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param instockDetail
	 * @return Long
	 */
	public abstract long countByInstockDetail(InstockDetail instockDetail);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param costCenter
	 * @return Long
	 */
	public abstract long countByCostCenter(CostCenter costCenter);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param measuringPoint
	 * @return Long
	 */
	public abstract long countByMeasuringPoint(MeasuringPoint measuringPoint);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @return Long
	 */
	public abstract long countByEquipment(Equipment equipment);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetInventoryRecord
	 * @return Long
	 */
	public abstract long countByAssetInventoryRecord(AssetInventoryRecord assetInventoryRecord);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentParameter
	 * @return Long
	 */
	public abstract long countByEquipmentParameter(EquipmentParameter equipmentParameter);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param purchaseExpedite
	 * @return Long
	 */
	public abstract long countByPurchaseExpedite(PurchaseExpedite purchaseExpedite);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partScrappingRecord
	 * @return Long
	 */
	public abstract long countByPartScrappingRecord(PartScrappingRecord partScrappingRecord);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementItemDetail
	 * @return Long
	 */
	public abstract long countByProcurementItemDetail(ProcurementItemDetail procurementItemDetail);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param criticalClassification
	 * @return Long
	 */
	public abstract long countByCriticalClassification(CriticalClassification criticalClassification);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceContent
	 * @return Long
	 */
	public abstract long countByPreventiveMaintenanceContent(PreventiveMaintenanceContent preventiveMaintenanceContent);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceFinding
	 * @return Long
	 */
	public abstract long countByPreventiveMaintenanceFinding(PreventiveMaintenanceFinding preventiveMaintenanceFinding);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param measuringRecord
	 * @return Long
	 */
	public abstract long countByMeasuringRecord(MeasuringRecord measuringRecord);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceExecution
	 * @return Long
	 */
	public abstract long countByPreventiveMaintenanceExecution(
			PreventiveMaintenanceExecution preventiveMaintenanceExecution);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param functionalLocation
	 * @return Long
	 */
	public abstract long countByFunctionalLocation(FunctionalLocation functionalLocation);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrder
	 * @return Long
	 */
	public abstract long countByProcurementOrder(ProcurementOrder procurementOrder);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param systemBugReport
	 * @return Long
	 */
	public abstract long countBySystemBugReport(BugReport systemBugReport);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param partMaintenanceRecord
	 * @return Long
	 */
	public abstract long countByPartMaintenanceRecord(PartMaintenanceRecord partMaintenanceRecord);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoDetail
	 * @return Long
	 */
	public abstract long countByLotoDetail(LotoDetail lotoDetail);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentScrappingRecord
	 * @return Long
	 */
	public abstract long countByEquipmentScrappingRecord(EquipmentScrappingRecord equipmentScrappingRecord);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetStatus
	 * @return Long
	 */
	public abstract long countByAssetStatus(AssetStatus assetStatus);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentLubrication
	 * @return Long
	 */
	public abstract long countByEquipmentLubrication(EquipmentLubrication equipmentLubrication);
}
