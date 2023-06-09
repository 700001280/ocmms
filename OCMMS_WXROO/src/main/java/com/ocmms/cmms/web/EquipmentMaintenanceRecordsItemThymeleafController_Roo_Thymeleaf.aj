// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import com.ocmms.cmms.service.api.EquipmentMaintenanceRecordService;
import com.ocmms.cmms.web.EquipmentMaintenanceRecordsCollectionThymeleafController;
import com.ocmms.cmms.web.EquipmentMaintenanceRecordsItemThymeleafController;
import com.ocmms.cmms.web.EquipmentMaintenanceRecordsItemThymeleafLinkFactory;
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

privileged aspect EquipmentMaintenanceRecordsItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: EquipmentMaintenanceRecordsItemThymeleafController: @Controller;
    
    declare @type: EquipmentMaintenanceRecordsItemThymeleafController: @RequestMapping(value = "/equipmentmaintenancerecords/{equipmentMaintenanceRecord}", name = "EquipmentMaintenanceRecordsItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private EquipmentMaintenanceRecordService EquipmentMaintenanceRecordsItemThymeleafController.equipmentMaintenanceRecordService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource EquipmentMaintenanceRecordsItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<EquipmentMaintenanceRecordsItemThymeleafController> EquipmentMaintenanceRecordsItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<EquipmentMaintenanceRecordsCollectionThymeleafController> EquipmentMaintenanceRecordsItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<EquipmentMaintenanceRecord> EquipmentMaintenanceRecordsItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<EquipmentMaintenanceRecord>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param equipmentMaintenanceRecordService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public EquipmentMaintenanceRecordsItemThymeleafController.new(EquipmentMaintenanceRecordService equipmentMaintenanceRecordService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setEquipmentMaintenanceRecordService(equipmentMaintenanceRecordService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(EquipmentMaintenanceRecordsItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(EquipmentMaintenanceRecordsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return EquipmentMaintenanceRecordService
     */
    public EquipmentMaintenanceRecordService EquipmentMaintenanceRecordsItemThymeleafController.getEquipmentMaintenanceRecordService() {
        return equipmentMaintenanceRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecordService
     */
    public void EquipmentMaintenanceRecordsItemThymeleafController.setEquipmentMaintenanceRecordService(EquipmentMaintenanceRecordService equipmentMaintenanceRecordService) {
        this.equipmentMaintenanceRecordService = equipmentMaintenanceRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource EquipmentMaintenanceRecordsItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void EquipmentMaintenanceRecordsItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<EquipmentMaintenanceRecordsItemThymeleafController> EquipmentMaintenanceRecordsItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void EquipmentMaintenanceRecordsItemThymeleafController.setItemLink(MethodLinkBuilderFactory<EquipmentMaintenanceRecordsItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<EquipmentMaintenanceRecordsCollectionThymeleafController> EquipmentMaintenanceRecordsItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void EquipmentMaintenanceRecordsItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<EquipmentMaintenanceRecordsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return EquipmentMaintenanceRecord
     */
    @ModelAttribute
    public EquipmentMaintenanceRecord EquipmentMaintenanceRecordsItemThymeleafController.getEquipmentMaintenanceRecord(@PathVariable("equipmentMaintenanceRecord") Long id, Locale locale, HttpMethod method) {
        EquipmentMaintenanceRecord equipmentMaintenanceRecord = null;
        if (HttpMethod.PUT.equals(method)) {
            equipmentMaintenanceRecord = equipmentMaintenanceRecordService.findOneForUpdate(id);
        } else {
            equipmentMaintenanceRecord = equipmentMaintenanceRecordService.findOne(id);
        }
        
        if (equipmentMaintenanceRecord == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"EquipmentMaintenanceRecord", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return equipmentMaintenanceRecord;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView EquipmentMaintenanceRecordsItemThymeleafController.show(@ModelAttribute EquipmentMaintenanceRecord equipmentMaintenanceRecord, Model model) {
        model.addAttribute("equipmentMaintenanceRecord", equipmentMaintenanceRecord);
        return new ModelAndView("equipmentmaintenancerecords/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView EquipmentMaintenanceRecordsItemThymeleafController.showInline(@ModelAttribute EquipmentMaintenanceRecord equipmentMaintenanceRecord, Model model) {
        model.addAttribute("equipmentMaintenanceRecord", equipmentMaintenanceRecord);
        return new ModelAndView("equipmentmaintenancerecords/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void EquipmentMaintenanceRecordsItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("maintStartDate_date_format", DateTimeFormat.patternForStyle("MM", LocaleContextHolder.getLocale()));
        model.addAttribute("maintEndDate_date_format", DateTimeFormat.patternForStyle("MM", LocaleContextHolder.getLocale()));
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void EquipmentMaintenanceRecordsItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<EquipmentMaintenanceRecord> EquipmentMaintenanceRecordsItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String EquipmentMaintenanceRecordsItemThymeleafController.getModelName() {
        return "equipmentMaintenanceRecord";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String EquipmentMaintenanceRecordsItemThymeleafController.getEditViewPath() {
        return "equipmentmaintenancerecords/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer EquipmentMaintenanceRecordsItemThymeleafController.getLastVersion(EquipmentMaintenanceRecord record) {
        Long versionValue = getEquipmentMaintenanceRecordService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView EquipmentMaintenanceRecordsItemThymeleafController.populateAndGetFormView(EquipmentMaintenanceRecord entity, Model model) {
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
    @InitBinder("equipmentMaintenanceRecord")
    public void EquipmentMaintenanceRecordsItemThymeleafController.initEquipmentMaintenanceRecordBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(EquipmentMaintenanceRecord.class, getEquipmentMaintenanceRecordService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView EquipmentMaintenanceRecordsItemThymeleafController.editForm(@ModelAttribute EquipmentMaintenanceRecord equipmentMaintenanceRecord, Model model) {
        populateForm(model);
        
        model.addAttribute("equipmentMaintenanceRecord", equipmentMaintenanceRecord);
        return new ModelAndView("equipmentmaintenancerecords/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView EquipmentMaintenanceRecordsItemThymeleafController.update(@Valid @ModelAttribute EquipmentMaintenanceRecord equipmentMaintenanceRecord, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        EquipmentMaintenanceRecord savedEquipmentMaintenanceRecord = getConcurrencyTemplate().execute(equipmentMaintenanceRecord, model, new ConcurrencyCallback<EquipmentMaintenanceRecord>() {
            @Override
            public EquipmentMaintenanceRecord doInConcurrency(EquipmentMaintenanceRecord equipmentMaintenanceRecord) throws Exception {
                return getEquipmentMaintenanceRecordService().save(equipmentMaintenanceRecord);
            }
        });
        UriComponents showURI = getItemLink().to(EquipmentMaintenanceRecordsItemThymeleafLinkFactory.SHOW).with("equipmentMaintenanceRecord", savedEquipmentMaintenanceRecord.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> EquipmentMaintenanceRecordsItemThymeleafController.delete(@ModelAttribute EquipmentMaintenanceRecord equipmentMaintenanceRecord) {
        getEquipmentMaintenanceRecordService().delete(equipmentMaintenanceRecord);
        return ResponseEntity.ok().build();
    }
    
}
