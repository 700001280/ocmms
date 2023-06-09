// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.task.TaskActivityType;
import com.ocmms.cmms.service.api.TaskActivityTypeService;
import com.ocmms.cmms.web.TaskActivityTypesCollectionJsonController;
import com.ocmms.cmms.web.TaskActivityTypesItemJsonController;
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

privileged aspect TaskActivityTypesCollectionJsonController_Roo_JSON {
    
    declare @type: TaskActivityTypesCollectionJsonController: @RestController;
    
    declare @type: TaskActivityTypesCollectionJsonController: @RequestMapping(value = "/api/taskactivitytypes", name = "TaskActivityTypesCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private TaskActivityTypeService TaskActivityTypesCollectionJsonController.taskActivityTypeService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param taskActivityTypeService
     */
    @Autowired
    public TaskActivityTypesCollectionJsonController.new(TaskActivityTypeService taskActivityTypeService) {
        this.taskActivityTypeService = taskActivityTypeService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return TaskActivityTypeService
     */
    public TaskActivityTypeService TaskActivityTypesCollectionJsonController.getTaskActivityTypeService() {
        return taskActivityTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskActivityTypeService
     */
    public void TaskActivityTypesCollectionJsonController.setTaskActivityTypeService(TaskActivityTypeService taskActivityTypeService) {
        this.taskActivityTypeService = taskActivityTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<TaskActivityType>> TaskActivityTypesCollectionJsonController.list(GlobalSearch globalSearch, Pageable pageable) {
        
        Page<TaskActivityType> taskActivityTypes = getTaskActivityTypeService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(taskActivityTypes);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return UriComponents
     */
    public static UriComponents TaskActivityTypesCollectionJsonController.listURI() {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(TaskActivityTypesCollectionJsonController.class).list(null, null))
            .build().encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskActivityType
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(name = "create")
    public ResponseEntity<?> TaskActivityTypesCollectionJsonController.create(@Valid @RequestBody TaskActivityType taskActivityType, BindingResult result) {
        
        if (taskActivityType.getId() != null || taskActivityType.getVersion() != null) {        
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        TaskActivityType newTaskActivityType = getTaskActivityTypeService().save(taskActivityType);
        UriComponents showURI = TaskActivityTypesItemJsonController.showURI(newTaskActivityType);
        
        return ResponseEntity.created(showURI.toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskActivityTypes
     * @param result
     * @return ResponseEntity
     */
    @PostMapping(value = "/batch", name = "createBatch")
    public ResponseEntity<?> TaskActivityTypesCollectionJsonController.createBatch(@Valid @RequestBody Collection<TaskActivityType> taskActivityTypes, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getTaskActivityTypeService().save(taskActivityTypes);
        
        return ResponseEntity.created(listURI().toUri()).build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskActivityTypes
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(value = "/batch", name = "updateBatch")
    public ResponseEntity<?> TaskActivityTypesCollectionJsonController.updateBatch(@Valid @RequestBody Collection<TaskActivityType> taskActivityTypes, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        
        getTaskActivityTypeService().save(taskActivityTypes);
        
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @return ResponseEntity
     */
    @DeleteMapping(value = "/batch/{ids}", name = "deleteBatch")
    public ResponseEntity<?> TaskActivityTypesCollectionJsonController.deleteBatch(@PathVariable("ids") Collection<Long> ids) {
        
        getTaskActivityTypeService().delete(ids);
        
        return ResponseEntity.ok().build();
    }
    
}
