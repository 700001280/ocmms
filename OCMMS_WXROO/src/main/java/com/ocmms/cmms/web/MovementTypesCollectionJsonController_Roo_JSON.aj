// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.storage.MovementType;
import com.ocmms.cmms.service.api.MovementTypeService;
import com.ocmms.cmms.web.MovementTypesCollectionJsonController;
import com.ocmms.cmms.web.MovementTypesItemJsonController;
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

privileged aspect MovementTypesCollectionJsonController_Roo_JSON {
    
    declare @type: MovementTypesCollectionJsonController: @RestController;
    
    declare @type: MovementTypesCollectionJsonController: @RequestMapping(value = "/api/movementtypes", name = "MovementTypesCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MovementTypeService MovementTypesCollectionJsonController.movementTypeService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param movementTypeService
     */
    @Autowired
    public MovementTypesCollectionJsonController.new(MovementTypeService movementTypeService) {
        this.movementTypeService = movementTypeService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MovementTypeService
     */
    public MovementTypeService MovementTypesCollectionJsonController.getMovementTypeService() {
        return movementTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param movementTypeService
     */
    public void MovementTypesCollectionJsonController.setMovementTypeService(MovementTypeService movementTypeService) {
        this.movementTypeService = movementTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<MovementType>> MovementTypesCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<MovementType> movementTypes = getMovementTypeService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(movementTypes);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents MovementTypesCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(MovementTypesCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param movementType
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> MovementTypesCollectionJsonController.create(@Valid @RequestBody MovementType movementType, BindingResult result) {
        
        if (movementType.getId() != null || movementType.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        MovementType newMovementType = getMovementTypeService().save(movementType);
        UriComponents showURI = MovementTypesItemJsonController.showURI(newMovementType);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param movementTypes
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> MovementTypesCollectionJsonController.createBatch(@Valid @RequestBody Collection<MovementType> movementTypes, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMovementTypeService().save(movementTypes);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param movementTypes
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> MovementTypesCollectionJsonController.updateBatch(@Valid @RequestBody Collection<MovementType> movementTypes, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMovementTypeService().save(movementTypes);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> MovementTypesCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getMovementTypeService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
