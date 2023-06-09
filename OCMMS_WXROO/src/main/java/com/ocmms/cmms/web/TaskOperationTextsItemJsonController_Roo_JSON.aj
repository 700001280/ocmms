// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.task.TaskOperationText;
import com.ocmms.cmms.service.api.TaskOperationTextService;
import com.ocmms.cmms.web.TaskOperationTextsItemJsonController;
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

privileged aspect TaskOperationTextsItemJsonController_Roo_JSON {
    
    declare @type: TaskOperationTextsItemJsonController: @RestController;
    
    declare @type: TaskOperationTextsItemJsonController: @RequestMapping(value = "/api/taskoperationtexts/{taskOperationText}", name = "TaskOperationTextsItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private TaskOperationTextService TaskOperationTextsItemJsonController.taskOperationTextService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param taskOperationTextService
     */
    @Autowired
    public TaskOperationTextsItemJsonController.new(TaskOperationTextService taskOperationTextService) {
        this.taskOperationTextService = taskOperationTextService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return TaskOperationTextService
     */
    public TaskOperationTextService TaskOperationTextsItemJsonController.getTaskOperationTextService() {
        return taskOperationTextService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskOperationTextService
     */
    public void TaskOperationTextsItemJsonController.setTaskOperationTextService(TaskOperationTextService taskOperationTextService) {
        this.taskOperationTextService = taskOperationTextService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return TaskOperationText
     */
    @ModelAttribute
    public TaskOperationText TaskOperationTextsItemJsonController.getTaskOperationText(@PathVariable("taskOperationText") Long id) {
        TaskOperationText taskOperationText = taskOperationTextService.findOne(id);
        if (taskOperationText == null) {
            throw new NotFoundException(String.format("TaskOperationText with identifier '%s' not found",id));
        }
        return taskOperationText;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskOperationText
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> TaskOperationTextsItemJsonController.show(@ModelAttribute TaskOperationText taskOperationText) {
        return ResponseEntity.ok(taskOperationText);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskOperationText
     * @return UriComponents
     */
    public static UriComponents TaskOperationTextsItemJsonController.showURI(TaskOperationText taskOperationText) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(TaskOperationTextsItemJsonController.class).show(taskOperationText))
            .buildAndExpand(taskOperationText.getId()).encode();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storedTaskOperationText
     * @param taskOperationText
     * @param result
     * @return ResponseEntity
     */
    @PutMapping(name = "update")
    public ResponseEntity<?> TaskOperationTextsItemJsonController.update(@ModelAttribute TaskOperationText storedTaskOperationText, @Valid @RequestBody TaskOperationText taskOperationText, BindingResult result) {
        
        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(result);
        }
        taskOperationText.setId(storedTaskOperationText.getId());
        getTaskOperationTextService().save(taskOperationText);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskOperationText
     * @return ResponseEntity
     */
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> TaskOperationTextsItemJsonController.delete(@ModelAttribute TaskOperationText taskOperationText) {
        getTaskOperationTextService().delete(taskOperationText);
        return ResponseEntity.ok().build();
    }
    
}
