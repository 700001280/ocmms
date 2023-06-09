// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.service.api;

import com.ocmms.cmms.model.pm.notification.NotificationType;
import com.ocmms.cmms.service.api.NotificationTypeService;
import io.springlets.data.domain.GlobalSearch;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

privileged aspect NotificationTypeService_Roo_Service {
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return NotificationType
     */
    public abstract NotificationType NotificationTypeService.findOne(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationType
     */
    public abstract void NotificationTypeService.delete(NotificationType notificationType);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entities
     * @return List
     */
    public abstract List<NotificationType> NotificationTypeService.save(Iterable<NotificationType> entities);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     */
    public abstract void NotificationTypeService.delete(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @return NotificationType
     */
    public abstract NotificationType NotificationTypeService.save(NotificationType entity);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return NotificationType
     */
    public abstract NotificationType NotificationTypeService.findOneForUpdate(Long id);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return List
     */
    public abstract List<NotificationType> NotificationTypeService.findAll(Iterable<Long> ids);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return List
     */
    public abstract List<NotificationType> NotificationTypeService.findAll();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return Long
     */
    public abstract long NotificationTypeService.count();
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<NotificationType> NotificationTypeService.findAll(GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public abstract Page<NotificationType> NotificationTypeService.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationType
     * @param notificationHeadersToAdd
     * @return NotificationType
     */
    public abstract NotificationType NotificationTypeService.addToNotificationHeaders(NotificationType notificationType, Iterable<Long> notificationHeadersToAdd);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationType
     * @param notificationHeadersToRemove
     * @return NotificationType
     */
    public abstract NotificationType NotificationTypeService.removeFromNotificationHeaders(NotificationType notificationType, Iterable<Long> notificationHeadersToRemove);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationType
     * @param notificationHeaders
     * @return NotificationType
     */
    public abstract NotificationType NotificationTypeService.setNotificationHeaders(NotificationType notificationType, Iterable<Long> notificationHeaders);
    
}
