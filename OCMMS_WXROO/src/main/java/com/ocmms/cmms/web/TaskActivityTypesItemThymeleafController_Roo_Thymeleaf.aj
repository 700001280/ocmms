// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.task.TaskActivityType;
import com.ocmms.cmms.service.api.TaskActivityTypeService;
import com.ocmms.cmms.web.TaskActivityTypesCollectionThymeleafController;
import com.ocmms.cmms.web.TaskActivityTypesItemThymeleafController;
import com.ocmms.cmms.web.TaskActivityTypesItemThymeleafLinkFactory;
import io.springlets.data.web.validation.GenericValidator;
import io.springlets.web.NotFoundException;
import io.springlets.web.mvc.util.ControllerMethodLinkBuilderFactory;
import io.springlets.web.mvc.util.MethodLinkBuilderFactory;
import io.springlets.web.mvc.util.concurrency.ConcurrencyCallback;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import io.springlets.web.mvc.util.concurrency.ConcurrencyTemplate;
import java.util.Locale;
import javax.validation.Valid;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponents;

privileged aspect TaskActivityTypesItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: TaskActivityTypesItemThymeleafController: @Controller;
    
    declare @type: TaskActivityTypesItemThymeleafController: @RequestMapping(value = "/taskactivitytypes/{taskActivityType}", name = "TaskActivityTypesItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private TaskActivityTypeService TaskActivityTypesItemThymeleafController.taskActivityTypeService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource TaskActivityTypesItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<TaskActivityTypesItemThymeleafController> TaskActivityTypesItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<TaskActivityTypesCollectionThymeleafController> TaskActivityTypesItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<TaskActivityType> TaskActivityTypesItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<TaskActivityType>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param taskActivityTypeService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public TaskActivityTypesItemThymeleafController.new(TaskActivityTypeService taskActivityTypeService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setTaskActivityTypeService(taskActivityTypeService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(TaskActivityTypesItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(TaskActivityTypesCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return TaskActivityTypeService
     */
    public TaskActivityTypeService TaskActivityTypesItemThymeleafController.getTaskActivityTypeService() {
        return taskActivityTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskActivityTypeService
     */
    public void TaskActivityTypesItemThymeleafController.setTaskActivityTypeService(TaskActivityTypeService taskActivityTypeService) {
        this.taskActivityTypeService = taskActivityTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource TaskActivityTypesItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void TaskActivityTypesItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<TaskActivityTypesItemThymeleafController> TaskActivityTypesItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void TaskActivityTypesItemThymeleafController.setItemLink(MethodLinkBuilderFactory<TaskActivityTypesItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<TaskActivityTypesCollectionThymeleafController> TaskActivityTypesItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void TaskActivityTypesItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<TaskActivityTypesCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return TaskActivityType
     */
    @ModelAttribute
    public TaskActivityType TaskActivityTypesItemThymeleafController.getTaskActivityType(@PathVariable("taskActivityType") Long id, Locale locale, HttpMethod method) {
        TaskActivityType taskActivityType = null;
        if (HttpMethod.PUT.equals(method)) {
            taskActivityType = taskActivityTypeService.findOneForUpdate(id);
        } else {
            taskActivityType = taskActivityTypeService.findOne(id);
        }
        
        if (taskActivityType == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"TaskActivityType", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return taskActivityType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskActivityType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView TaskActivityTypesItemThymeleafController.show(@ModelAttribute TaskActivityType taskActivityType, Model model) {
        model.addAttribute("taskActivityType", taskActivityType);
        return new ModelAndView("taskactivitytypes/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskActivityType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView TaskActivityTypesItemThymeleafController.showInline(@ModelAttribute TaskActivityType taskActivityType, Model model) {
        model.addAttribute("taskActivityType", taskActivityType);
        return new ModelAndView("taskactivitytypes/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void TaskActivityTypesItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void TaskActivityTypesItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<TaskActivityType> TaskActivityTypesItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String TaskActivityTypesItemThymeleafController.getModelName() {
        return "taskActivityType";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String TaskActivityTypesItemThymeleafController.getEditViewPath() {
        return "taskactivitytypes/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer TaskActivityTypesItemThymeleafController.getLastVersion(TaskActivityType record) {
        Long versionValue = getTaskActivityTypeService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView TaskActivityTypesItemThymeleafController.populateAndGetFormView(TaskActivityType entity, Model model) {
        // Populate the form with all the necessary elements
        populateForm(model);
        // Add concurrency attribute to the model to show the concurrency form
        // in the current edit view
        model.addAttribute("concurrency", true);
        // Add the new version value to the model.
        model.addAttribute("newVersion", getLastVersion(entity));
        // Add the current pet values to maintain the values introduced by the user
        model.addAttribute(getModelName(), entity);
        // Return the edit view path
        return new org.springframework.web.servlet.ModelAndView(getEditViewPath(), model.asMap());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param binder
     */
    @InitBinder("taskActivityType")
    public void TaskActivityTypesItemThymeleafController.initTaskActivityTypeBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(TaskActivityType.class, getTaskActivityTypeService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskActivityType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView TaskActivityTypesItemThymeleafController.editForm(@ModelAttribute TaskActivityType taskActivityType, Model model) {
        populateForm(model);
        
        model.addAttribute("taskActivityType", taskActivityType);
        return new ModelAndView("taskactivitytypes/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskActivityType
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView TaskActivityTypesItemThymeleafController.update(@Valid @ModelAttribute TaskActivityType taskActivityType, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        TaskActivityType savedTaskActivityType = getConcurrencyTemplate().execute(taskActivityType, model, new ConcurrencyCallback<TaskActivityType>() {
            @Override
            public TaskActivityType doInConcurrency(TaskActivityType taskActivityType) throws Exception {
                return getTaskActivityTypeService().save(taskActivityType);
            }
        });
        UriComponents showURI = getItemLink().to(TaskActivityTypesItemThymeleafLinkFactory.SHOW).with("taskActivityType", savedTaskActivityType.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskActivityType
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> TaskActivityTypesItemThymeleafController.delete(@ModelAttribute TaskActivityType taskActivityType) {
        getTaskActivityTypeService().delete(taskActivityType);
        return ResponseEntity.ok().build();
    }
    
}
