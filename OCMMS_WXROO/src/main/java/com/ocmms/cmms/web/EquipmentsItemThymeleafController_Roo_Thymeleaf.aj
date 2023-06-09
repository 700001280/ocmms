// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.service.api.EquipmentService;
import com.ocmms.cmms.web.EquipmentsCollectionThymeleafController;
import com.ocmms.cmms.web.EquipmentsItemThymeleafController;
import com.ocmms.cmms.web.EquipmentsItemThymeleafLinkFactory;
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

privileged aspect EquipmentsItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: EquipmentsItemThymeleafController: @Controller;
    
    declare @type: EquipmentsItemThymeleafController: @RequestMapping(value = "/equipments/{equipment}", name = "EquipmentsItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private EquipmentService EquipmentsItemThymeleafController.equipmentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource EquipmentsItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<EquipmentsItemThymeleafController> EquipmentsItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<EquipmentsCollectionThymeleafController> EquipmentsItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<Equipment> EquipmentsItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<Equipment>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param equipmentService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public EquipmentsItemThymeleafController.new(EquipmentService equipmentService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setEquipmentService(equipmentService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(EquipmentsItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(EquipmentsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return EquipmentService
     */
    public EquipmentService EquipmentsItemThymeleafController.getEquipmentService() {
        return equipmentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentService
     */
    public void EquipmentsItemThymeleafController.setEquipmentService(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource EquipmentsItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void EquipmentsItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<EquipmentsItemThymeleafController> EquipmentsItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void EquipmentsItemThymeleafController.setItemLink(MethodLinkBuilderFactory<EquipmentsItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<EquipmentsCollectionThymeleafController> EquipmentsItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void EquipmentsItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<EquipmentsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return Equipment
     */
    @ModelAttribute
    public Equipment EquipmentsItemThymeleafController.getEquipment(@PathVariable("equipment") Long id, Locale locale, HttpMethod method) {
        Equipment equipment = null;
        if (HttpMethod.PUT.equals(method)) {
            equipment = equipmentService.findOneForUpdate(id);
        } else {
            equipment = equipmentService.findOne(id);
        }
        
        if (equipment == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"Equipment", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return equipment;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView EquipmentsItemThymeleafController.show(@ModelAttribute Equipment equipment, Model model) {
        model.addAttribute("equipment", equipment);
        return new ModelAndView("equipments/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView EquipmentsItemThymeleafController.showInline(@ModelAttribute Equipment equipment, Model model) {
        model.addAttribute("equipment", equipment);
        return new ModelAndView("equipments/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void EquipmentsItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("constructionDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("acquisitionDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("beginGuaranteeDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("warrantyEndDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("capitalizedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void EquipmentsItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<Equipment> EquipmentsItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String EquipmentsItemThymeleafController.getModelName() {
        return "equipment";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String EquipmentsItemThymeleafController.getEditViewPath() {
        return "equipments/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer EquipmentsItemThymeleafController.getLastVersion(Equipment record) {
        Long versionValue = getEquipmentService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView EquipmentsItemThymeleafController.populateAndGetFormView(Equipment entity, Model model) {
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
    @InitBinder("equipment")
    public void EquipmentsItemThymeleafController.initEquipmentBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(Equipment.class, getEquipmentService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView EquipmentsItemThymeleafController.editForm(@ModelAttribute Equipment equipment, Model model) {
        populateForm(model);
        
        model.addAttribute("equipment", equipment);
        return new ModelAndView("equipments/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView EquipmentsItemThymeleafController.update(@Valid @ModelAttribute Equipment equipment, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        Equipment savedEquipment = getConcurrencyTemplate().execute(equipment, model, new ConcurrencyCallback<Equipment>() {
            @Override
            public Equipment doInConcurrency(Equipment equipment) throws Exception {
                return getEquipmentService().save(equipment);
            }
        });
        UriComponents showURI = getItemLink().to(EquipmentsItemThymeleafLinkFactory.SHOW).with("equipment", savedEquipment.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> EquipmentsItemThymeleafController.delete(@ModelAttribute Equipment equipment) {
        getEquipmentService().delete(equipment);
        return ResponseEntity.ok().build();
    }
    
}
