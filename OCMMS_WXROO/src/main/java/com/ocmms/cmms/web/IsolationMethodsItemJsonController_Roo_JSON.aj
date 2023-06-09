// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.loto.IsolationMethod;
import com.ocmms.cmms.service.api.IsolationMethodService;
import com.ocmms.cmms.web.IsolationMethodsItemJsonController;
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

privileged aspect IsolationMethodsItemJsonController_Roo_JSON {
    
    declare @type: IsolationMethodsItemJsonController: @RestController;
    
    declare @type: IsolationMethodsItemJsonController: @RequestMapping(value = "/api/isolationmethods/{isolationMethod}", name = "IsolationMethodsItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private IsolationMethodService IsolationMethodsItemJsonController.isolationMethodService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param isolationMethodService
     */
    @Autowired
    public IsolationMethodsItemJsonController.new(IsolationMethodService isolationMethodService) {
        this.isolationMethodService = isolationMethodService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return IsolationMethodService
     */
    public IsolationMethodService IsolationMethodsItemJsonController.getIsolationMethodService() {
        return isolationMethodService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param isolationMethodService
     */
    public void IsolationMethodsItemJsonController.setIsolationMethodService(IsolationMethodService isolationMethodService) {
        this.isolationMethodService = isolationMethodService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return IsolationMethod
     */
    @ModelAttribute
    public IsolationMethod IsolationMethodsItemJsonController.getIsolationMethod(@PathVariable("isolationMethod") Long id) {
        IsolationMethod isolationMethod = isolationMethodService.findOne(id);
        if (isolationMethod == null) {
            throw new NotFoundException(String.format("IsolationMethod with identifier '%s' not found",id));
        }
        return isolationMethod;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param isolationMethod
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> IsolationMethodsItemJsonController.show(@ModelAttribute IsolationMethod isolationMethod) {
        return ResponseEntity.ok(isolationMethod);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param isolationMethod
     * @return UriComponents
     */
    public static UriComponents IsolationMethodsItemJsonController.showURI(IsolationMethod isolationMethod) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(IsolationMethodsItemJsonController.class).show(isolationMethod))
            .buildAndExpand(isolationMethod.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedIsolationMethod
     * @param isolationMethod
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> IsolationMethodsItemJsonController.update(@ModelAttribute IsolationMethod storedIsolationMethod, @Valid @RequestBody IsolationMethod isolationMethod, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        isolationMethod.setId(storedIsolationMethod.getId());
        getIsolationMethodService().save(isolationMethod);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param isolationMethod
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> IsolationMethodsItemJsonController.delete(@ModelAttribute IsolationMethod isolationMethod) {
        getIsolationMethodService().delete(isolationMethod);
        return ResponseEntity.ok().build();
    }
    
}
