// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.routine.PartReplaceRecord;
import com.ocmms.cmms.service.api.PartReplaceRecordService;
import com.ocmms.cmms.web.PartReplaceRecordsCollectionJsonController;
import com.ocmms.cmms.web.PartReplaceRecordsItemJsonController;
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

privileged aspect PartReplaceRecordsCollectionJsonController_Roo_JSON {
    
    declare @type: PartReplaceRecordsCollectionJsonController: @RestController;
    
    declare @type: PartReplaceRecordsCollectionJsonController: @RequestMapping(value = "/api/partreplacerecords", name = "PartReplaceRecordsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PartReplaceRecordService PartReplaceRecordsCollectionJsonController.partReplaceRecordService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param partReplaceRecordService
     */
    @Autowired
    public PartReplaceRecordsCollectionJsonController.new(PartReplaceRecordService partReplaceRecordService) {
        this.partReplaceRecordService = partReplaceRecordService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PartReplaceRecordService
     */
    public PartReplaceRecordService PartReplaceRecordsCollectionJsonController.getPartReplaceRecordService() {
        return partReplaceRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partReplaceRecordService
     */
    public void PartReplaceRecordsCollectionJsonController.setPartReplaceRecordService(PartReplaceRecordService partReplaceRecordService) {
        this.partReplaceRecordService = partReplaceRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<PartReplaceRecord>> PartReplaceRecordsCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<PartReplaceRecord> partReplaceRecords = getPartReplaceRecordService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(partReplaceRecords);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents PartReplaceRecordsCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(PartReplaceRecordsCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partReplaceRecord
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> PartReplaceRecordsCollectionJsonController.create(@Valid @RequestBody PartReplaceRecord partReplaceRecord, BindingResult result) {
        
        if (partReplaceRecord.getId() != null || partReplaceRecord.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        PartReplaceRecord newPartReplaceRecord = getPartReplaceRecordService().save(partReplaceRecord);
        UriComponents showURI = PartReplaceRecordsItemJsonController.showURI(newPartReplaceRecord);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partReplaceRecords
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> PartReplaceRecordsCollectionJsonController.createBatch(@Valid @RequestBody Collection<PartReplaceRecord> partReplaceRecords, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getPartReplaceRecordService().save(partReplaceRecords);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partReplaceRecords
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> PartReplaceRecordsCollectionJsonController.updateBatch(@Valid @RequestBody Collection<PartReplaceRecord> partReplaceRecords, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getPartReplaceRecordService().save(partReplaceRecords);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> PartReplaceRecordsCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getPartReplaceRecordService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
