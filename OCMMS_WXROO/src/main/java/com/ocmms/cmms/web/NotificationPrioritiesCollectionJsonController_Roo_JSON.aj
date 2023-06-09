// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.notification.NotificationPriority;
import com.ocmms.cmms.service.api.NotificationPriorityService;
import com.ocmms.cmms.web.NotificationPrioritiesCollectionJsonController;
import com.ocmms.cmms.web.NotificationPrioritiesItemJsonController;
import io.springlets.data.domain.GlobalSearch;
import java.util.Collection;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

privileged aspect NotificationPrioritiesCollectionJsonController_Roo_JSON {
    
    declare @type: NotificationPrioritiesCollectionJsonController: @RestController;
    
    declare @type: NotificationPrioritiesCollectionJsonController: @RequestMapping(value = "/api/notificationpriorities", name = "NotificationPrioritiesCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private NotificationPriorityService NotificationPrioritiesCollectionJsonController.notificationPriorityService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param notificationPriorityService
     */
    @Autowired
    public NotificationPrioritiesCollectionJsonController.new(NotificationPriorityService notificationPriorityService) {
        this.notificationPriorityService = notificationPriorityService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return NotificationPriorityService
     */
    public NotificationPriorityService NotificationPrioritiesCollectionJsonController.getNotificationPriorityService() {
        return notificationPriorityService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationPriorityService
     */
    public void NotificationPrioritiesCollectionJsonController.setNotificationPriorityService(NotificationPriorityService notificationPriorityService) {
        this.notificationPriorityService = notificationPriorityService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<NotificationPriority>> NotificationPrioritiesCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<NotificationPriority> notificationPriorities = getNotificationPriorityService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(notificationPriorities);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents NotificationPrioritiesCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(NotificationPrioritiesCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationPriority
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> NotificationPrioritiesCollectionJsonController.create(@Valid @RequestBody NotificationPriority notificationPriority, BindingResult result) {
        
        if (notificationPriority.getId() != null || notificationPriority.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        NotificationPriority newNotificationPriority = getNotificationPriorityService().save(notificationPriority);
        UriComponents showURI = NotificationPrioritiesItemJsonController.showURI(newNotificationPriority);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationPriorities
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> NotificationPrioritiesCollectionJsonController.createBatch(@Valid @RequestBody Collection<NotificationPriority> notificationPriorities, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getNotificationPriorityService().save(notificationPriorities);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationPriorities
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> NotificationPrioritiesCollectionJsonController.updateBatch(@Valid @RequestBody Collection<NotificationPriority> notificationPriorities, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getNotificationPriorityService().save(notificationPriorities);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> NotificationPrioritiesCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getNotificationPriorityService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
