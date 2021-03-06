// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import com.ocmms.cmms.service.api.PreventiveMaintenanceStandardService;
import com.ocmms.cmms.web.PreventiveMaintenanceStandardsCollectionJsonController;
import com.ocmms.cmms.web.PreventiveMaintenanceStandardsItemJsonController;
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

privileged aspect PreventiveMaintenanceStandardsCollectionJsonController_Roo_JSON {
    
    declare @type: PreventiveMaintenanceStandardsCollectionJsonController: @RestController;
    
    declare @type: PreventiveMaintenanceStandardsCollectionJsonController: @RequestMapping(value = "/api/preventivemaintenancestandards", name = "PreventiveMaintenanceStandardsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PreventiveMaintenanceStandardService PreventiveMaintenanceStandardsCollectionJsonController.preventiveMaintenanceStandardService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param preventiveMaintenanceStandardService
     */
    @Autowired
    public PreventiveMaintenanceStandardsCollectionJsonController.new(PreventiveMaintenanceStandardService preventiveMaintenanceStandardService) {
        this.preventiveMaintenanceStandardService = preventiveMaintenanceStandardService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PreventiveMaintenanceStandardService
     */
    public PreventiveMaintenanceStandardService PreventiveMaintenanceStandardsCollectionJsonController.getPreventiveMaintenanceStandardService() {
        return preventiveMaintenanceStandardService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceStandardService
     */
    public void PreventiveMaintenanceStandardsCollectionJsonController.setPreventiveMaintenanceStandardService(PreventiveMaintenanceStandardService preventiveMaintenanceStandardService) {
        this.preventiveMaintenanceStandardService = preventiveMaintenanceStandardService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<PreventiveMaintenanceStandard>> PreventiveMaintenanceStandardsCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<PreventiveMaintenanceStandard> preventiveMaintenanceStandards = getPreventiveMaintenanceStandardService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(preventiveMaintenanceStandards);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents PreventiveMaintenanceStandardsCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(PreventiveMaintenanceStandardsCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceStandard
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> PreventiveMaintenanceStandardsCollectionJsonController.create(@Valid @RequestBody PreventiveMaintenanceStandard preventiveMaintenanceStandard, BindingResult result) {
        
        if (preventiveMaintenanceStandard.getId() != null || preventiveMaintenanceStandard.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        PreventiveMaintenanceStandard newPreventiveMaintenanceStandard = getPreventiveMaintenanceStandardService().save(preventiveMaintenanceStandard);
        UriComponents showURI = PreventiveMaintenanceStandardsItemJsonController.showURI(newPreventiveMaintenanceStandard);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceStandards
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> PreventiveMaintenanceStandardsCollectionJsonController.createBatch(@Valid @RequestBody Collection<PreventiveMaintenanceStandard> preventiveMaintenanceStandards, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getPreventiveMaintenanceStandardService().save(preventiveMaintenanceStandards);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceStandards
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> PreventiveMaintenanceStandardsCollectionJsonController.updateBatch(@Valid @RequestBody Collection<PreventiveMaintenanceStandard> preventiveMaintenanceStandards, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getPreventiveMaintenanceStandardService().save(preventiveMaintenanceStandards);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> PreventiveMaintenanceStandardsCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getPreventiveMaintenanceStandardService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
