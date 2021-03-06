// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.impl;

import com.ocmms.cmms.model.hrm.Plant;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.repository.PlantSectionRepository;
import com.ocmms.cmms.service.api.EquipmentService;
import com.ocmms.cmms.service.api.NotificationHeaderService;
import com.ocmms.cmms.service.impl.PlantSectionServiceImpl;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.validation.MessageI18n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

privileged aspect PlantSectionServiceImpl_Roo_Service_Impl {
    
    declare @type: PlantSectionServiceImpl: @Service;
    
    declare @type: PlantSectionServiceImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PlantSectionRepository PlantSectionServiceImpl.plantSectionRepository;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private NotificationHeaderService PlantSectionServiceImpl.notificationHeaderService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private EquipmentService PlantSectionServiceImpl.equipmentService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param plantSectionRepository
     * @param notificationHeaderService
     * @param equipmentService
     */
    @Autowired
    public PlantSectionServiceImpl.new(PlantSectionRepository plantSectionRepository, @Lazy NotificationHeaderService notificationHeaderService, @Lazy EquipmentService equipmentService) {
        setPlantSectionRepository(plantSectionRepository);
        setNotificationHeaderService(notificationHeaderService);
        setEquipmentService(equipmentService);
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PlantSectionRepository
     */
    public PlantSectionRepository PlantSectionServiceImpl.getPlantSectionRepository() {
        return plantSectionRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantSectionRepository
     */
    public void PlantSectionServiceImpl.setPlantSectionRepository(PlantSectionRepository plantSectionRepository) {
        this.plantSectionRepository = plantSectionRepository;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return NotificationHeaderService
     */
    public NotificationHeaderService PlantSectionServiceImpl.getNotificationHeaderService() {
        return notificationHeaderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationHeaderService
     */
    public void PlantSectionServiceImpl.setNotificationHeaderService(NotificationHeaderService notificationHeaderService) {
        this.notificationHeaderService = notificationHeaderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return EquipmentService
     */
    public EquipmentService PlantSectionServiceImpl.getEquipmentService() {
        return equipmentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentService
     */
    public void PlantSectionServiceImpl.setEquipmentService(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantsection
     * @return Map
     */
    public Map<String, List<MessageI18n>> PlantSectionServiceImpl.validate(PlantSection plantsection) {
        Map<String, List<MessageI18n>> messages = new java.util.HashMap<String, List<MessageI18n>>();
        
        // TODO: IMPLEMENT HERE THE VALIDATION OF YOUR ENTITY
        
        return messages;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantSection
     * @param equipmentsToAdd
     * @return PlantSection
     */
    @Transactional
    public PlantSection PlantSectionServiceImpl.addToEquipments(PlantSection plantSection, Iterable<Long> equipmentsToAdd) {
        List<Equipment> equipments = getEquipmentService().findAll(equipmentsToAdd);
        plantSection.addToEquipments(equipments);
        return getPlantSectionRepository().save(plantSection);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantSection
     * @param notificationHeadersToAdd
     * @return PlantSection
     */
    @Transactional
    public PlantSection PlantSectionServiceImpl.addToNotificationHeaders(PlantSection plantSection, Iterable<Long> notificationHeadersToAdd) {
        List<NotificationHeader> notificationHeaders = getNotificationHeaderService().findAll(notificationHeadersToAdd);
        plantSection.addToNotificationHeaders(notificationHeaders);
        return getPlantSectionRepository().save(plantSection);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantSection
     * @param equipmentsToRemove
     * @return PlantSection
     */
    @Transactional
    public PlantSection PlantSectionServiceImpl.removeFromEquipments(PlantSection plantSection, Iterable<Long> equipmentsToRemove) {
        List<Equipment> equipments = getEquipmentService().findAll(equipmentsToRemove);
        plantSection.removeFromEquipments(equipments);
        return getPlantSectionRepository().save(plantSection);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantSection
     * @param notificationHeadersToRemove
     * @return PlantSection
     */
    @Transactional
    public PlantSection PlantSectionServiceImpl.removeFromNotificationHeaders(PlantSection plantSection, Iterable<Long> notificationHeadersToRemove) {
        List<NotificationHeader> notificationHeaders = getNotificationHeaderService().findAll(notificationHeadersToRemove);
        plantSection.removeFromNotificationHeaders(notificationHeaders);
        return getPlantSectionRepository().save(plantSection);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantSection
     * @param equipments
     * @return PlantSection
     */
    @Transactional
    public PlantSection PlantSectionServiceImpl.setEquipments(PlantSection plantSection, Iterable<Long> equipments) {
        List<Equipment> items = getEquipmentService().findAll(equipments);
        Set<Equipment> currents = plantSection.getEquipments();
        Set<Equipment> toRemove = new HashSet<Equipment>();
        for (Iterator<Equipment> iterator = currents.iterator(); iterator.hasNext();) {
            Equipment nextEquipment = iterator.next();
            if (items.contains(nextEquipment)) {
                items.remove(nextEquipment);
            } else {
                toRemove.add(nextEquipment);
            }
        }
        plantSection.removeFromEquipments(toRemove);
        plantSection.addToEquipments(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        plantSection.setVersion(plantSection.getVersion() + 1);
        return getPlantSectionRepository().save(plantSection);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantSection
     * @param notificationHeaders
     * @return PlantSection
     */
    @Transactional
    public PlantSection PlantSectionServiceImpl.setNotificationHeaders(PlantSection plantSection, Iterable<Long> notificationHeaders) {
        List<NotificationHeader> items = getNotificationHeaderService().findAll(notificationHeaders);
        Set<NotificationHeader> currents = plantSection.getNotificationHeaders();
        Set<NotificationHeader> toRemove = new HashSet<NotificationHeader>();
        for (Iterator<NotificationHeader> iterator = currents.iterator(); iterator.hasNext();) {
            NotificationHeader nextNotificationHeader = iterator.next();
            if (items.contains(nextNotificationHeader)) {
                items.remove(nextNotificationHeader);
            } else {
                toRemove.add(nextNotificationHeader);
            }
        }
        plantSection.removeFromNotificationHeaders(toRemove);
        plantSection.addToNotificationHeaders(items);
        // Force the version update of the parent side to know that the parent has changed
        // because it has new books assigned
        plantSection.setVersion(plantSection.getVersion() + 1);
        return getPlantSectionRepository().save(plantSection);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plantSection
     */
    @Transactional
    public void PlantSectionServiceImpl.delete(PlantSection plantSection) {
        // Clear bidirectional many-to-one child relationship with Plant
        if (plantSection.getPlant() != null) {
            plantSection.getPlant().getPlantSections().remove(plantSection);
        }
        
        // Clear bidirectional one-to-many parent relationship with Equipment
        for (Equipment item : plantSection.getEquipments()) {
            item.setPlantSection(null);
        }
        
        // Clear bidirectional one-to-many parent relationship with NotificationHeader
        for (NotificationHeader item : plantSection.getNotificationHeaders()) {
            item.setPlantSection(null);
        }
        
        getPlantSectionRepository().delete(plantSection);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    @Transactional
    public List<PlantSection> PlantSectionServiceImpl.save(Iterable<PlantSection> entities) {
        return getPlantSectionRepository().save(entities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    @Transactional
    public void PlantSectionServiceImpl.delete(Iterable<Long> ids) {
        List<PlantSection> toDelete = getPlantSectionRepository().findAll(ids);
        getPlantSectionRepository().deleteInBatch(toDelete);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return PlantSection
     */
    @Transactional
    public PlantSection PlantSectionServiceImpl.save(PlantSection entity) {
        return getPlantSectionRepository().save(entity);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PlantSection
     */
    public PlantSection PlantSectionServiceImpl.findOne(Long id) {
        return getPlantSectionRepository().findOne(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PlantSection
     */
    public PlantSection PlantSectionServiceImpl.findOneForUpdate(Long id) {
        return getPlantSectionRepository().findOneDetached(id);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public List<PlantSection> PlantSectionServiceImpl.findAll(Iterable<Long> ids) {
        return getPlantSectionRepository().findAll(ids);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public List<PlantSection> PlantSectionServiceImpl.findAll() {
        return getPlantSectionRepository().findAll();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public long PlantSectionServiceImpl.count() {
        return getPlantSectionRepository().count();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PlantSection> PlantSectionServiceImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        return getPlantSectionRepository().findAll(globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PlantSection> PlantSectionServiceImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        return getPlantSectionRepository().findAllByIdsIn(ids, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plant
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<PlantSection> PlantSectionServiceImpl.findByPlant(Plant plant, GlobalSearch globalSearch, Pageable pageable) {
        return getPlantSectionRepository().findByPlant(plant, globalSearch, pageable);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plant
     * @return Long
     */
    public long PlantSectionServiceImpl.countByPlant(Plant plant) {
        return getPlantSectionRepository().countByPlant(plant);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<PlantSection> PlantSectionServiceImpl.getEntityType() {
        return PlantSection.class;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Class
     */
    public Class<Long> PlantSectionServiceImpl.getIdType() {
        return Long.class;
    }
    
}
