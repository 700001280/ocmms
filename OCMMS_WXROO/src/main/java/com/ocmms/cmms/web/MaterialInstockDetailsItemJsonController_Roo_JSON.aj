// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.service.api.MaterialInstockDetailService;
import com.ocmms.cmms.web.MaterialInstockDetailsItemJsonController;
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

privileged aspect MaterialInstockDetailsItemJsonController_Roo_JSON {
    
    declare @type: MaterialInstockDetailsItemJsonController: @RestController;
    
    declare @type: MaterialInstockDetailsItemJsonController: @RequestMapping(value = "/api/materialinstockdetails/{materialInstockDetail}", name = "MaterialInstockDetailsItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MaterialInstockDetailService MaterialInstockDetailsItemJsonController.materialInstockDetailService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param materialInstockDetailService
     */
    @Autowired
    public MaterialInstockDetailsItemJsonController.new(MaterialInstockDetailService materialInstockDetailService) {
        this.materialInstockDetailService = materialInstockDetailService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialInstockDetailService
     */
    public MaterialInstockDetailService MaterialInstockDetailsItemJsonController.getMaterialInstockDetailService() {
        return materialInstockDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialInstockDetailService
     */
    public void MaterialInstockDetailsItemJsonController.setMaterialInstockDetailService(MaterialInstockDetailService materialInstockDetailService) {
        this.materialInstockDetailService = materialInstockDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MaterialInstockDetail
     */
    @ModelAttribute
    public MaterialInstockDetail MaterialInstockDetailsItemJsonController.getMaterialInstockDetail(@PathVariable("materialInstockDetail") Long id) {
        MaterialInstockDetail materialInstockDetail = materialInstockDetailService.findOne(id);
        if (materialInstockDetail == null) {
            throw new NotFoundException(String.format("MaterialInstockDetail with identifier '%s' not found",id));
        }
        return materialInstockDetail;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialInstockDetail
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> MaterialInstockDetailsItemJsonController.show(@ModelAttribute MaterialInstockDetail materialInstockDetail) {
        return ResponseEntity.ok(materialInstockDetail);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialInstockDetail
     * @return UriComponents
     */
    public static UriComponents MaterialInstockDetailsItemJsonController.showURI(MaterialInstockDetail materialInstockDetail) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(MaterialInstockDetailsItemJsonController.class).show(materialInstockDetail))
            .buildAndExpand(materialInstockDetail.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedMaterialInstockDetail
     * @param materialInstockDetail
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> MaterialInstockDetailsItemJsonController.update(@ModelAttribute MaterialInstockDetail storedMaterialInstockDetail, @Valid @RequestBody MaterialInstockDetail materialInstockDetail, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        materialInstockDetail.setId(storedMaterialInstockDetail.getId());
        getMaterialInstockDetailService().save(materialInstockDetail);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialInstockDetail
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> MaterialInstockDetailsItemJsonController.delete(@ModelAttribute MaterialInstockDetail materialInstockDetail) {
        getMaterialInstockDetailService().delete(materialInstockDetail);
        return ResponseEntity.ok().build();
    }
    
}
