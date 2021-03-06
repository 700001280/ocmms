// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.Hoist;
import com.ocmms.cmms.service.api.HoistService;
import com.ocmms.cmms.web.HoistsItemJsonController;
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

privileged aspect HoistsItemJsonController_Roo_JSON {
    
    declare @type: HoistsItemJsonController: @RestController;
    
    declare @type: HoistsItemJsonController: @RequestMapping(value = "/api/hoists/{hoist}", name = "HoistsItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private HoistService HoistsItemJsonController.hoistService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param hoistService
     */
    @Autowired
    public HoistsItemJsonController.new(HoistService hoistService) {
        this.hoistService = hoistService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return HoistService
     */
    public HoistService HoistsItemJsonController.getHoistService() {
        return hoistService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param hoistService
     */
    public void HoistsItemJsonController.setHoistService(HoistService hoistService) {
        this.hoistService = hoistService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Hoist
     */
    @ModelAttribute
    public Hoist HoistsItemJsonController.getHoist(@PathVariable("hoist") Long id) {
        Hoist hoist = hoistService.findOne(id);
        if (hoist == null) {
            throw new NotFoundException(String.format("Hoist with identifier '%s' not found",id));
        }
        return hoist;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param hoist
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> HoistsItemJsonController.show(@ModelAttribute Hoist hoist) {
        return ResponseEntity.ok(hoist);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param hoist
     * @return UriComponents
     */
    public static UriComponents HoistsItemJsonController.showURI(Hoist hoist) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(HoistsItemJsonController.class).show(hoist))
            .buildAndExpand(hoist.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedHoist
     * @param hoist
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> HoistsItemJsonController.update(@ModelAttribute Hoist storedHoist, @Valid @RequestBody Hoist hoist, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        hoist.setId(storedHoist.getId());
        getHoistService().save(hoist);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param hoist
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> HoistsItemJsonController.delete(@ModelAttribute Hoist hoist) {
        getHoistService().delete(hoist);
        return ResponseEntity.ok().build();
    }
    
}
