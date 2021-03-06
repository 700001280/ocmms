// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.measuringpoint.MeasuringPoint;
import com.ocmms.cmms.service.api.MeasuringPointService;
import com.ocmms.cmms.web.MeasuringPointsCollectionJsonController;
import com.ocmms.cmms.web.MeasuringPointsItemJsonController;
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

privileged aspect MeasuringPointsCollectionJsonController_Roo_JSON {
    
    declare @type: MeasuringPointsCollectionJsonController: @RestController;
    
    declare @type: MeasuringPointsCollectionJsonController: @RequestMapping(value = "/api/measuringpoints", name = "MeasuringPointsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MeasuringPointService MeasuringPointsCollectionJsonController.measuringPointService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param measuringPointService
     */
    @Autowired
    public MeasuringPointsCollectionJsonController.new(MeasuringPointService measuringPointService) {
        this.measuringPointService = measuringPointService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MeasuringPointService
     */
    public MeasuringPointService MeasuringPointsCollectionJsonController.getMeasuringPointService() {
        return measuringPointService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringPointService
     */
    public void MeasuringPointsCollectionJsonController.setMeasuringPointService(MeasuringPointService measuringPointService) {
        this.measuringPointService = measuringPointService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<MeasuringPoint>> MeasuringPointsCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<MeasuringPoint> measuringPoints = getMeasuringPointService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(measuringPoints);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents MeasuringPointsCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(MeasuringPointsCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringPoint
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> MeasuringPointsCollectionJsonController.create(@Valid @RequestBody MeasuringPoint measuringPoint, BindingResult result) {
        
        if (measuringPoint.getId() != null || measuringPoint.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        MeasuringPoint newMeasuringPoint = getMeasuringPointService().save(measuringPoint);
        UriComponents showURI = MeasuringPointsItemJsonController.showURI(newMeasuringPoint);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringPoints
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> MeasuringPointsCollectionJsonController.createBatch(@Valid @RequestBody Collection<MeasuringPoint> measuringPoints, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMeasuringPointService().save(measuringPoints);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param measuringPoints
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> MeasuringPointsCollectionJsonController.updateBatch(@Valid @RequestBody Collection<MeasuringPoint> measuringPoints, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMeasuringPointService().save(measuringPoints);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> MeasuringPointsCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getMeasuringPointService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
