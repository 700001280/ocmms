// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.service.api.MainWorkCenterService;
import com.ocmms.cmms.web.MainWorkCentersItemJsonController;
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

privileged aspect MainWorkCentersItemJsonController_Roo_JSON {
    
    declare @type: MainWorkCentersItemJsonController: @RestController;
    
    declare @type: MainWorkCentersItemJsonController: @RequestMapping(value = "/api/mainworkcenters/{mainWorkCenter}", name = "MainWorkCentersItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MainWorkCenterService MainWorkCentersItemJsonController.mainWorkCenterService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param mainWorkCenterService
     */
    @Autowired
    public MainWorkCentersItemJsonController.new(MainWorkCenterService mainWorkCenterService) {
        this.mainWorkCenterService = mainWorkCenterService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MainWorkCenterService
     */
    public MainWorkCenterService MainWorkCentersItemJsonController.getMainWorkCenterService() {
        return mainWorkCenterService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mainWorkCenterService
     */
    public void MainWorkCentersItemJsonController.setMainWorkCenterService(MainWorkCenterService mainWorkCenterService) {
        this.mainWorkCenterService = mainWorkCenterService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return MainWorkCenter
     */
    @ModelAttribute
    public MainWorkCenter MainWorkCentersItemJsonController.getMainWorkCenter(@PathVariable("mainWorkCenter") Long id) {
        MainWorkCenter mainWorkCenter = mainWorkCenterService.findOne(id);
        if (mainWorkCenter == null) {
            throw new NotFoundException(String.format("MainWorkCenter with identifier '%s' not found",id));
        }
        return mainWorkCenter;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mainWorkCenter
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> MainWorkCentersItemJsonController.show(@ModelAttribute MainWorkCenter mainWorkCenter) {
        return ResponseEntity.ok(mainWorkCenter);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mainWorkCenter
     * @return UriComponents
     */
    public static UriComponents MainWorkCentersItemJsonController.showURI(MainWorkCenter mainWorkCenter) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(MainWorkCentersItemJsonController.class).show(mainWorkCenter))
            .buildAndExpand(mainWorkCenter.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedMainWorkCenter
     * @param mainWorkCenter
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> MainWorkCentersItemJsonController.update(@ModelAttribute MainWorkCenter storedMainWorkCenter, @Valid @RequestBody MainWorkCenter mainWorkCenter, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        mainWorkCenter.setId(storedMainWorkCenter.getId());
        getMainWorkCenterService().save(mainWorkCenter);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mainWorkCenter
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> MainWorkCentersItemJsonController.delete(@ModelAttribute MainWorkCenter mainWorkCenter) {
        getMainWorkCenterService().delete(mainWorkCenter);
        return ResponseEntity.ok().build();
    }
    
}
