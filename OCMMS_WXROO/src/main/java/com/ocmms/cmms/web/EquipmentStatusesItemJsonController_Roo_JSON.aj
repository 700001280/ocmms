// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatus;
import com.ocmms.cmms.service.api.EquipmentStatusService;
import com.ocmms.cmms.web.EquipmentStatusesItemJsonController;
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

privileged aspect EquipmentStatusesItemJsonController_Roo_JSON {
    
    declare @type: EquipmentStatusesItemJsonController: @RestController;
    
    declare @type: EquipmentStatusesItemJsonController: @RequestMapping(value = "/api/equipmentstatuses/{equipmentStatus}", name = "EquipmentStatusesItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private EquipmentStatusService EquipmentStatusesItemJsonController.equipmentStatusService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param equipmentStatusService
     */
    @Autowired
    public EquipmentStatusesItemJsonController.new(EquipmentStatusService equipmentStatusService) {
        this.equipmentStatusService = equipmentStatusService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return EquipmentStatusService
     */
    public EquipmentStatusService EquipmentStatusesItemJsonController.getEquipmentStatusService() {
        return equipmentStatusService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentStatusService
     */
    public void EquipmentStatusesItemJsonController.setEquipmentStatusService(EquipmentStatusService equipmentStatusService) {
        this.equipmentStatusService = equipmentStatusService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return EquipmentStatus
     */
    @ModelAttribute
    public EquipmentStatus EquipmentStatusesItemJsonController.getEquipmentStatus(@PathVariable("equipmentStatus") Long id) {
        EquipmentStatus equipmentStatus = equipmentStatusService.findOne(id);
        if (equipmentStatus == null) {
            throw new NotFoundException(String.format("EquipmentStatus with identifier '%s' not found",id));
        }
        return equipmentStatus;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentStatus
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> EquipmentStatusesItemJsonController.show(@ModelAttribute EquipmentStatus equipmentStatus) {
        return ResponseEntity.ok(equipmentStatus);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentStatus
     * @return UriComponents
     */
    public static UriComponents EquipmentStatusesItemJsonController.showURI(EquipmentStatus equipmentStatus) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(EquipmentStatusesItemJsonController.class).show(equipmentStatus))
            .buildAndExpand(equipmentStatus.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedEquipmentStatus
     * @param equipmentStatus
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> EquipmentStatusesItemJsonController.update(@ModelAttribute EquipmentStatus storedEquipmentStatus, @Valid @RequestBody EquipmentStatus equipmentStatus, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        equipmentStatus.setId(storedEquipmentStatus.getId());
        getEquipmentStatusService().save(equipmentStatus);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentStatus
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> EquipmentStatusesItemJsonController.delete(@ModelAttribute EquipmentStatus equipmentStatus) {
        getEquipmentStatusService().delete(equipmentStatus);
        return ResponseEntity.ok().build();
    }
    
}
