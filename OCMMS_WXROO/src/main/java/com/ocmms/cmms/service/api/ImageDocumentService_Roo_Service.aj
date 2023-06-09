// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.asset.AssetClassification;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import com.ocmms.cmms.model.asset.AssetStatus;
import com.ocmms.cmms.model.asset.AssetStatusChangeRecord;
import com.ocmms.cmms.model.assistance.TaskTracking;
import com.ocmms.cmms.model.assistance.WorkLog;
import com.ocmms.cmms.model.edm.ImageDocument;
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
import com.ocmms.cmms.service.api.ImageDocumentService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect ImageDocumentService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return ImageDocument
     */
    public abstract ImageDocument ImageDocumentService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imageDocument
     */
    public abstract void ImageDocumentService.delete(ImageDocument imageDocument);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<ImageDocument> ImageDocumentService.save(Iterable<ImageDocument> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void ImageDocumentService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return ImageDocument
     */
    public abstract ImageDocument ImageDocumentService.save(ImageDocument entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return ImageDocument
     */
    public abstract ImageDocument ImageDocumentService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<ImageDocument> ImageDocumentService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<ImageDocument> ImageDocumentService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long ImageDocumentService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByAssetClassification(AssetClassification assetClassification, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetInventoryRecord
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByAssetInventoryRecord(AssetInventoryRecord assetInventoryRecord, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetStatus
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByAssetStatus(AssetStatus assetStatus, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetStatusChangeRecord
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByAssetStatusChangeRecord(AssetStatusChangeRecord assetStatusChangeRecord, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param autonomousMaintenanceFinding
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByAutonomousMaintenanceFinding(AutonomousMaintenanceFinding autonomousMaintenanceFinding, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param costCenter
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByCostCenter(CostCenter costCenter, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param criticalClassification
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByCriticalClassification(CriticalClassification criticalClassification, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employee
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByEmployee(Employee employee, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByEquipment(Equipment equipment, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentLubrication
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByEquipmentLubrication(EquipmentLubrication equipmentLubrication, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByEquipmentMaintenanceRecord(EquipmentMaintenanceRecord equipmentMaintenanceRecord, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentParameter
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByEquipmentParameter(EquipmentParameter equipmentParameter, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentReplaceRecord
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByEquipmentReplaceRecord(EquipmentReplaceRecord equipmentReplaceRecord, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentScrappingRecord
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByEquipmentScrappingRecord(EquipmentScrappingRecord equipmentScrappingRecord, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReport
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByFailureMaintenanceReport(FailureMaintenanceReport failureMaintenanceReport, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param functionalLocation
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByFunctionalLocation(FunctionalLocation functionalLocation, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param instockDetail
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByInstockDetail(InstockDetail instockDetail, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoDetail
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByLotoDetail(LotoDetail lotoDetail, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoInfo
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByLotoInfo(LotoInfo lotoInfo, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoIssueReport
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByLotoIssueReport(LotoIssueReport lotoIssueReport, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByMaterialCatalog(MaterialCatalog materialCatalog, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringPoint
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByMeasuringPoint(MeasuringPoint measuringPoint, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringRecord
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByMeasuringRecord(MeasuringRecord measuringRecord, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationItem
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByNotificationItem(NotificationItem notificationItem, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param outstockDetail
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByOutstockDetail(OutstockDetail outstockDetail, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partMaintenanceRecord
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByPartMaintenanceRecord(PartMaintenanceRecord partMaintenanceRecord, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partReplaceRecord
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByPartReplaceRecord(PartReplaceRecord partReplaceRecord, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partScrappingRecord
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByPartScrappingRecord(PartScrappingRecord partScrappingRecord, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContent
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByPreventiveMaintenanceContent(PreventiveMaintenanceContent preventiveMaintenanceContent, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceExecution
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByPreventiveMaintenanceExecution(PreventiveMaintenanceExecution preventiveMaintenanceExecution, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceFinding
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByPreventiveMaintenanceFinding(PreventiveMaintenanceFinding preventiveMaintenanceFinding, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceStandard
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByPreventiveMaintenanceStandard(PreventiveMaintenanceStandard preventiveMaintenanceStandard, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementItemDetail
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByProcurementItemDetail(ProcurementItemDetail procurementItemDetail, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByProcurementOrder(ProcurementOrder procurementOrder, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrderFinanceTracking
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByProcurementOrderFinanceTracking(ProcurementOrderFinanceTracking procurementOrderFinanceTracking, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementRequest
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByProcurementRequest(ProcurementRequest procurementRequest, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseExpedite
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByPurchaseExpedite(PurchaseExpedite purchaseExpedite, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceReceiveDetail
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByServiceReceiveDetail(ServiceReceiveDetail serviceReceiveDetail, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemBugReport
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findBySystemBugReport(BugReport systemBugReport, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskTracking
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByTaskTracking(TaskTracking taskTracking, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param technicalObject
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByTechnicalObject(TechnicalObject technicalObject, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workLog
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByWorkLog(WorkLog workLog, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeader
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<ImageDocument> ImageDocumentService.findByWorkOrderHeader(WorkOrderHeader workOrderHeader, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @return Long
     */
    public abstract long ImageDocumentService.countByAssetClassification(AssetClassification assetClassification);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetInventoryRecord
     * @return Long
     */
    public abstract long ImageDocumentService.countByAssetInventoryRecord(AssetInventoryRecord assetInventoryRecord);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetStatus
     * @return Long
     */
    public abstract long ImageDocumentService.countByAssetStatus(AssetStatus assetStatus);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetStatusChangeRecord
     * @return Long
     */
    public abstract long ImageDocumentService.countByAssetStatusChangeRecord(AssetStatusChangeRecord assetStatusChangeRecord);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param autonomousMaintenanceFinding
     * @return Long
     */
    public abstract long ImageDocumentService.countByAutonomousMaintenanceFinding(AutonomousMaintenanceFinding autonomousMaintenanceFinding);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param costCenter
     * @return Long
     */
    public abstract long ImageDocumentService.countByCostCenter(CostCenter costCenter);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param criticalClassification
     * @return Long
     */
    public abstract long ImageDocumentService.countByCriticalClassification(CriticalClassification criticalClassification);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employee
     * @return Long
     */
    public abstract long ImageDocumentService.countByEmployee(Employee employee);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @return Long
     */
    public abstract long ImageDocumentService.countByEquipment(Equipment equipment);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentLubrication
     * @return Long
     */
    public abstract long ImageDocumentService.countByEquipmentLubrication(EquipmentLubrication equipmentLubrication);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @return Long
     */
    public abstract long ImageDocumentService.countByEquipmentMaintenanceRecord(EquipmentMaintenanceRecord equipmentMaintenanceRecord);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentParameter
     * @return Long
     */
    public abstract long ImageDocumentService.countByEquipmentParameter(EquipmentParameter equipmentParameter);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentReplaceRecord
     * @return Long
     */
    public abstract long ImageDocumentService.countByEquipmentReplaceRecord(EquipmentReplaceRecord equipmentReplaceRecord);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentScrappingRecord
     * @return Long
     */
    public abstract long ImageDocumentService.countByEquipmentScrappingRecord(EquipmentScrappingRecord equipmentScrappingRecord);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param failureMaintenanceReport
     * @return Long
     */
    public abstract long ImageDocumentService.countByFailureMaintenanceReport(FailureMaintenanceReport failureMaintenanceReport);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param functionalLocation
     * @return Long
     */
    public abstract long ImageDocumentService.countByFunctionalLocation(FunctionalLocation functionalLocation);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param instockDetail
     * @return Long
     */
    public abstract long ImageDocumentService.countByInstockDetail(InstockDetail instockDetail);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoDetail
     * @return Long
     */
    public abstract long ImageDocumentService.countByLotoDetail(LotoDetail lotoDetail);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoInfo
     * @return Long
     */
    public abstract long ImageDocumentService.countByLotoInfo(LotoInfo lotoInfo);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param lotoIssueReport
     * @return Long
     */
    public abstract long ImageDocumentService.countByLotoIssueReport(LotoIssueReport lotoIssueReport);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @return Long
     */
    public abstract long ImageDocumentService.countByMaterialCatalog(MaterialCatalog materialCatalog);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringPoint
     * @return Long
     */
    public abstract long ImageDocumentService.countByMeasuringPoint(MeasuringPoint measuringPoint);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringRecord
     * @return Long
     */
    public abstract long ImageDocumentService.countByMeasuringRecord(MeasuringRecord measuringRecord);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationItem
     * @return Long
     */
    public abstract long ImageDocumentService.countByNotificationItem(NotificationItem notificationItem);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param outstockDetail
     * @return Long
     */
    public abstract long ImageDocumentService.countByOutstockDetail(OutstockDetail outstockDetail);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partMaintenanceRecord
     * @return Long
     */
    public abstract long ImageDocumentService.countByPartMaintenanceRecord(PartMaintenanceRecord partMaintenanceRecord);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partReplaceRecord
     * @return Long
     */
    public abstract long ImageDocumentService.countByPartReplaceRecord(PartReplaceRecord partReplaceRecord);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partScrappingRecord
     * @return Long
     */
    public abstract long ImageDocumentService.countByPartScrappingRecord(PartScrappingRecord partScrappingRecord);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceContent
     * @return Long
     */
    public abstract long ImageDocumentService.countByPreventiveMaintenanceContent(PreventiveMaintenanceContent preventiveMaintenanceContent);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceExecution
     * @return Long
     */
    public abstract long ImageDocumentService.countByPreventiveMaintenanceExecution(PreventiveMaintenanceExecution preventiveMaintenanceExecution);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceFinding
     * @return Long
     */
    public abstract long ImageDocumentService.countByPreventiveMaintenanceFinding(PreventiveMaintenanceFinding preventiveMaintenanceFinding);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceStandard
     * @return Long
     */
    public abstract long ImageDocumentService.countByPreventiveMaintenanceStandard(PreventiveMaintenanceStandard preventiveMaintenanceStandard);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementItemDetail
     * @return Long
     */
    public abstract long ImageDocumentService.countByProcurementItemDetail(ProcurementItemDetail procurementItemDetail);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @return Long
     */
    public abstract long ImageDocumentService.countByProcurementOrder(ProcurementOrder procurementOrder);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrderFinanceTracking
     * @return Long
     */
    public abstract long ImageDocumentService.countByProcurementOrderFinanceTracking(ProcurementOrderFinanceTracking procurementOrderFinanceTracking);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementRequest
     * @return Long
     */
    public abstract long ImageDocumentService.countByProcurementRequest(ProcurementRequest procurementRequest);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseExpedite
     * @return Long
     */
    public abstract long ImageDocumentService.countByPurchaseExpedite(PurchaseExpedite purchaseExpedite);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param serviceReceiveDetail
     * @return Long
     */
    public abstract long ImageDocumentService.countByServiceReceiveDetail(ServiceReceiveDetail serviceReceiveDetail);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemBugReport
     * @return Long
     */
    public abstract long ImageDocumentService.countBySystemBugReport(BugReport systemBugReport);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskTracking
     * @return Long
     */
    public abstract long ImageDocumentService.countByTaskTracking(TaskTracking taskTracking);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param technicalObject
     * @return Long
     */
    public abstract long ImageDocumentService.countByTechnicalObject(TechnicalObject technicalObject);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workLog
     * @return Long
     */
    public abstract long ImageDocumentService.countByWorkLog(WorkLog workLog);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeader
     * @return Long
     */
    public abstract long ImageDocumentService.countByWorkOrderHeader(WorkOrderHeader workOrderHeader);
    
}
