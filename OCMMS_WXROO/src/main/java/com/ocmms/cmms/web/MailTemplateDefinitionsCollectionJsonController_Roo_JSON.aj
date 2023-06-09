// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.system.MailTemplateDefinition;
import com.ocmms.cmms.service.api.MailTemplateDefinitionService;
import com.ocmms.cmms.web.MailTemplateDefinitionsCollectionJsonController;
import com.ocmms.cmms.web.MailTemplateDefinitionsItemJsonController;
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

privileged aspect MailTemplateDefinitionsCollectionJsonController_Roo_JSON {
    
    declare @type: MailTemplateDefinitionsCollectionJsonController: @RestController;
    
    declare @type: MailTemplateDefinitionsCollectionJsonController: @RequestMapping(value = "/api/mailtemplatedefinitions", name = "MailTemplateDefinitionsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MailTemplateDefinitionService MailTemplateDefinitionsCollectionJsonController.mailTemplateDefinitionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param mailTemplateDefinitionService
     */
    @Autowired
    public MailTemplateDefinitionsCollectionJsonController.new(MailTemplateDefinitionService mailTemplateDefinitionService) {
        this.mailTemplateDefinitionService = mailTemplateDefinitionService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MailTemplateDefinitionService
     */
    public MailTemplateDefinitionService MailTemplateDefinitionsCollectionJsonController.getMailTemplateDefinitionService() {
        return mailTemplateDefinitionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mailTemplateDefinitionService
     */
    public void MailTemplateDefinitionsCollectionJsonController.setMailTemplateDefinitionService(MailTemplateDefinitionService mailTemplateDefinitionService) {
        this.mailTemplateDefinitionService = mailTemplateDefinitionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<MailTemplateDefinition>> MailTemplateDefinitionsCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<MailTemplateDefinition> mailTemplateDefinitions = getMailTemplateDefinitionService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(mailTemplateDefinitions);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents MailTemplateDefinitionsCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(MailTemplateDefinitionsCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mailTemplateDefinition
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> MailTemplateDefinitionsCollectionJsonController.create(@Valid @RequestBody MailTemplateDefinition mailTemplateDefinition, BindingResult result) {
        
        if (mailTemplateDefinition.getId() != null || mailTemplateDefinition.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        MailTemplateDefinition newMailTemplateDefinition = getMailTemplateDefinitionService().save(mailTemplateDefinition);
        UriComponents showURI = MailTemplateDefinitionsItemJsonController.showURI(newMailTemplateDefinition);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mailTemplateDefinitions
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> MailTemplateDefinitionsCollectionJsonController.createBatch(@Valid @RequestBody Collection<MailTemplateDefinition> mailTemplateDefinitions, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMailTemplateDefinitionService().save(mailTemplateDefinitions);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param mailTemplateDefinitions
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> MailTemplateDefinitionsCollectionJsonController.updateBatch(@Valid @RequestBody Collection<MailTemplateDefinition> mailTemplateDefinitions, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getMailTemplateDefinitionService().save(mailTemplateDefinitions);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> MailTemplateDefinitionsCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getMailTemplateDefinitionService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
