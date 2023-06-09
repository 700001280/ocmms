// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;
import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;
import com.ocmms.cmms.model.pm.workorder.WorkOrderSystemStatus;
import com.ocmms.cmms.model.pm.workorder.WorkOrderType;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithoutNumber;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.web.CostCenterDeserializer;
import com.ocmms.cmms.web.EquipmentDeserializer;
import com.ocmms.cmms.web.FunctionalLocationDeserializer;
import com.ocmms.cmms.web.MainWorkCenterDeserializer;
import com.ocmms.cmms.web.MaintenanceActivityTypeDeserializer;
import com.ocmms.cmms.web.NotificationHeaderDeserializer;
import com.ocmms.cmms.web.NotificationPriorityDeserializer;
import com.ocmms.cmms.web.PlannerGroupDeserializer;
import com.ocmms.cmms.web.PlantLocationDeserializer;
import com.ocmms.cmms.web.PlantSectionDeserializer;
import com.ocmms.cmms.web.RecordStatusDeserializer;
import com.ocmms.cmms.web.SystemConditionDeserializer;
import com.ocmms.cmms.web.WorkOrderHeaderJsonMixin;
import com.ocmms.cmms.web.WorkOrderTypeDeserializer;
import com.ocmms.cmms.web.WorkOrderUserStatusWithNumberDeserializer;
import java.util.Set;

