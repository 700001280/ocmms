// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.workorder.WorkOrderControlkey;
import com.ocmms.cmms.service.api.WorkOrderControlkeyService;
import com.ocmms.cmms.web.WorkOrderControlkeysCollectionJsonController;
import com.ocmms.cmms.web.WorkOrderControlkeysItemJsonController;
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

privileged aspect WorkOrderControlkeysCollectionJsonController_Roo_JSON {
    
    declare @type: WorkOrderControlkeysCollectionJsonController: @RestController;
    
    declare @type: WorkOrderControlkeysCollectionJsonController: @RequestMapping(value = "/api/workordercontrolkeys", name = "WorkOrderControlkeysCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private WorkOrderControlkeyService WorkOrderControlkeysCollectionJsonController.workOrderControlkeyService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param workOrderControlkeyService
     */
    @Autowired
    public WorkOrderControlkeysCollectionJsonController.new(WorkOrderControlkeyService workOrderControlkeyService) {
        this.workOrderControlkeyService = workOrderControlkeyService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return WorkOrderControlkeyService
     */
    public WorkOrderControlkeyService WorkOrderControlkeysCollectionJsonController.getWorkOrderControlkeyService() {
        return workOrderControlkeyService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderControlkeyService
     */
    public void WorkOrderControlkeysCollectionJsonController.setWorkOrderControlkeyService(WorkOrderControlkeyService workOrderControlkeyService) {
        this.workOrderControlkeyService = workOrderControlkeyService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<WorkOrderControlkey>> WorkOrderControlkeysCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<WorkOrderControlkey> workOrderControlkeys = getWorkOrderControlkeyService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(workOrderControlkeys);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents WorkOrderControlkeysCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(WorkOrderControlkeysCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderControlkey
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> WorkOrderControlkeysCollectionJsonController.create(@Valid @RequestBody WorkOrderControlkey workOrderControlkey, BindingResult result) {
        
        if (workOrderControlkey.getId() != null || workOrderControlkey.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        WorkOrderControlkey newWorkOrderControlkey = getWorkOrderControlkeyService().save(workOrderControlkey);
        UriComponents showURI = WorkOrderControlkeysItemJsonController.showURI(newWorkOrderControlkey);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderControlkeys
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> WorkOrderControlkeysCollectionJsonController.createBatch(@Valid @RequestBody Collection<WorkOrderControlkey> workOrderControlkeys, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getWorkOrderControlkeyService().save(workOrderControlkeys);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderControlkeys
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> WorkOrderControlkeysCollectionJsonController.updateBatch(@Valid @RequestBody Collection<WorkOrderControlkey> workOrderControlkeys, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getWorkOrderControlkeyService().save(workOrderControlkeys);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> WorkOrderControlkeysCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getWorkOrderControlkeyService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
