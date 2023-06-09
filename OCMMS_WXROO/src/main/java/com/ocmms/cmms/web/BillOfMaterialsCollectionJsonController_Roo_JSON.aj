// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;
import com.ocmms.cmms.service.api.BillOfMaterialService;
import com.ocmms.cmms.web.BillOfMaterialsCollectionJsonController;
import com.ocmms.cmms.web.BillOfMaterialsItemJsonController;
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

privileged aspect BillOfMaterialsCollectionJsonController_Roo_JSON {
    
    declare @type: BillOfMaterialsCollectionJsonController: @RestController;
    
    declare @type: BillOfMaterialsCollectionJsonController: @RequestMapping(value = "/api/billofmaterials", name = "BillOfMaterialsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private BillOfMaterialService BillOfMaterialsCollectionJsonController.billOfMaterialService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param billOfMaterialService
     */
    @Autowired
    public BillOfMaterialsCollectionJsonController.new(BillOfMaterialService billOfMaterialService) {
        this.billOfMaterialService = billOfMaterialService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return BillOfMaterialService
     */
    public BillOfMaterialService BillOfMaterialsCollectionJsonController.getBillOfMaterialService() {
        return billOfMaterialService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param billOfMaterialService
     */
    public void BillOfMaterialsCollectionJsonController.setBillOfMaterialService(BillOfMaterialService billOfMaterialService) {
        this.billOfMaterialService = billOfMaterialService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<BillOfMaterial>> BillOfMaterialsCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<BillOfMaterial> billOfMaterials = getBillOfMaterialService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(billOfMaterials);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents BillOfMaterialsCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(BillOfMaterialsCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param billOfMaterial
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> BillOfMaterialsCollectionJsonController.create(@Valid @RequestBody BillOfMaterial billOfMaterial, BindingResult result) {
        
        if (billOfMaterial.getId() != null || billOfMaterial.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        BillOfMaterial newBillOfMaterial = getBillOfMaterialService().save(billOfMaterial);
        UriComponents showURI = BillOfMaterialsItemJsonController.showURI(newBillOfMaterial);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param billOfMaterials
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> BillOfMaterialsCollectionJsonController.createBatch(@Valid @RequestBody Collection<BillOfMaterial> billOfMaterials, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getBillOfMaterialService().save(billOfMaterials);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param billOfMaterials
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> BillOfMaterialsCollectionJsonController.updateBatch(@Valid @RequestBody Collection<BillOfMaterial> billOfMaterials, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getBillOfMaterialService().save(billOfMaterials);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> BillOfMaterialsCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getBillOfMaterialService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
