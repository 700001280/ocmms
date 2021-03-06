// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.master.MROCatalog;
import com.ocmms.cmms.service.api.MROCatalogService;
import com.ocmms.cmms.web.MROCatalogsItemJsonController;
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

privileged aspect MROCatalogsItemJsonController_Roo_JSON {
    
    declare @type: MROCatalogsItemJsonController: @RestController;
    
    declare @type: MROCatalogsItemJsonController: @RequestMapping(value = "/api/mrocatalogs/{mROCatalog}", name = "MROCatalogsItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MROCatalogService MROCatalogsItemJsonController.mROCatalogService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param mROCatalogService
     */
    @Autowired
    public MROCatalogsItemJsonController.new(MROCatalogService mROCatalogService) {
        this.mROCatalogService = mROCatalogService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MROCatalogService
     */
    public MROCatalogService MROCatalogsItemJsonController.getMROCatalogService() {
        return mROCatalogService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mROCatalogService
     */
    public void MROCatalogsItemJsonController.setMROCatalogService(MROCatalogService mROCatalogService) {
        this.mROCatalogService = mROCatalogService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MROCatalog
     */
    @ModelAttribute
    public MROCatalog MROCatalogsItemJsonController.getMROCatalog(@PathVariable("mROCatalog") Long id) {
        MROCatalog mROCatalog = mROCatalogService.findOne(id);
        if (mROCatalog == null) {
            throw new NotFoundException(String.format("MROCatalog with identifier '%s' not found",id));
        }
        return mROCatalog;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mROCatalog
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> MROCatalogsItemJsonController.show(@ModelAttribute MROCatalog mROCatalog) {
        return ResponseEntity.ok(mROCatalog);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mROCatalog
     * @return UriComponents
     */
    public static UriComponents MROCatalogsItemJsonController.showURI(MROCatalog mROCatalog) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(MROCatalogsItemJsonController.class).show(mROCatalog))
            .buildAndExpand(mROCatalog.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedMROCatalog
     * @param mROCatalog
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> MROCatalogsItemJsonController.update(@ModelAttribute MROCatalog storedMROCatalog, @Valid @RequestBody MROCatalog mROCatalog, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        mROCatalog.setId(storedMROCatalog.getId());
        getMROCatalogService().save(mROCatalog);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mROCatalog
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> MROCatalogsItemJsonController.delete(@ModelAttribute MROCatalog mROCatalog) {
        getMROCatalogService().delete(mROCatalog);
        return ResponseEntity.ok().build();
    }
    
}
