// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.system.ProjectMemo;
import com.ocmms.cmms.service.api.ProjectMemoService;
import com.ocmms.cmms.web.ProjectMemoesCollectionThymeleafController;
import com.ocmms.cmms.web.ProjectMemoesItemThymeleafController;
import com.ocmms.cmms.web.ProjectMemoesItemThymeleafLinkFactory;
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

privileged aspect ProjectMemoesItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: ProjectMemoesItemThymeleafController: @Controller;
    
    declare @type: ProjectMemoesItemThymeleafController: @RequestMapping(value = "/projectmemoes/{projectMemo}", name = "ProjectMemoesItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ProjectMemoService ProjectMemoesItemThymeleafController.projectMemoService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource ProjectMemoesItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<ProjectMemoesItemThymeleafController> ProjectMemoesItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<ProjectMemoesCollectionThymeleafController> ProjectMemoesItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<ProjectMemo> ProjectMemoesItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<ProjectMemo>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param projectMemoService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public ProjectMemoesItemThymeleafController.new(ProjectMemoService projectMemoService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setProjectMemoService(projectMemoService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(ProjectMemoesItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(ProjectMemoesCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return ProjectMemoService
     */
    public ProjectMemoService ProjectMemoesItemThymeleafController.getProjectMemoService() {
        return projectMemoService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param projectMemoService
     */
    public void ProjectMemoesItemThymeleafController.setProjectMemoService(ProjectMemoService projectMemoService) {
        this.projectMemoService = projectMemoService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource ProjectMemoesItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void ProjectMemoesItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<ProjectMemoesItemThymeleafController> ProjectMemoesItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void ProjectMemoesItemThymeleafController.setItemLink(MethodLinkBuilderFactory<ProjectMemoesItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<ProjectMemoesCollectionThymeleafController> ProjectMemoesItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void ProjectMemoesItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<ProjectMemoesCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return ProjectMemo
     */
    @ModelAttribute
    public ProjectMemo ProjectMemoesItemThymeleafController.getProjectMemo(@PathVariable("projectMemo") Long id, Locale locale, HttpMethod method) {
        ProjectMemo projectMemo = null;
        if (HttpMethod.PUT.equals(method)) {
            projectMemo = projectMemoService.findOneForUpdate(id);
        } else {
            projectMemo = projectMemoService.findOne(id);
        }
        
        if (projectMemo == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"ProjectMemo", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return projectMemo;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param projectMemo
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView ProjectMemoesItemThymeleafController.show(@ModelAttribute ProjectMemo projectMemo, Model model) {
        model.addAttribute("projectMemo", projectMemo);
        return new ModelAndView("projectmemoes/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param projectMemo
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView ProjectMemoesItemThymeleafController.showInline(@ModelAttribute ProjectMemo projectMemo, Model model) {
        model.addAttribute("projectMemo", projectMemo);
        return new ModelAndView("projectmemoes/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void ProjectMemoesItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void ProjectMemoesItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<ProjectMemo> ProjectMemoesItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String ProjectMemoesItemThymeleafController.getModelName() {
        return "projectMemo";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String ProjectMemoesItemThymeleafController.getEditViewPath() {
        return "projectmemoes/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer ProjectMemoesItemThymeleafController.getLastVersion(ProjectMemo record) {
        Long versionValue = getProjectMemoService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView ProjectMemoesItemThymeleafController.populateAndGetFormView(ProjectMemo entity, Model model) {
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
    @InitBinder("projectMemo")
    public void ProjectMemoesItemThymeleafController.initProjectMemoBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(ProjectMemo.class, getProjectMemoService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param projectMemo
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView ProjectMemoesItemThymeleafController.editForm(@ModelAttribute ProjectMemo projectMemo, Model model) {
        populateForm(model);
        
        model.addAttribute("projectMemo", projectMemo);
        return new ModelAndView("projectmemoes/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param projectMemo
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView ProjectMemoesItemThymeleafController.update(@Valid @ModelAttribute ProjectMemo projectMemo, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        ProjectMemo savedProjectMemo = getConcurrencyTemplate().execute(projectMemo, model, new ConcurrencyCallback<ProjectMemo>() {
            @Override
            public ProjectMemo doInConcurrency(ProjectMemo projectMemo) throws Exception {
                return getProjectMemoService().save(projectMemo);
            }
        });
        UriComponents showURI = getItemLink().to(ProjectMemoesItemThymeleafLinkFactory.SHOW).with("projectMemo", savedProjectMemo.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param projectMemo
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> ProjectMemoesItemThymeleafController.delete(@ModelAttribute ProjectMemo projectMemo) {
        getProjectMemoService().delete(projectMemo);
        return ResponseEntity.ok().build();
    }
    
}
