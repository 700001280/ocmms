// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.service.api.PlannerGroupService;
import com.ocmms.cmms.web.PlannerGroupsItemJsonController;
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

privileged aspect PlannerGroupsItemJsonController_Roo_JSON {
    
    declare @type: PlannerGroupsItemJsonController: @RestController;
    
    declare @type: PlannerGroupsItemJsonController: @RequestMapping(value = "/api/plannergroups/{plannerGroup}", name = "PlannerGroupsItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PlannerGroupService PlannerGroupsItemJsonController.plannerGroupService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param plannerGroupService
     */
    @Autowired
    public PlannerGroupsItemJsonController.new(PlannerGroupService plannerGroupService) {
        this.plannerGroupService = plannerGroupService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PlannerGroupService
     */
    public PlannerGroupService PlannerGroupsItemJsonController.getPlannerGroupService() {
        return plannerGroupService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plannerGroupService
     */
    public void PlannerGroupsItemJsonController.setPlannerGroupService(PlannerGroupService plannerGroupService) {
        this.plannerGroupService = plannerGroupService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return PlannerGroup
     */
    @ModelAttribute
    public PlannerGroup PlannerGroupsItemJsonController.getPlannerGroup(@PathVariable("plannerGroup") Long id) {
        PlannerGroup plannerGroup = plannerGroupService.findOne(id);
        if (plannerGroup == null) {
            throw new NotFoundException(String.format("PlannerGroup with identifier '%s' not found",id));
        }
        return plannerGroup;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plannerGroup
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> PlannerGroupsItemJsonController.show(@ModelAttribute PlannerGroup plannerGroup) {
        return ResponseEntity.ok(plannerGroup);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plannerGroup
     * @return UriComponents
     */
    public static UriComponents PlannerGroupsItemJsonController.showURI(PlannerGroup plannerGroup) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(PlannerGroupsItemJsonController.class).show(plannerGroup))
            .buildAndExpand(plannerGroup.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedPlannerGroup
     * @param plannerGroup
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> PlannerGroupsItemJsonController.update(@ModelAttribute PlannerGroup storedPlannerGroup, @Valid @RequestBody PlannerGroup plannerGroup, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        plannerGroup.setId(storedPlannerGroup.getId());
        getPlannerGroupService().save(plannerGroup);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param plannerGroup
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> PlannerGroupsItemJsonController.delete(@ModelAttribute PlannerGroup plannerGroup) {
        getPlannerGroupService().delete(plannerGroup);
        return ResponseEntity.ok().build();
    }
    
}
