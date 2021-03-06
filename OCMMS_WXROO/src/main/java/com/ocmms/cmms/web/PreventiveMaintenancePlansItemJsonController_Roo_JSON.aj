// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.plan.PreventiveMaintenancePlan;
import com.ocmms.cmms.service.api.PreventiveMaintenancePlanService;
import com.ocmms.cmms.web.PreventiveMaintenancePlansItemJsonController;
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

privileged aspect PreventiveMaintenancePlansItemJsonController_Roo_JSON {
    
    declare @type: PreventiveMaintenancePlansItemJsonController: @RestController;
    
    declare @type: PreventiveMaintenancePlansItemJsonController: @RequestMapping(value = "/api/preventivemaintenanceplans/{preventiveMaintenancePlan}", name = "PreventiveMaintenancePlansItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PreventiveMaintenancePlanService PreventiveMaintenancePlansItemJsonController.preventiveMaintenancePlanService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param preventiveMaintenancePlanService
     */
    @Autowired
    public PreventiveMaintenancePlansItemJsonController.new(PreventiveMaintenancePlanService preventiveMaintenancePlanService) {
        this.preventiveMaintenancePlanService = preventiveMaintenancePlanService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PreventiveMaintenancePlanService
     */
    public PreventiveMaintenancePlanService PreventiveMaintenancePlansItemJsonController.getPreventiveMaintenancePlanService() {
        return preventiveMaintenancePlanService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenancePlanService
     */
    public void PreventiveMaintenancePlansItemJsonController.setPreventiveMaintenancePlanService(PreventiveMaintenancePlanService preventiveMaintenancePlanService) {
        this.preventiveMaintenancePlanService = preventiveMaintenancePlanService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PreventiveMaintenancePlan
     */
    @ModelAttribute
    public PreventiveMaintenancePlan PreventiveMaintenancePlansItemJsonController.getPreventiveMaintenancePlan(@PathVariable("preventiveMaintenancePlan") Long id) {
        PreventiveMaintenancePlan preventiveMaintenancePlan = preventiveMaintenancePlanService.findOne(id);
        if (preventiveMaintenancePlan == null) {
            throw new NotFoundException(String.format("PreventiveMaintenancePlan with identifier '%s' not found",id));
        }
        return preventiveMaintenancePlan;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenancePlan
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> PreventiveMaintenancePlansItemJsonController.show(@ModelAttribute PreventiveMaintenancePlan preventiveMaintenancePlan) {
        return ResponseEntity.ok(preventiveMaintenancePlan);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenancePlan
     * @return UriComponents
     */
    public static UriComponents PreventiveMaintenancePlansItemJsonController.showURI(PreventiveMaintenancePlan preventiveMaintenancePlan) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(PreventiveMaintenancePlansItemJsonController.class).show(preventiveMaintenancePlan))
            .buildAndExpand(preventiveMaintenancePlan.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedPreventiveMaintenancePlan
     * @param preventiveMaintenancePlan
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> PreventiveMaintenancePlansItemJsonController.update(@ModelAttribute PreventiveMaintenancePlan storedPreventiveMaintenancePlan, @Valid @RequestBody PreventiveMaintenancePlan preventiveMaintenancePlan, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        preventiveMaintenancePlan.setId(storedPreventiveMaintenancePlan.getId());
        getPreventiveMaintenancePlanService().save(preventiveMaintenancePlan);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param preventiveMaintenancePlan
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> PreventiveMaintenancePlansItemJsonController.delete(@ModelAttribute PreventiveMaintenancePlan preventiveMaintenancePlan) {
        getPreventiveMaintenancePlanService().delete(preventiveMaintenancePlan);
        return ResponseEntity.ok().build();
    }
    
}
