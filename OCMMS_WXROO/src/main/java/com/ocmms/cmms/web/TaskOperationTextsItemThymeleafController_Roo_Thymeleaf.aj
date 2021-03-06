// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.task.TaskOperationText;
import com.ocmms.cmms.service.api.TaskOperationTextService;
import com.ocmms.cmms.web.TaskOperationTextsCollectionThymeleafController;
import com.ocmms.cmms.web.TaskOperationTextsItemThymeleafController;
import com.ocmms.cmms.web.TaskOperationTextsItemThymeleafLinkFactory;
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

privileged aspect TaskOperationTextsItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: TaskOperationTextsItemThymeleafController: @Controller;
    
    declare @type: TaskOperationTextsItemThymeleafController: @RequestMapping(value = "/taskoperationtexts/{taskOperationText}", name = "TaskOperationTextsItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private TaskOperationTextService TaskOperationTextsItemThymeleafController.taskOperationTextService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource TaskOperationTextsItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<TaskOperationTextsItemThymeleafController> TaskOperationTextsItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<TaskOperationTextsCollectionThymeleafController> TaskOperationTextsItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<TaskOperationText> TaskOperationTextsItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<TaskOperationText>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param taskOperationTextService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public TaskOperationTextsItemThymeleafController.new(TaskOperationTextService taskOperationTextService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setTaskOperationTextService(taskOperationTextService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(TaskOperationTextsItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(TaskOperationTextsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return TaskOperationTextService
     */
    public TaskOperationTextService TaskOperationTextsItemThymeleafController.getTaskOperationTextService() {
        return taskOperationTextService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskOperationTextService
     */
    public void TaskOperationTextsItemThymeleafController.setTaskOperationTextService(TaskOperationTextService taskOperationTextService) {
        this.taskOperationTextService = taskOperationTextService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource TaskOperationTextsItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void TaskOperationTextsItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<TaskOperationTextsItemThymeleafController> TaskOperationTextsItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void TaskOperationTextsItemThymeleafController.setItemLink(MethodLinkBuilderFactory<TaskOperationTextsItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<TaskOperationTextsCollectionThymeleafController> TaskOperationTextsItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void TaskOperationTextsItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<TaskOperationTextsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return TaskOperationText
     */
    @ModelAttribute
    public TaskOperationText TaskOperationTextsItemThymeleafController.getTaskOperationText(@PathVariable("taskOperationText") Long id, Locale locale, HttpMethod method) {
        TaskOperationText taskOperationText = null;
        if (HttpMethod.PUT.equals(method)) {
            taskOperationText = taskOperationTextService.findOneForUpdate(id);
        } else {
            taskOperationText = taskOperationTextService.findOne(id);
        }
        
        if (taskOperationText == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"TaskOperationText", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return taskOperationText;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskOperationText
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView TaskOperationTextsItemThymeleafController.show(@ModelAttribute TaskOperationText taskOperationText, Model model) {
        model.addAttribute("taskOperationText", taskOperationText);
        return new ModelAndView("taskoperationtexts/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskOperationText
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView TaskOperationTextsItemThymeleafController.showInline(@ModelAttribute TaskOperationText taskOperationText, Model model) {
        model.addAttribute("taskOperationText", taskOperationText);
        return new ModelAndView("taskoperationtexts/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void TaskOperationTextsItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void TaskOperationTextsItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<TaskOperationText> TaskOperationTextsItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String TaskOperationTextsItemThymeleafController.getModelName() {
        return "taskOperationText";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String TaskOperationTextsItemThymeleafController.getEditViewPath() {
        return "taskoperationtexts/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer TaskOperationTextsItemThymeleafController.getLastVersion(TaskOperationText record) {
        Long versionValue = getTaskOperationTextService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView TaskOperationTextsItemThymeleafController.populateAndGetFormView(TaskOperationText entity, Model model) {
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
    @InitBinder("taskOperationText")
    public void TaskOperationTextsItemThymeleafController.initTaskOperationTextBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(TaskOperationText.class, getTaskOperationTextService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskOperationText
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView TaskOperationTextsItemThymeleafController.editForm(@ModelAttribute TaskOperationText taskOperationText, Model model) {
        populateForm(model);
        
        model.addAttribute("taskOperationText", taskOperationText);
        return new ModelAndView("taskoperationtexts/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskOperationText
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView TaskOperationTextsItemThymeleafController.update(@Valid @ModelAttribute TaskOperationText taskOperationText, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        TaskOperationText savedTaskOperationText = getConcurrencyTemplate().execute(taskOperationText, model, new ConcurrencyCallback<TaskOperationText>() {
            @Override
            public TaskOperationText doInConcurrency(TaskOperationText taskOperationText) throws Exception {
                return getTaskOperationTextService().save(taskOperationText);
            }
        });
        UriComponents showURI = getItemLink().to(TaskOperationTextsItemThymeleafLinkFactory.SHOW).with("taskOperationText", savedTaskOperationText.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param taskOperationText
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> TaskOperationTextsItemThymeleafController.delete(@ModelAttribute TaskOperationText taskOperationText) {
        getTaskOperationTextService().delete(taskOperationText);
        return ResponseEntity.ok().build();
    }
    
}
