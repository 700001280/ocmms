// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.service.api.MaterialCatalogService;
import com.ocmms.cmms.web.MaterialCatalogsCollectionJsonController;
import com.ocmms.cmms.web.MaterialCatalogsItemJsonController;
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

privileged aspect MaterialCatalogsCollectionJsonController_Roo_JSON {
    
    declare @type: MaterialCatalogsCollectionJsonController: @RestController;
    
    declare @type: MaterialCatalogsCollectionJsonController: @RequestMapping(value = "/api/materialcatalogs", name = "MaterialCatalogsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MaterialCatalogService MaterialCatalogsCollectionJsonController.materialCatalogService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param materialCatalogService
     */
    @Autowired
    public MaterialCatalogsCollectionJsonController.new(MaterialCatalogService materialCatalogService) {
        this.materialCatalogService = materialCatalogService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialCatalogService
     */
    public MaterialCatalogService MaterialCatalogsCollectionJsonController.getMaterialCatalogService() {
        return materialCatalogService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalogService
     */
    public void MaterialCatalogsCollectionJsonController.setMaterialCatalogService(MaterialCatalogService materialCatalogService) {
        this.materialCatalogService = materialCatalogService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<MaterialCatalog>> MaterialCatalogsCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<MaterialCatalog> materialCatalogs = getMaterialCatalogService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(materialCatalogs);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents MaterialCatalogsCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(MaterialCatalogsCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> MaterialCatalogsCollectionJsonController.create(@Valid @RequestBody MaterialCatalog materialCatalog, BindingResult result) {
        
        if (materialCatalog.getId() != null || materialCatalog.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        MaterialCatalog newMaterialCatalog = getMaterialCatalogService().save(materialCatalog);
        UriComponents showURI = MaterialCatalogsItemJsonController.showURI(newMaterialCatalog);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalogs
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> MaterialCatalogsCollectionJsonController.createBatch(@Valid @RequestBody Collection<MaterialCatalog> materialCatalogs, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMaterialCatalogService().save(materialCatalogs);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalogs
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> MaterialCatalogsCollectionJsonController.updateBatch(@Valid @RequestBody Collection<MaterialCatalog> materialCatalogs, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMaterialCatalogService().save(materialCatalogs);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> MaterialCatalogsCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getMaterialCatalogService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
