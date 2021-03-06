// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import com.ocmms.cmms.service.api.OutstockDetailService;
import com.ocmms.cmms.web.OutstockDetailsItemJsonController;
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

privileged aspect OutstockDetailsItemJsonController_Roo_JSON {
    
    declare @type: OutstockDetailsItemJsonController: @RestController;
    
    declare @type: OutstockDetailsItemJsonController: @RequestMapping(value = "/api/outstockdetails/{outstockDetail}", name = "OutstockDetailsItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private OutstockDetailService OutstockDetailsItemJsonController.outstockDetailService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param outstockDetailService
     */
    @Autowired
    public OutstockDetailsItemJsonController.new(OutstockDetailService outstockDetailService) {
        this.outstockDetailService = outstockDetailService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return OutstockDetailService
     */
    public OutstockDetailService OutstockDetailsItemJsonController.getOutstockDetailService() {
        return outstockDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param outstockDetailService
     */
    public void OutstockDetailsItemJsonController.setOutstockDetailService(OutstockDetailService outstockDetailService) {
        this.outstockDetailService = outstockDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return OutstockDetail
     */
    @ModelAttribute
    public OutstockDetail OutstockDetailsItemJsonController.getOutstockDetail(@PathVariable("outstockDetail") Long id) {
        OutstockDetail outstockDetail = outstockDetailService.findOne(id);
        if (outstockDetail == null) {
            throw new NotFoundException(String.format("OutstockDetail with identifier '%s' not found",id));
        }
        return outstockDetail;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param outstockDetail
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> OutstockDetailsItemJsonController.show(@ModelAttribute OutstockDetail outstockDetail) {
        return ResponseEntity.ok(outstockDetail);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param outstockDetail
     * @return UriComponents
     */
    public static UriComponents OutstockDetailsItemJsonController.showURI(OutstockDetail outstockDetail) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(OutstockDetailsItemJsonController.class).show(outstockDetail))
            .buildAndExpand(outstockDetail.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedOutstockDetail
     * @param outstockDetail
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> OutstockDetailsItemJsonController.update(@ModelAttribute OutstockDetail storedOutstockDetail, @Valid @RequestBody OutstockDetail outstockDetail, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        outstockDetail.setId(storedOutstockDetail.getId());
        getOutstockDetailService().save(outstockDetail);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param outstockDetail
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> OutstockDetailsItemJsonController.delete(@ModelAttribute OutstockDetail outstockDetail) {
        getOutstockDetailService().delete(outstockDetail);
        return ResponseEntity.ok().build();
    }
    
}
