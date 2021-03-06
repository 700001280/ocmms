// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.service.api.UnitOfMeasureService;
import com.ocmms.cmms.web.UnitOfMeasuresCollectionThymeleafController;
import com.ocmms.cmms.web.UnitOfMeasuresItemThymeleafController;
import com.ocmms.cmms.web.UnitOfMeasuresItemThymeleafLinkFactory;
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

privileged aspect UnitOfMeasuresItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: UnitOfMeasuresItemThymeleafController: @Controller;
    
    declare @type: UnitOfMeasuresItemThymeleafController: @RequestMapping(value = "/unitofmeasures/{unitOfMeasure}", name = "UnitOfMeasuresItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private UnitOfMeasureService UnitOfMeasuresItemThymeleafController.unitOfMeasureService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource UnitOfMeasuresItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<UnitOfMeasuresItemThymeleafController> UnitOfMeasuresItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<UnitOfMeasuresCollectionThymeleafController> UnitOfMeasuresItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<UnitOfMeasure> UnitOfMeasuresItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<UnitOfMeasure>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param unitOfMeasureService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public UnitOfMeasuresItemThymeleafController.new(UnitOfMeasureService unitOfMeasureService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setUnitOfMeasureService(unitOfMeasureService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(UnitOfMeasuresItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(UnitOfMeasuresCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return UnitOfMeasureService
     */
    public UnitOfMeasureService UnitOfMeasuresItemThymeleafController.getUnitOfMeasureService() {
        return unitOfMeasureService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param unitOfMeasureService
     */
    public void UnitOfMeasuresItemThymeleafController.setUnitOfMeasureService(UnitOfMeasureService unitOfMeasureService) {
        this.unitOfMeasureService = unitOfMeasureService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource UnitOfMeasuresItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void UnitOfMeasuresItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<UnitOfMeasuresItemThymeleafController> UnitOfMeasuresItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void UnitOfMeasuresItemThymeleafController.setItemLink(MethodLinkBuilderFactory<UnitOfMeasuresItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<UnitOfMeasuresCollectionThymeleafController> UnitOfMeasuresItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void UnitOfMeasuresItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<UnitOfMeasuresCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return UnitOfMeasure
     */
    @ModelAttribute
    public UnitOfMeasure UnitOfMeasuresItemThymeleafController.getUnitOfMeasure(@PathVariable("unitOfMeasure") Long id, Locale locale, HttpMethod method) {
        UnitOfMeasure unitOfMeasure = null;
        if (HttpMethod.PUT.equals(method)) {
            unitOfMeasure = unitOfMeasureService.findOneForUpdate(id);
        } else {
            unitOfMeasure = unitOfMeasureService.findOne(id);
        }
        
        if (unitOfMeasure == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"UnitOfMeasure", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return unitOfMeasure;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param unitOfMeasure
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView UnitOfMeasuresItemThymeleafController.show(@ModelAttribute UnitOfMeasure unitOfMeasure, Model model) {
        model.addAttribute("unitOfMeasure", unitOfMeasure);
        return new ModelAndView("unitofmeasures/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param unitOfMeasure
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView UnitOfMeasuresItemThymeleafController.showInline(@ModelAttribute UnitOfMeasure unitOfMeasure, Model model) {
        model.addAttribute("unitOfMeasure", unitOfMeasure);
        return new ModelAndView("unitofmeasures/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void UnitOfMeasuresItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void UnitOfMeasuresItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<UnitOfMeasure> UnitOfMeasuresItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String UnitOfMeasuresItemThymeleafController.getModelName() {
        return "unitOfMeasure";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String UnitOfMeasuresItemThymeleafController.getEditViewPath() {
        return "unitofmeasures/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer UnitOfMeasuresItemThymeleafController.getLastVersion(UnitOfMeasure record) {
        Long versionValue = getUnitOfMeasureService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView UnitOfMeasuresItemThymeleafController.populateAndGetFormView(UnitOfMeasure entity, Model model) {
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
    @InitBinder("unitOfMeasure")
    public void UnitOfMeasuresItemThymeleafController.initUnitOfMeasureBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(UnitOfMeasure.class, getUnitOfMeasureService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param unitOfMeasure
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView UnitOfMeasuresItemThymeleafController.editForm(@ModelAttribute UnitOfMeasure unitOfMeasure, Model model) {
        populateForm(model);
        
        model.addAttribute("unitOfMeasure", unitOfMeasure);
        return new ModelAndView("unitofmeasures/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param unitOfMeasure
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView UnitOfMeasuresItemThymeleafController.update(@Valid @ModelAttribute UnitOfMeasure unitOfMeasure, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        UnitOfMeasure savedUnitOfMeasure = getConcurrencyTemplate().execute(unitOfMeasure, model, new ConcurrencyCallback<UnitOfMeasure>() {
            @Override
            public UnitOfMeasure doInConcurrency(UnitOfMeasure unitOfMeasure) throws Exception {
                return getUnitOfMeasureService().save(unitOfMeasure);
            }
        });
        UriComponents showURI = getItemLink().to(UnitOfMeasuresItemThymeleafLinkFactory.SHOW).with("unitOfMeasure", savedUnitOfMeasure.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param unitOfMeasure
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> UnitOfMeasuresItemThymeleafController.delete(@ModelAttribute UnitOfMeasure unitOfMeasure) {
        getUnitOfMeasureService().delete(unitOfMeasure);
        return ResponseEntity.ok().build();
    }
    
}
