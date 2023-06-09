// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.configuration.AuthourizationGroup;
import com.ocmms.cmms.service.api.AuthourizationGroupService;
import com.ocmms.cmms.web.AuthourizationGroupsCollectionJsonController;
import com.ocmms.cmms.web.AuthourizationGroupsItemJsonController;
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

privileged aspect AuthourizationGroupsCollectionJsonController_Roo_JSON {
    
    declare @type: AuthourizationGroupsCollectionJsonController: @RestController;
    
    declare @type: AuthourizationGroupsCollectionJsonController: @RequestMapping(value = "/api/authourizationgroups", name = "AuthourizationGroupsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private AuthourizationGroupService AuthourizationGroupsCollectionJsonController.authourizationGroupService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param authourizationGroupService
     */
    @Autowired
    public AuthourizationGroupsCollectionJsonController.new(AuthourizationGroupService authourizationGroupService) {
        this.authourizationGroupService = authourizationGroupService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return AuthourizationGroupService
     */
    public AuthourizationGroupService AuthourizationGroupsCollectionJsonController.getAuthourizationGroupService() {
        return authourizationGroupService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param authourizationGroupService
     */
    public void AuthourizationGroupsCollectionJsonController.setAuthourizationGroupService(AuthourizationGroupService authourizationGroupService) {
        this.authourizationGroupService = authourizationGroupService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<AuthourizationGroup>> AuthourizationGroupsCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<AuthourizationGroup> authourizationGroups = getAuthourizationGroupService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(authourizationGroups);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents AuthourizationGroupsCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(AuthourizationGroupsCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param authourizationGroup
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> AuthourizationGroupsCollectionJsonController.create(@Valid @RequestBody AuthourizationGroup authourizationGroup, BindingResult result) {
        
        if (authourizationGroup.getId() != null || authourizationGroup.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        AuthourizationGroup newAuthourizationGroup = getAuthourizationGroupService().save(authourizationGroup);
        UriComponents showURI = AuthourizationGroupsItemJsonController.showURI(newAuthourizationGroup);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param authourizationGroups
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> AuthourizationGroupsCollectionJsonController.createBatch(@Valid @RequestBody Collection<AuthourizationGroup> authourizationGroups, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getAuthourizationGroupService().save(authourizationGroups);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param authourizationGroups
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> AuthourizationGroupsCollectionJsonController.updateBatch(@Valid @RequestBody Collection<AuthourizationGroup> authourizationGroups, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getAuthourizationGroupService().save(authourizationGroups);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> AuthourizationGroupsCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getAuthourizationGroupService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
