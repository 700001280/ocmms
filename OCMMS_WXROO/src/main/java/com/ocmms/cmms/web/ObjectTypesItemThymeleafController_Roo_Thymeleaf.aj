// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.configuration.ObjectType;
import com.ocmms.cmms.service.api.ObjectTypeService;
import com.ocmms.cmms.web.ObjectTypesCollectionThymeleafController;
import com.ocmms.cmms.web.ObjectTypesItemThymeleafController;
import com.ocmms.cmms.web.ObjectTypesItemThymeleafLinkFactory;
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

privileged aspect ObjectTypesItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: ObjectTypesItemThymeleafController: @Controller;
    
    declare @type: ObjectTypesItemThymeleafController: @RequestMapping(value = "/objecttypes/{objectType}", name = "ObjectTypesItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ObjectTypeService ObjectTypesItemThymeleafController.objectTypeService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource ObjectTypesItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<ObjectTypesItemThymeleafController> ObjectTypesItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<ObjectTypesCollectionThymeleafController> ObjectTypesItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<ObjectType> ObjectTypesItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<ObjectType>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param objectTypeService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public ObjectTypesItemThymeleafController.new(ObjectTypeService objectTypeService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setObjectTypeService(objectTypeService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(ObjectTypesItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(ObjectTypesCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return ObjectTypeService
     */
    public ObjectTypeService ObjectTypesItemThymeleafController.getObjectTypeService() {
        return objectTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param objectTypeService
     */
    public void ObjectTypesItemThymeleafController.setObjectTypeService(ObjectTypeService objectTypeService) {
        this.objectTypeService = objectTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource ObjectTypesItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void ObjectTypesItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<ObjectTypesItemThymeleafController> ObjectTypesItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void ObjectTypesItemThymeleafController.setItemLink(MethodLinkBuilderFactory<ObjectTypesItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<ObjectTypesCollectionThymeleafController> ObjectTypesItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void ObjectTypesItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<ObjectTypesCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return ObjectType
     */
    @ModelAttribute
    public ObjectType ObjectTypesItemThymeleafController.getObjectType(@PathVariable("objectType") Long id, Locale locale, HttpMethod method) {
        ObjectType objectType = null;
        if (HttpMethod.PUT.equals(method)) {
            objectType = objectTypeService.findOneForUpdate(id);
        } else {
            objectType = objectTypeService.findOne(id);
        }
        
        if (objectType == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"ObjectType", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return objectType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param objectType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView ObjectTypesItemThymeleafController.show(@ModelAttribute ObjectType objectType, Model model) {
        model.addAttribute("objectType", objectType);
        return new ModelAndView("objecttypes/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param objectType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView ObjectTypesItemThymeleafController.showInline(@ModelAttribute ObjectType objectType, Model model) {
        model.addAttribute("objectType", objectType);
        return new ModelAndView("objecttypes/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void ObjectTypesItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void ObjectTypesItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<ObjectType> ObjectTypesItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String ObjectTypesItemThymeleafController.getModelName() {
        return "objectType";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String ObjectTypesItemThymeleafController.getEditViewPath() {
        return "objecttypes/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer ObjectTypesItemThymeleafController.getLastVersion(ObjectType record) {
        Long versionValue = getObjectTypeService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView ObjectTypesItemThymeleafController.populateAndGetFormView(ObjectType entity, Model model) {
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
    @InitBinder("objectType")
    public void ObjectTypesItemThymeleafController.initObjectTypeBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(ObjectType.class, getObjectTypeService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param objectType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView ObjectTypesItemThymeleafController.editForm(@ModelAttribute ObjectType objectType, Model model) {
        populateForm(model);
        
        model.addAttribute("objectType", objectType);
        return new ModelAndView("objecttypes/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param objectType
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView ObjectTypesItemThymeleafController.update(@Valid @ModelAttribute ObjectType objectType, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        ObjectType savedObjectType = getConcurrencyTemplate().execute(objectType, model, new ConcurrencyCallback<ObjectType>() {
            @Override
            public ObjectType doInConcurrency(ObjectType objectType) throws Exception {
                return getObjectTypeService().save(objectType);
            }
        });
        UriComponents showURI = getItemLink().to(ObjectTypesItemThymeleafLinkFactory.SHOW).with("objectType", savedObjectType.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param objectType
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> ObjectTypesItemThymeleafController.delete(@ModelAttribute ObjectType objectType) {
        getObjectTypeService().delete(objectType);
        return ResponseEntity.ok().build();
    }
    
}
