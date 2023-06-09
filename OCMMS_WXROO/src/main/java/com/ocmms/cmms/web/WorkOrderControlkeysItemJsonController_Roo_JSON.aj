// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.workorder.WorkOrderControlkey;
import com.ocmms.cmms.service.api.WorkOrderControlkeyService;
import com.ocmms.cmms.web.WorkOrderControlkeysItemJsonController;
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

privileged aspect WorkOrderControlkeysItemJsonController_Roo_JSON {
    
    declare @type: WorkOrderControlkeysItemJsonController: @RestController;
    
    declare @type: WorkOrderControlkeysItemJsonController: @RequestMapping(value = "/api/workordercontrolkeys/{workOrderControlkey}", name = "WorkOrderControlkeysItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private WorkOrderControlkeyService WorkOrderControlkeysItemJsonController.workOrderControlkeyService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param workOrderControlkeyService
     */
    @Autowired
    public WorkOrderControlkeysItemJsonController.new(WorkOrderControlkeyService workOrderControlkeyService) {
        this.workOrderControlkeyService = workOrderControlkeyService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return WorkOrderControlkeyService
     */
    public WorkOrderControlkeyService WorkOrderControlkeysItemJsonController.getWorkOrderControlkeyService() {
        return workOrderControlkeyService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderControlkeyService
     */
    public void WorkOrderControlkeysItemJsonController.setWorkOrderControlkeyService(WorkOrderControlkeyService workOrderControlkeyService) {
        this.workOrderControlkeyService = workOrderControlkeyService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return WorkOrderControlkey
     */
    @ModelAttribute
    public WorkOrderControlkey WorkOrderControlkeysItemJsonController.getWorkOrderControlkey(@PathVariable("workOrderControlkey") Long id) {
        WorkOrderControlkey workOrderControlkey = workOrderControlkeyService.findOne(id);
        if (workOrderControlkey == null) {
            throw new NotFoundException(String.format("WorkOrderControlkey with identifier '%s' not found",id));
        }
        return workOrderControlkey;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderControlkey
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> WorkOrderControlkeysItemJsonController.show(@ModelAttribute WorkOrderControlkey workOrderControlkey) {
        return ResponseEntity.ok(workOrderControlkey);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderControlkey
     * @return UriComponents
     */
    public static UriComponents WorkOrderControlkeysItemJsonController.showURI(WorkOrderControlkey workOrderControlkey) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(WorkOrderControlkeysItemJsonController.class).show(workOrderControlkey))
            .buildAndExpand(workOrderControlkey.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedWorkOrderControlkey
     * @param workOrderControlkey
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> WorkOrderControlkeysItemJsonController.update(@ModelAttribute WorkOrderControlkey storedWorkOrderControlkey, @Valid @RequestBody WorkOrderControlkey workOrderControlkey, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        workOrderControlkey.setId(storedWorkOrderControlkey.getId());
        getWorkOrderControlkeyService().save(workOrderControlkey);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderControlkey
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> WorkOrderControlkeysItemJsonController.delete(@ModelAttribute WorkOrderControlkey workOrderControlkey) {
        getWorkOrderControlkeyService().delete(workOrderControlkey);
        return ResponseEntity.ok().build();
    }
    
}