privileged aspect WorkOrderHeaderJsonMixin_Roo_JSONMixin {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<Document> WorkOrderHeaderJsonMixin.documents;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<ImageDocument> WorkOrderHeaderJsonMixin.images;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<WorkOrderUserStatusWithoutNumber> WorkOrderHeaderJsonMixin.mutiUserStatuses;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<WorkOrderSystemStatus> WorkOrderHeaderJsonMixin.systemStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<WorkOrderMaterial> WorkOrderHeaderJsonMixin.workOrderMaterials;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonIgnore
    private Set<WorkOrderOperation> WorkOrderHeaderJsonMixin.workOrderOperations;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = MaintenanceActivityTypeDeserializer.class)
    private MaintenanceActivityType WorkOrderHeaderJsonMixin.activityType;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = CostCenterDeserializer.class)
    private CostCenter WorkOrderHeaderJsonMixin.costCenter;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = EquipmentDeserializer.class)
    private Equipment WorkOrderHeaderJsonMixin.equipment;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = FunctionalLocationDeserializer.class)
    private FunctionalLocation WorkOrderHeaderJsonMixin.functionalLocation;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = MainWorkCenterDeserializer.class)
    private MainWorkCenter WorkOrderHeaderJsonMixin.mainWorkCenter;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = NotificationHeaderDeserializer.class)
    private NotificationHeader WorkOrderHeaderJsonMixin.notificationHeader;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = PlannerGroupDeserializer.class)
    private PlannerGroup WorkOrderHeaderJsonMixin.plannerGroup;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = PlantLocationDeserializer.class)
    private PlantLocation WorkOrderHeaderJsonMixin.plantLocation;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = PlantSectionDeserializer.class)
    private PlantSection WorkOrderHeaderJsonMixin.plantSection;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = NotificationPriorityDeserializer.class)
    private NotificationPriority WorkOrderHeaderJsonMixin.priority;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = RecordStatusDeserializer.class)
    private RecordStatus WorkOrderHeaderJsonMixin.recordStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = SystemConditionDeserializer.class)
    private SystemCondition WorkOrderHeaderJsonMixin.systemCondition;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = WorkOrderUserStatusWithNumberDeserializer.class)
    private WorkOrderUserStatusWithNumber WorkOrderHeaderJsonMixin.userStatus;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    @JsonDeserialize(using = WorkOrderTypeDeserializer.class)
    private WorkOrderType WorkOrderHeaderJsonMixin.workOrderType;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<Document> WorkOrderHeaderJsonMixin.getDocuments() {
        return documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documents
     */
    public void WorkOrderHeaderJsonMixin.setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<ImageDocument> WorkOrderHeaderJsonMixin.getImages() {
        return images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param images
     */
    public void WorkOrderHeaderJsonMixin.setImages(Set<ImageDocument> images) {
        this.images = images;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<WorkOrderUserStatusWithoutNumber> WorkOrderHeaderJsonMixin.getMutiUserStatuses() {
        return mutiUserStatuses;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mutiUserStatuses
     */
    public void WorkOrderHeaderJsonMixin.setMutiUserStatuses(Set<WorkOrderUserStatusWithoutNumber> mutiUserStatuses) {
        this.mutiUserStatuses = mutiUserStatuses;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<WorkOrderSystemStatus> WorkOrderHeaderJsonMixin.getSystemStatus() {
        return systemStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemStatus
     */
    public void WorkOrderHeaderJsonMixin.setSystemStatus(Set<WorkOrderSystemStatus> systemStatus) {
        this.systemStatus = systemStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<WorkOrderMaterial> WorkOrderHeaderJsonMixin.getWorkOrderMaterials() {
        return workOrderMaterials;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderMaterials
     */
    public void WorkOrderHeaderJsonMixin.setWorkOrderMaterials(Set<WorkOrderMaterial> workOrderMaterials) {
        this.workOrderMaterials = workOrderMaterials;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Set
     */
    public Set<WorkOrderOperation> WorkOrderHeaderJsonMixin.getWorkOrderOperations() {
        return workOrderOperations;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderOperations
     */
    public void WorkOrderHeaderJsonMixin.setWorkOrderOperations(Set<WorkOrderOperation> workOrderOperations) {
        this.workOrderOperations = workOrderOperations;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaintenanceActivityType
     */
    public MaintenanceActivityType WorkOrderHeaderJsonMixin.getActivityType() {
        return activityType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param activityType
     */
    public void WorkOrderHeaderJsonMixin.setActivityType(MaintenanceActivityType activityType) {
        this.activityType = activityType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return CostCenter
     */
    public CostCenter WorkOrderHeaderJsonMixin.getCostCenter() {
        return costCenter;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param costCenter
     */
    public void WorkOrderHeaderJsonMixin.setCostCenter(CostCenter costCenter) {
        this.costCenter = costCenter;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Equipment
     */
    public Equipment WorkOrderHeaderJsonMixin.getEquipment() {
        return equipment;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     */
    public void WorkOrderHeaderJsonMixin.setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return FunctionalLocation
     */
    public FunctionalLocation WorkOrderHeaderJsonMixin.getFunctionalLocation() {
        return functionalLocation;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param functionalLocation
     */
    public void WorkOrderHeaderJsonMixin.setFunctionalLocation(FunctionalLocation functionalLocation) {
        this.functionalLocation = functionalLocation;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MainWorkCenter
     */
    public MainWorkCenter WorkOrderHeaderJsonMixin.getMainWorkCenter() {
        return mainWorkCenter;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mainWorkCenter
     */
    public void WorkOrderHeaderJsonMixin.setMainWorkCenter(MainWorkCenter mainWorkCenter) {
        this.mainWorkCenter = mainWorkCenter;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return NotificationHeader
     */
    public NotificationHeader WorkOrderHeaderJsonMixin.getNotificationHeader() {
        return notificationHeader;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationHeader
     */
    public void WorkOrderHeaderJsonMixin.setNotificationHeader(NotificationHeader notificationHeader) {
        this.notificationHeader = notificationHeader;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return PlannerGroup
     */
    public PlannerGroup WorkOrderHeaderJsonMixin.getPlannerGroup() {
        return plannerGroup;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plannerGroup
     */
    public void WorkOrderHeaderJsonMixin.setPlannerGroup(PlannerGroup plannerGroup) {
        this.plannerGroup = plannerGroup;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return PlantLocation
     */
    public PlantLocation WorkOrderHeaderJsonMixin.getPlantLocation() {
        return plantLocation;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantLocation
     */
    public void WorkOrderHeaderJsonMixin.setPlantLocation(PlantLocation plantLocation) {
        this.plantLocation = plantLocation;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return PlantSection
     */
    public PlantSection WorkOrderHeaderJsonMixin.getPlantSection() {
        return plantSection;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantSection
     */
    public void WorkOrderHeaderJsonMixin.setPlantSection(PlantSection plantSection) {
        this.plantSection = plantSection;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return NotificationPriority
     */
    public NotificationPriority WorkOrderHeaderJsonMixin.getPriority() {
        return priority;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param priority
     */
    public void WorkOrderHeaderJsonMixin.setPriority(NotificationPriority priority) {
        this.priority = priority;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return RecordStatus
     */
    public RecordStatus WorkOrderHeaderJsonMixin.getRecordStatus() {
        return recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param recordStatus
     */
    public void WorkOrderHeaderJsonMixin.setRecordStatus(RecordStatus recordStatus) {
        this.recordStatus = recordStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return SystemCondition
     */
    public SystemCondition WorkOrderHeaderJsonMixin.getSystemCondition() {
        return systemCondition;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemCondition
     */
    public void WorkOrderHeaderJsonMixin.setSystemCondition(SystemCondition systemCondition) {
        this.systemCondition = systemCondition;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return WorkOrderUserStatusWithNumber
     */
    public WorkOrderUserStatusWithNumber WorkOrderHeaderJsonMixin.getUserStatus() {
        return userStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param userStatus
     */
    public void WorkOrderHeaderJsonMixin.setUserStatus(WorkOrderUserStatusWithNumber userStatus) {
        this.userStatus = userStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return WorkOrderType
     */
    public WorkOrderType WorkOrderHeaderJsonMixin.getWorkOrderType() {
        return workOrderType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderType
     */
    public void WorkOrderHeaderJsonMixin.setWorkOrderType(WorkOrderType workOrderType) {
        this.workOrderType = workOrderType;
    }
    
}
