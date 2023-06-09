// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.system.BarcodeDefinition;
import com.ocmms.cmms.service.api.BarcodeDefinitionService;
import com.ocmms.cmms.web.BarcodeDefinitionsCollectionThymeleafController;
import com.ocmms.cmms.web.BarcodeDefinitionsItemThymeleafController;
import com.ocmms.cmms.web.BarcodeDefinitionsItemThymeleafLinkFactory;
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

privileged aspect BarcodeDefinitionsItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: BarcodeDefinitionsItemThymeleafController: @Controller;
    
    declare @type: BarcodeDefinitionsItemThymeleafController: @RequestMapping(value = "/barcodedefinitions/{barcodeDefinition}", name = "BarcodeDefinitionsItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private BarcodeDefinitionService BarcodeDefinitionsItemThymeleafController.barcodeDefinitionService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource BarcodeDefinitionsItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<BarcodeDefinitionsItemThymeleafController> BarcodeDefinitionsItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<BarcodeDefinitionsCollectionThymeleafController> BarcodeDefinitionsItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<BarcodeDefinition> BarcodeDefinitionsItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<BarcodeDefinition>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param barcodeDefinitionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public BarcodeDefinitionsItemThymeleafController.new(BarcodeDefinitionService barcodeDefinitionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setBarcodeDefinitionService(barcodeDefinitionService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(BarcodeDefinitionsItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(BarcodeDefinitionsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return BarcodeDefinitionService
     */
    public BarcodeDefinitionService BarcodeDefinitionsItemThymeleafController.getBarcodeDefinitionService() {
        return barcodeDefinitionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param barcodeDefinitionService
     */
    public void BarcodeDefinitionsItemThymeleafController.setBarcodeDefinitionService(BarcodeDefinitionService barcodeDefinitionService) {
        this.barcodeDefinitionService = barcodeDefinitionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource BarcodeDefinitionsItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void BarcodeDefinitionsItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<BarcodeDefinitionsItemThymeleafController> BarcodeDefinitionsItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void BarcodeDefinitionsItemThymeleafController.setItemLink(MethodLinkBuilderFactory<BarcodeDefinitionsItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<BarcodeDefinitionsCollectionThymeleafController> BarcodeDefinitionsItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void BarcodeDefinitionsItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<BarcodeDefinitionsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return BarcodeDefinition
     */
    @ModelAttribute
    public BarcodeDefinition BarcodeDefinitionsItemThymeleafController.getBarcodeDefinition(@PathVariable("barcodeDefinition") Long id, Locale locale, HttpMethod method) {
        BarcodeDefinition barcodeDefinition = null;
        if (HttpMethod.PUT.equals(method)) {
            barcodeDefinition = barcodeDefinitionService.findOneForUpdate(id);
        } else {
            barcodeDefinition = barcodeDefinitionService.findOne(id);
        }
        
        if (barcodeDefinition == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"BarcodeDefinition", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return barcodeDefinition;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param barcodeDefinition
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView BarcodeDefinitionsItemThymeleafController.show(@ModelAttribute BarcodeDefinition barcodeDefinition, Model model) {
        model.addAttribute("barcodeDefinition", barcodeDefinition);
        return new ModelAndView("barcodedefinitions/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param barcodeDefinition
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView BarcodeDefinitionsItemThymeleafController.showInline(@ModelAttribute BarcodeDefinition barcodeDefinition, Model model) {
        model.addAttribute("barcodeDefinition", barcodeDefinition);
        return new ModelAndView("barcodedefinitions/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void BarcodeDefinitionsItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void BarcodeDefinitionsItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<BarcodeDefinition> BarcodeDefinitionsItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String BarcodeDefinitionsItemThymeleafController.getModelName() {
        return "barcodeDefinition";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String BarcodeDefinitionsItemThymeleafController.getEditViewPath() {
        return "barcodedefinitions/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer BarcodeDefinitionsItemThymeleafController.getLastVersion(BarcodeDefinition record) {
        Long versionValue = getBarcodeDefinitionService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView BarcodeDefinitionsItemThymeleafController.populateAndGetFormView(BarcodeDefinition entity, Model model) {
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
    @InitBinder("barcodeDefinition")
    public void BarcodeDefinitionsItemThymeleafController.initBarcodeDefinitionBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(BarcodeDefinition.class, getBarcodeDefinitionService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param barcodeDefinition
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView BarcodeDefinitionsItemThymeleafController.editForm(@ModelAttribute BarcodeDefinition barcodeDefinition, Model model) {
        populateForm(model);
        
        model.addAttribute("barcodeDefinition", barcodeDefinition);
        return new ModelAndView("barcodedefinitions/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param barcodeDefinition
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView BarcodeDefinitionsItemThymeleafController.update(@Valid @ModelAttribute BarcodeDefinition barcodeDefinition, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        BarcodeDefinition savedBarcodeDefinition = getConcurrencyTemplate().execute(barcodeDefinition, model, new ConcurrencyCallback<BarcodeDefinition>() {
            @Override
            public BarcodeDefinition doInConcurrency(BarcodeDefinition barcodeDefinition) throws Exception {
                return getBarcodeDefinitionService().save(barcodeDefinition);
            }
        });
        UriComponents showURI = getItemLink().to(BarcodeDefinitionsItemThymeleafLinkFactory.SHOW).with("barcodeDefinition", savedBarcodeDefinition.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param barcodeDefinition
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> BarcodeDefinitionsItemThymeleafController.delete(@ModelAttribute BarcodeDefinition barcodeDefinition) {
        getBarcodeDefinitionService().delete(barcodeDefinition);
        return ResponseEntity.ok().build();
    }
    
}
