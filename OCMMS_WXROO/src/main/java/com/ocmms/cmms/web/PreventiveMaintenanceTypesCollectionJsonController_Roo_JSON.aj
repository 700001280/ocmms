// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.plan.PreventiveMaintenanceType;
import com.ocmms.cmms.service.api.PreventiveMaintenanceTypeService;
import com.ocmms.cmms.web.PreventiveMaintenanceTypesCollectionJsonController;
import com.ocmms.cmms.web.PreventiveMaintenanceTypesItemJsonController;
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

privileged aspect PreventiveMaintenanceTypesCollectionJsonController_Roo_JSON {
    
    declare @type: PreventiveMaintenanceTypesCollectionJsonController: @RestController;
    
    declare @type: PreventiveMaintenanceTypesCollectionJsonController: @RequestMapping(value = "/api/preventivemaintenancetypes", name = "PreventiveMaintenanceTypesCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PreventiveMaintenanceTypeService PreventiveMaintenanceTypesCollectionJsonController.preventiveMaintenanceTypeService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param preventiveMaintenanceTypeService
     */
    @Autowired
    public PreventiveMaintenanceTypesCollectionJsonController.new(PreventiveMaintenanceTypeService preventiveMaintenanceTypeService) {
        this.preventiveMaintenanceTypeService = preventiveMaintenanceTypeService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PreventiveMaintenanceTypeService
     */
    public PreventiveMaintenanceTypeService PreventiveMaintenanceTypesCollectionJsonController.getPreventiveMaintenanceTypeService() {
        return preventiveMaintenanceTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceTypeService
     */
    public void PreventiveMaintenanceTypesCollectionJsonController.setPreventiveMaintenanceTypeService(PreventiveMaintenanceTypeService preventiveMaintenanceTypeService) {
        this.preventiveMaintenanceTypeService = preventiveMaintenanceTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<PreventiveMaintenanceType>> PreventiveMaintenanceTypesCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<PreventiveMaintenanceType> preventiveMaintenanceTypes = getPreventiveMaintenanceTypeService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(preventiveMaintenanceTypes);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents PreventiveMaintenanceTypesCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(PreventiveMaintenanceTypesCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceType
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> PreventiveMaintenanceTypesCollectionJsonController.create(@Valid @RequestBody PreventiveMaintenanceType preventiveMaintenanceType, BindingResult result) {
        
        if (preventiveMaintenanceType.getId() != null || preventiveMaintenanceType.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        PreventiveMaintenanceType newPreventiveMaintenanceType = getPreventiveMaintenanceTypeService().save(preventiveMaintenanceType);
        UriComponents showURI = PreventiveMaintenanceTypesItemJsonController.showURI(newPreventiveMaintenanceType);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceTypes
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> PreventiveMaintenanceTypesCollectionJsonController.createBatch(@Valid @RequestBody Collection<PreventiveMaintenanceType> preventiveMaintenanceTypes, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getPreventiveMaintenanceTypeService().save(preventiveMaintenanceTypes);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenanceTypes
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> PreventiveMaintenanceTypesCollectionJsonController.updateBatch(@Valid @RequestBody Collection<PreventiveMaintenanceType> preventiveMaintenanceTypes, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getPreventiveMaintenanceTypeService().save(preventiveMaintenanceTypes);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> PreventiveMaintenanceTypesCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getPreventiveMaintenanceTypeService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
