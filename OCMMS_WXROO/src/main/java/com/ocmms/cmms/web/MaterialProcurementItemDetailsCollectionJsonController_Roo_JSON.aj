// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.service.api.MaterialProcurementItemDetailService;
import com.ocmms.cmms.web.MaterialProcurementItemDetailsCollectionJsonController;
import com.ocmms.cmms.web.MaterialProcurementItemDetailsItemJsonController;
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

privileged aspect MaterialProcurementItemDetailsCollectionJsonController_Roo_JSON {
    
    declare @type: MaterialProcurementItemDetailsCollectionJsonController: @RestController;
    
    declare @type: MaterialProcurementItemDetailsCollectionJsonController: @RequestMapping(value = "/api/materialprocurementitemdetails", name = "MaterialProcurementItemDetailsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MaterialProcurementItemDetailService MaterialProcurementItemDetailsCollectionJsonController.materialProcurementItemDetailService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param materialProcurementItemDetailService
     */
    @Autowired
    public MaterialProcurementItemDetailsCollectionJsonController.new(MaterialProcurementItemDetailService materialProcurementItemDetailService) {
        this.materialProcurementItemDetailService = materialProcurementItemDetailService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialProcurementItemDetailService
     */
    public MaterialProcurementItemDetailService MaterialProcurementItemDetailsCollectionJsonController.getMaterialProcurementItemDetailService() {
        return materialProcurementItemDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialProcurementItemDetailService
     */
    public void MaterialProcurementItemDetailsCollectionJsonController.setMaterialProcurementItemDetailService(MaterialProcurementItemDetailService materialProcurementItemDetailService) {
        this.materialProcurementItemDetailService = materialProcurementItemDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<MaterialProcurementItemDetail>> MaterialProcurementItemDetailsCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<MaterialProcurementItemDetail> materialProcurementItemDetails = getMaterialProcurementItemDetailService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(materialProcurementItemDetails);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents MaterialProcurementItemDetailsCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(MaterialProcurementItemDetailsCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialProcurementItemDetail
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> MaterialProcurementItemDetailsCollectionJsonController.create(@Valid @RequestBody MaterialProcurementItemDetail materialProcurementItemDetail, BindingResult result) {
        
        if (materialProcurementItemDetail.getId() != null || materialProcurementItemDetail.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        MaterialProcurementItemDetail newMaterialProcurementItemDetail = getMaterialProcurementItemDetailService().save(materialProcurementItemDetail);
        UriComponents showURI = MaterialProcurementItemDetailsItemJsonController.showURI(newMaterialProcurementItemDetail);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialProcurementItemDetails
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> MaterialProcurementItemDetailsCollectionJsonController.createBatch(@Valid @RequestBody Collection<MaterialProcurementItemDetail> materialProcurementItemDetails, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMaterialProcurementItemDetailService().save(materialProcurementItemDetails);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialProcurementItemDetails
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> MaterialProcurementItemDetailsCollectionJsonController.updateBatch(@Valid @RequestBody Collection<MaterialProcurementItemDetail> materialProcurementItemDetails, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMaterialProcurementItemDetailService().save(materialProcurementItemDetails);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> MaterialProcurementItemDetailsCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getMaterialProcurementItemDetailService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
