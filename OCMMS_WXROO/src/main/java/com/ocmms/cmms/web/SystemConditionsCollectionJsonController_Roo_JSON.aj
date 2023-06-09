// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import com.ocmms.cmms.service.api.SystemConditionService;
import com.ocmms.cmms.web.SystemConditionsCollectionJsonController;
import com.ocmms.cmms.web.SystemConditionsItemJsonController;
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

privileged aspect SystemConditionsCollectionJsonController_Roo_JSON {
    
    declare @type: SystemConditionsCollectionJsonController: @RestController;
    
    declare @type: SystemConditionsCollectionJsonController: @RequestMapping(value = "/api/systemconditions", name = "SystemConditionsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private SystemConditionService SystemConditionsCollectionJsonController.systemConditionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param systemConditionService
     */
    @Autowired
    public SystemConditionsCollectionJsonController.new(SystemConditionService systemConditionService) {
        this.systemConditionService = systemConditionService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return SystemConditionService
     */
    public SystemConditionService SystemConditionsCollectionJsonController.getSystemConditionService() {
        return systemConditionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemConditionService
     */
    public void SystemConditionsCollectionJsonController.setSystemConditionService(SystemConditionService systemConditionService) {
        this.systemConditionService = systemConditionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<SystemCondition>> SystemConditionsCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<SystemCondition> systemConditions = getSystemConditionService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(systemConditions);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents SystemConditionsCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(SystemConditionsCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemCondition
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> SystemConditionsCollectionJsonController.create(@Valid @RequestBody SystemCondition systemCondition, BindingResult result) {
        
        if (systemCondition.getId() != null || systemCondition.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        SystemCondition newSystemCondition = getSystemConditionService().save(systemCondition);
        UriComponents showURI = SystemConditionsItemJsonController.showURI(newSystemCondition);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemConditions
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> SystemConditionsCollectionJsonController.createBatch(@Valid @RequestBody Collection<SystemCondition> systemConditions, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getSystemConditionService().save(systemConditions);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param systemConditions
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> SystemConditionsCollectionJsonController.updateBatch(@Valid @RequestBody Collection<SystemCondition> systemConditions, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getSystemConditionService().save(systemConditions);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> SystemConditionsCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getSystemConditionService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
