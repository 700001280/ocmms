// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.assistance.MessageLog;
import com.ocmms.cmms.service.api.MessageLogService;
import com.ocmms.cmms.web.MessageLogsCollectionJsonController;
import com.ocmms.cmms.web.MessageLogsItemJsonController;
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

privileged aspect MessageLogsCollectionJsonController_Roo_JSON {
    
    declare @type: MessageLogsCollectionJsonController: @RestController;
    
    declare @type: MessageLogsCollectionJsonController: @RequestMapping(value = "/api/messagelogs", name = "MessageLogsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageLogService MessageLogsCollectionJsonController.messageLogService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param messageLogService
     */
    @Autowired
    public MessageLogsCollectionJsonController.new(MessageLogService messageLogService) {
        this.messageLogService = messageLogService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageLogService
     */
    public MessageLogService MessageLogsCollectionJsonController.getMessageLogService() {
        return messageLogService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageLogService
     */
    public void MessageLogsCollectionJsonController.setMessageLogService(MessageLogService messageLogService) {
        this.messageLogService = messageLogService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<MessageLog>> MessageLogsCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<MessageLog> messageLogs = getMessageLogService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(messageLogs);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents MessageLogsCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(MessageLogsCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageLog
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> MessageLogsCollectionJsonController.create(@Valid @RequestBody MessageLog messageLog, BindingResult result) {
        
        if (messageLog.getId() != null || messageLog.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        MessageLog newMessageLog = getMessageLogService().save(messageLog);
        UriComponents showURI = MessageLogsItemJsonController.showURI(newMessageLog);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageLogs
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> MessageLogsCollectionJsonController.createBatch(@Valid @RequestBody Collection<MessageLog> messageLogs, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMessageLogService().save(messageLogs);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageLogs
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> MessageLogsCollectionJsonController.updateBatch(@Valid @RequestBody Collection<MessageLog> messageLogs, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMessageLogService().save(messageLogs);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> MessageLogsCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getMessageLogService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
