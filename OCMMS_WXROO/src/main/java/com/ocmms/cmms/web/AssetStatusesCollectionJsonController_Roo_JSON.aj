// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.asset.AssetStatus;
import com.ocmms.cmms.service.api.AssetStatusService;
import com.ocmms.cmms.web.AssetStatusesCollectionJsonController;
import com.ocmms.cmms.web.AssetStatusesItemJsonController;
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

privileged aspect AssetStatusesCollectionJsonController_Roo_JSON {
    
    declare @type: AssetStatusesCollectionJsonController: @RestController;
    
    declare @type: AssetStatusesCollectionJsonController: @RequestMapping(value = "/api/assetstatuses", name = "AssetStatusesCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private AssetStatusService AssetStatusesCollectionJsonController.assetStatusService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param assetStatusService
     */
    @Autowired
    public AssetStatusesCollectionJsonController.new(AssetStatusService assetStatusService) {
        this.assetStatusService = assetStatusService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return AssetStatusService
     */
    public AssetStatusService AssetStatusesCollectionJsonController.getAssetStatusService() {
        return assetStatusService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetStatusService
     */
    public void AssetStatusesCollectionJsonController.setAssetStatusService(AssetStatusService assetStatusService) {
        this.assetStatusService = assetStatusService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<AssetStatus>> AssetStatusesCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<AssetStatus> assetStatuses = getAssetStatusService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(assetStatuses);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents AssetStatusesCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(AssetStatusesCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetStatus
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> AssetStatusesCollectionJsonController.create(@Valid @RequestBody AssetStatus assetStatus, BindingResult result) {
        
        if (assetStatus.getId() != null || assetStatus.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        AssetStatus newAssetStatus = getAssetStatusService().save(assetStatus);
        UriComponents showURI = AssetStatusesItemJsonController.showURI(newAssetStatus);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetStatuses
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> AssetStatusesCollectionJsonController.createBatch(@Valid @RequestBody Collection<AssetStatus> assetStatuses, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getAssetStatusService().save(assetStatuses);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetStatuses
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> AssetStatusesCollectionJsonController.updateBatch(@Valid @RequestBody Collection<AssetStatus> assetStatuses, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getAssetStatusService().save(assetStatuses);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> AssetStatusesCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getAssetStatusService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
