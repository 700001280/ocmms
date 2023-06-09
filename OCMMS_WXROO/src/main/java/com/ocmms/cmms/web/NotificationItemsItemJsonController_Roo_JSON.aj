// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.notification.NotificationItem;
import com.ocmms.cmms.service.api.NotificationItemService;
import com.ocmms.cmms.web.NotificationItemsItemJsonController;
import io.springlets.web.NotFoundException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

privileged aspect NotificationItemsItemJsonController_Roo_JSON {
    
    declare @type: NotificationItemsItemJsonController: @RestController;
    
    declare @type: NotificationItemsItemJsonController: @RequestMapping(value = "/api/notificationitems/{notificationItem}", name = "NotificationItemsItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private NotificationItemService NotificationItemsItemJsonController.notificationItemService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param notificationItemService
     */
    @Autowired
    public NotificationItemsItemJsonController.new(NotificationItemService notificationItemService) {
        this.notificationItemService = notificationItemService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return NotificationItemService
     */
    public NotificationItemService NotificationItemsItemJsonController.getNotificationItemService() {
        return notificationItemService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationItemService
     */
    public void NotificationItemsItemJsonController.setNotificationItemService(NotificationItemService notificationItemService) {
        this.notificationItemService = notificationItemService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return NotificationItem
     */
    @ModelAttribute
    public NotificationItem NotificationItemsItemJsonController.getNotificationItem(@PathVariable("notificationItem") Long id) {
        NotificationItem notificationItem = notificationItemService.findOne(id);
        if (notificationItem == null) {
            throw new NotFoundException(String.format("NotificationItem with identifier '%s' not found",id));
        }
        return notificationItem;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationItem
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> NotificationItemsItemJsonController.show(@ModelAttribute NotificationItem notificationItem) {
        return ResponseEntity.ok(notificationItem);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationItem
     * @return UriComponents
     */
    public static UriComponents NotificationItemsItemJsonController.showURI(NotificationItem notificationItem) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(NotificationItemsItemJsonController.class).show(notificationItem))
            .buildAndExpand(notificationItem.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedNotificationItem
     * @param notificationItem
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> NotificationItemsItemJsonController.update(@ModelAttribute NotificationItem storedNotificationItem, @Valid @RequestBody NotificationItem notificationItem, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        notificationItem.setId(storedNotificationItem.getId());
        getNotificationItemService().save(notificationItem);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param notificationItem
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> NotificationItemsItemJsonController.delete(@ModelAttribute NotificationItem notificationItem) {
        getNotificationItemService().delete(notificationItem);
        return ResponseEntity.ok().build();
    }
    
}
