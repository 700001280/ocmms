// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import com.ocmms.cmms.service.api.MaterialOutstockDetailService;
import com.ocmms.cmms.web.MaterialOutstockDetailsCollectionJsonController;
import com.ocmms.cmms.web.MaterialOutstockDetailsItemJsonController;
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

privileged aspect MaterialOutstockDetailsCollectionJsonController_Roo_JSON {
    
    declare @type: MaterialOutstockDetailsCollectionJsonController: @RestController;
    
    declare @type: MaterialOutstockDetailsCollectionJsonController: @RequestMapping(value = "/api/materialoutstockdetails", name = "MaterialOutstockDetailsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MaterialOutstockDetailService MaterialOutstockDetailsCollectionJsonController.materialOutstockDetailService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param materialOutstockDetailService
     */
    @Autowired
    public MaterialOutstockDetailsCollectionJsonController.new(MaterialOutstockDetailService materialOutstockDetailService) {
        this.materialOutstockDetailService = materialOutstockDetailService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialOutstockDetailService
     */
    public MaterialOutstockDetailService MaterialOutstockDetailsCollectionJsonController.getMaterialOutstockDetailService() {
        return materialOutstockDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialOutstockDetailService
     */
    public void MaterialOutstockDetailsCollectionJsonController.setMaterialOutstockDetailService(MaterialOutstockDetailService materialOutstockDetailService) {
        this.materialOutstockDetailService = materialOutstockDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<MaterialOutstockDetail>> MaterialOutstockDetailsCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<MaterialOutstockDetail> materialOutstockDetails = getMaterialOutstockDetailService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(materialOutstockDetails);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents MaterialOutstockDetailsCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(MaterialOutstockDetailsCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialOutstockDetail
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> MaterialOutstockDetailsCollectionJsonController.create(@Valid @RequestBody MaterialOutstockDetail materialOutstockDetail, BindingResult result) {
        
        if (materialOutstockDetail.getId() != null || materialOutstockDetail.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        MaterialOutstockDetail newMaterialOutstockDetail = getMaterialOutstockDetailService().save(materialOutstockDetail);
        UriComponents showURI = MaterialOutstockDetailsItemJsonController.showURI(newMaterialOutstockDetail);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialOutstockDetails
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> MaterialOutstockDetailsCollectionJsonController.createBatch(@Valid @RequestBody Collection<MaterialOutstockDetail> materialOutstockDetails, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMaterialOutstockDetailService().save(materialOutstockDetails);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialOutstockDetails
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> MaterialOutstockDetailsCollectionJsonController.updateBatch(@Valid @RequestBody Collection<MaterialOutstockDetail> materialOutstockDetails, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMaterialOutstockDetailService().save(materialOutstockDetails);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> MaterialOutstockDetailsCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getMaterialOutstockDetailService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
