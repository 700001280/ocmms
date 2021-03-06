// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import com.ocmms.cmms.service.api.AssetInventoryRecordService;
import com.ocmms.cmms.web.AssetInventoryRecordsItemJsonController;
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

privileged aspect AssetInventoryRecordsItemJsonController_Roo_JSON {
    
    declare @type: AssetInventoryRecordsItemJsonController: @RestController;
    
    declare @type: AssetInventoryRecordsItemJsonController: @RequestMapping(value = "/api/assetinventoryrecords/{assetInventoryRecord}", name = "AssetInventoryRecordsItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private AssetInventoryRecordService AssetInventoryRecordsItemJsonController.assetInventoryRecordService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param assetInventoryRecordService
     */
    @Autowired
    public AssetInventoryRecordsItemJsonController.new(AssetInventoryRecordService assetInventoryRecordService) {
        this.assetInventoryRecordService = assetInventoryRecordService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return AssetInventoryRecordService
     */
    public AssetInventoryRecordService AssetInventoryRecordsItemJsonController.getAssetInventoryRecordService() {
        return assetInventoryRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetInventoryRecordService
     */
    public void AssetInventoryRecordsItemJsonController.setAssetInventoryRecordService(AssetInventoryRecordService assetInventoryRecordService) {
        this.assetInventoryRecordService = assetInventoryRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return AssetInventoryRecord
     */
    @ModelAttribute
    public AssetInventoryRecord AssetInventoryRecordsItemJsonController.getAssetInventoryRecord(@PathVariable("assetInventoryRecord") Long id) {
        AssetInventoryRecord assetInventoryRecord = assetInventoryRecordService.findOne(id);
        if (assetInventoryRecord == null) {
            throw new NotFoundException(String.format("AssetInventoryRecord with identifier '%s' not found",id));
        }
        return assetInventoryRecord;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetInventoryRecord
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> AssetInventoryRecordsItemJsonController.show(@ModelAttribute AssetInventoryRecord assetInventoryRecord) {
        return ResponseEntity.ok(assetInventoryRecord);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetInventoryRecord
     * @return UriComponents
     */
    public static UriComponents AssetInventoryRecordsItemJsonController.showURI(AssetInventoryRecord assetInventoryRecord) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(AssetInventoryRecordsItemJsonController.class).show(assetInventoryRecord))
            .buildAndExpand(assetInventoryRecord.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedAssetInventoryRecord
     * @param assetInventoryRecord
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> AssetInventoryRecordsItemJsonController.update(@ModelAttribute AssetInventoryRecord storedAssetInventoryRecord, @Valid @RequestBody AssetInventoryRecord assetInventoryRecord, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        assetInventoryRecord.setId(storedAssetInventoryRecord.getId());
        getAssetInventoryRecordService().save(assetInventoryRecord);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetInventoryRecord
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> AssetInventoryRecordsItemJsonController.delete(@ModelAttribute AssetInventoryRecord assetInventoryRecord) {
        getAssetInventoryRecordService().delete(assetInventoryRecord);
        return ResponseEntity.ok().build();
    }
    
}
