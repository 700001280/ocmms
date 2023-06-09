// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.master.InstockType;
import com.ocmms.cmms.service.api.InstockTypeService;
import com.ocmms.cmms.web.InstockTypesCollectionThymeleafController;
import com.ocmms.cmms.web.InstockTypesItemThymeleafController;
import com.ocmms.cmms.web.InstockTypesItemThymeleafLinkFactory;
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

privileged aspect InstockTypesItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: InstockTypesItemThymeleafController: @Controller;
    
    declare @type: InstockTypesItemThymeleafController: @RequestMapping(value = "/instocktypes/{instockType}", name = "InstockTypesItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private InstockTypeService InstockTypesItemThymeleafController.instockTypeService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource InstockTypesItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<InstockTypesItemThymeleafController> InstockTypesItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<InstockTypesCollectionThymeleafController> InstockTypesItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<InstockType> InstockTypesItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<InstockType>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param instockTypeService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public InstockTypesItemThymeleafController.new(InstockTypeService instockTypeService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setInstockTypeService(instockTypeService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(InstockTypesItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(InstockTypesCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return InstockTypeService
     */
    public InstockTypeService InstockTypesItemThymeleafController.getInstockTypeService() {
        return instockTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param instockTypeService
     */
    public void InstockTypesItemThymeleafController.setInstockTypeService(InstockTypeService instockTypeService) {
        this.instockTypeService = instockTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource InstockTypesItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void InstockTypesItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<InstockTypesItemThymeleafController> InstockTypesItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void InstockTypesItemThymeleafController.setItemLink(MethodLinkBuilderFactory<InstockTypesItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<InstockTypesCollectionThymeleafController> InstockTypesItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void InstockTypesItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<InstockTypesCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return InstockType
     */
    @ModelAttribute
    public InstockType InstockTypesItemThymeleafController.getInstockType(@PathVariable("instockType") Long id, Locale locale, HttpMethod method) {
        InstockType instockType = null;
        if (HttpMethod.PUT.equals(method)) {
            instockType = instockTypeService.findOneForUpdate(id);
        } else {
            instockType = instockTypeService.findOne(id);
        }
        
        if (instockType == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"InstockType", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return instockType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param instockType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView InstockTypesItemThymeleafController.show(@ModelAttribute InstockType instockType, Model model) {
        model.addAttribute("instockType", instockType);
        return new ModelAndView("instocktypes/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param instockType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView InstockTypesItemThymeleafController.showInline(@ModelAttribute InstockType instockType, Model model) {
        model.addAttribute("instockType", instockType);
        return new ModelAndView("instocktypes/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void InstockTypesItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void InstockTypesItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<InstockType> InstockTypesItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String InstockTypesItemThymeleafController.getModelName() {
        return "instockType";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String InstockTypesItemThymeleafController.getEditViewPath() {
        return "instocktypes/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer InstockTypesItemThymeleafController.getLastVersion(InstockType record) {
        Long versionValue = getInstockTypeService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView InstockTypesItemThymeleafController.populateAndGetFormView(InstockType entity, Model model) {
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
    @InitBinder("instockType")
    public void InstockTypesItemThymeleafController.initInstockTypeBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(InstockType.class, getInstockTypeService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param instockType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView InstockTypesItemThymeleafController.editForm(@ModelAttribute InstockType instockType, Model model) {
        populateForm(model);
        
        model.addAttribute("instockType", instockType);
        return new ModelAndView("instocktypes/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param instockType
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView InstockTypesItemThymeleafController.update(@Valid @ModelAttribute InstockType instockType, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        InstockType savedInstockType = getConcurrencyTemplate().execute(instockType, model, new ConcurrencyCallback<InstockType>() {
            @Override
            public InstockType doInConcurrency(InstockType instockType) throws Exception {
                return getInstockTypeService().save(instockType);
            }
        });
        UriComponents showURI = getItemLink().to(InstockTypesItemThymeleafLinkFactory.SHOW).with("instockType", savedInstockType.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param instockType
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> InstockTypesItemThymeleafController.delete(@ModelAttribute InstockType instockType) {
        getInstockTypeService().delete(instockType);
        return ResponseEntity.ok().build();
    }
    
}
