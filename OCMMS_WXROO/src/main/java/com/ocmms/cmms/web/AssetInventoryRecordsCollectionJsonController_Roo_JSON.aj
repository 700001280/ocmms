// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import com.ocmms.cmms.service.api.AssetInventoryRecordService;
import com.ocmms.cmms.web.AssetInventoryRecordsCollectionJsonController;
import com.ocmms.cmms.web.AssetInventoryRecordsItemJsonController;
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

privileged aspect AssetInventoryRecordsCollectionJsonController_Roo_JSON {
    
    declare @type: AssetInventoryRecordsCollectionJsonController: @RestController;
    
    declare @type: AssetInventoryRecordsCollectionJsonController: @RequestMapping(value = "/api/assetinventoryrecords", name = "AssetInventoryRecordsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private AssetInventoryRecordService AssetInventoryRecordsCollectionJsonController.assetInventoryRecordService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param assetInventoryRecordService
     */
    @Autowired
    public AssetInventoryRecordsCollectionJsonController.new(AssetInventoryRecordService assetInventoryRecordService) {
        this.assetInventoryRecordService = assetInventoryRecordService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return AssetInventoryRecordService
     */
    public AssetInventoryRecordService AssetInventoryRecordsCollectionJsonController.getAssetInventoryRecordService() {
        return assetInventoryRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetInventoryRecordService
     */
    public void AssetInventoryRecordsCollectionJsonController.setAssetInventoryRecordService(AssetInventoryRecordService assetInventoryRecordService) {
        this.assetInventoryRecordService = assetInventoryRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<AssetInventoryRecord>> AssetInventoryRecordsCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<AssetInventoryRecord> assetInventoryRecords = getAssetInventoryRecordService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(assetInventoryRecords);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents AssetInventoryRecordsCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(AssetInventoryRecordsCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetInventoryRecord
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> AssetInventoryRecordsCollectionJsonController.create(@Valid @RequestBody AssetInventoryRecord assetInventoryRecord, BindingResult result) {
        
        if (assetInventoryRecord.getId() != null || assetInventoryRecord.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        AssetInventoryRecord newAssetInventoryRecord = getAssetInventoryRecordService().save(assetInventoryRecord);
        UriComponents showURI = AssetInventoryRecordsItemJsonController.showURI(newAssetInventoryRecord);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetInventoryRecords
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> AssetInventoryRecordsCollectionJsonController.createBatch(@Valid @RequestBody Collection<AssetInventoryRecord> assetInventoryRecords, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getAssetInventoryRecordService().save(assetInventoryRecords);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetInventoryRecords
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> AssetInventoryRecordsCollectionJsonController.updateBatch(@Valid @RequestBody Collection<AssetInventoryRecord> assetInventoryRecords, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getAssetInventoryRecordService().save(assetInventoryRecords);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> AssetInventoryRecordsCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getAssetInventoryRecordService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
