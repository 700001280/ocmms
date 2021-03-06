// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.routine.PelletizerCutterMaintenanceRecord;
import com.ocmms.cmms.service.api.PelletizerCutterMaintenanceRecordService;
import com.ocmms.cmms.web.PelletizerCutterMaintenanceRecordsCollectionThymeleafController;
import com.ocmms.cmms.web.PelletizerCutterMaintenanceRecordsItemThymeleafController;
import com.ocmms.cmms.web.PelletizerCutterMaintenanceRecordsItemThymeleafLinkFactory;
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

privileged aspect PelletizerCutterMaintenanceRecordsItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: PelletizerCutterMaintenanceRecordsItemThymeleafController: @Controller;
    
    declare @type: PelletizerCutterMaintenanceRecordsItemThymeleafController: @RequestMapping(value = "/pelletizercuttermaintenancerecords/{pelletizerCutterMaintenanceRecord}", name = "PelletizerCutterMaintenanceRecordsItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PelletizerCutterMaintenanceRecordService PelletizerCutterMaintenanceRecordsItemThymeleafController.pelletizerCutterMaintenanceRecordService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource PelletizerCutterMaintenanceRecordsItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<PelletizerCutterMaintenanceRecordsItemThymeleafController> PelletizerCutterMaintenanceRecordsItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<PelletizerCutterMaintenanceRecordsCollectionThymeleafController> PelletizerCutterMaintenanceRecordsItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<PelletizerCutterMaintenanceRecord> PelletizerCutterMaintenanceRecordsItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<PelletizerCutterMaintenanceRecord>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param pelletizerCutterMaintenanceRecordService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public PelletizerCutterMaintenanceRecordsItemThymeleafController.new(PelletizerCutterMaintenanceRecordService pelletizerCutterMaintenanceRecordService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setPelletizerCutterMaintenanceRecordService(pelletizerCutterMaintenanceRecordService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(PelletizerCutterMaintenanceRecordsItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(PelletizerCutterMaintenanceRecordsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PelletizerCutterMaintenanceRecordService
     */
    public PelletizerCutterMaintenanceRecordService PelletizerCutterMaintenanceRecordsItemThymeleafController.getPelletizerCutterMaintenanceRecordService() {
        return pelletizerCutterMaintenanceRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pelletizerCutterMaintenanceRecordService
     */
    public void PelletizerCutterMaintenanceRecordsItemThymeleafController.setPelletizerCutterMaintenanceRecordService(PelletizerCutterMaintenanceRecordService pelletizerCutterMaintenanceRecordService) {
        this.pelletizerCutterMaintenanceRecordService = pelletizerCutterMaintenanceRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource PelletizerCutterMaintenanceRecordsItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void PelletizerCutterMaintenanceRecordsItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<PelletizerCutterMaintenanceRecordsItemThymeleafController> PelletizerCutterMaintenanceRecordsItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void PelletizerCutterMaintenanceRecordsItemThymeleafController.setItemLink(MethodLinkBuilderFactory<PelletizerCutterMaintenanceRecordsItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<PelletizerCutterMaintenanceRecordsCollectionThymeleafController> PelletizerCutterMaintenanceRecordsItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void PelletizerCutterMaintenanceRecordsItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<PelletizerCutterMaintenanceRecordsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return PelletizerCutterMaintenanceRecord
     */
    @ModelAttribute
    public PelletizerCutterMaintenanceRecord PelletizerCutterMaintenanceRecordsItemThymeleafController.getPelletizerCutterMaintenanceRecord(@PathVariable("pelletizerCutterMaintenanceRecord") Long id, Locale locale, HttpMethod method) {
        PelletizerCutterMaintenanceRecord pelletizerCutterMaintenanceRecord = null;
        if (HttpMethod.PUT.equals(method)) {
            pelletizerCutterMaintenanceRecord = pelletizerCutterMaintenanceRecordService.findOneForUpdate(id);
        } else {
            pelletizerCutterMaintenanceRecord = pelletizerCutterMaintenanceRecordService.findOne(id);
        }
        
        if (pelletizerCutterMaintenanceRecord == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"PelletizerCutterMaintenanceRecord", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return pelletizerCutterMaintenanceRecord;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pelletizerCutterMaintenanceRecord
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView PelletizerCutterMaintenanceRecordsItemThymeleafController.show(@ModelAttribute PelletizerCutterMaintenanceRecord pelletizerCutterMaintenanceRecord, Model model) {
        model.addAttribute("pelletizerCutterMaintenanceRecord", pelletizerCutterMaintenanceRecord);
        return new ModelAndView("pelletizercuttermaintenancerecords/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pelletizerCutterMaintenanceRecord
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView PelletizerCutterMaintenanceRecordsItemThymeleafController.showInline(@ModelAttribute PelletizerCutterMaintenanceRecord pelletizerCutterMaintenanceRecord, Model model) {
        model.addAttribute("pelletizerCutterMaintenanceRecord", pelletizerCutterMaintenanceRecord);
        return new ModelAndView("pelletizercuttermaintenancerecords/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void PelletizerCutterMaintenanceRecordsItemThymeleafController.populateFormats(Model model) {
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
    public void PelletizerCutterMaintenanceRecordsItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<PelletizerCutterMaintenanceRecord> PelletizerCutterMaintenanceRecordsItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String PelletizerCutterMaintenanceRecordsItemThymeleafController.getModelName() {
        return "pelletizerCutterMaintenanceRecord";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String PelletizerCutterMaintenanceRecordsItemThymeleafController.getEditViewPath() {
        return "pelletizercuttermaintenancerecords/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer PelletizerCutterMaintenanceRecordsItemThymeleafController.getLastVersion(PelletizerCutterMaintenanceRecord record) {
        Long versionValue = getPelletizerCutterMaintenanceRecordService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView PelletizerCutterMaintenanceRecordsItemThymeleafController.populateAndGetFormView(PelletizerCutterMaintenanceRecord entity, Model model) {
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
    @InitBinder("pelletizerCutterMaintenanceRecord")
    public void PelletizerCutterMaintenanceRecordsItemThymeleafController.initPelletizerCutterMaintenanceRecordBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(PelletizerCutterMaintenanceRecord.class, getPelletizerCutterMaintenanceRecordService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pelletizerCutterMaintenanceRecord
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView PelletizerCutterMaintenanceRecordsItemThymeleafController.editForm(@ModelAttribute PelletizerCutterMaintenanceRecord pelletizerCutterMaintenanceRecord, Model model) {
        populateForm(model);
        
        model.addAttribute("pelletizerCutterMaintenanceRecord", pelletizerCutterMaintenanceRecord);
        return new ModelAndView("pelletizercuttermaintenancerecords/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pelletizerCutterMaintenanceRecord
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView PelletizerCutterMaintenanceRecordsItemThymeleafController.update(@Valid @ModelAttribute PelletizerCutterMaintenanceRecord pelletizerCutterMaintenanceRecord, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        PelletizerCutterMaintenanceRecord savedPelletizerCutterMaintenanceRecord = getConcurrencyTemplate().execute(pelletizerCutterMaintenanceRecord, model, new ConcurrencyCallback<PelletizerCutterMaintenanceRecord>() {
            @Override
            public PelletizerCutterMaintenanceRecord doInConcurrency(PelletizerCutterMaintenanceRecord pelletizerCutterMaintenanceRecord) throws Exception {
                return getPelletizerCutterMaintenanceRecordService().save(pelletizerCutterMaintenanceRecord);
            }
        });
        UriComponents showURI = getItemLink().to(PelletizerCutterMaintenanceRecordsItemThymeleafLinkFactory.SHOW).with("pelletizerCutterMaintenanceRecord", savedPelletizerCutterMaintenanceRecord.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param pelletizerCutterMaintenanceRecord
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> PelletizerCutterMaintenanceRecordsItemThymeleafController.delete(@ModelAttribute PelletizerCutterMaintenanceRecord pelletizerCutterMaintenanceRecord) {
        getPelletizerCutterMaintenanceRecordService().delete(pelletizerCutterMaintenanceRecord);
        return ResponseEntity.ok().build();
    }
    
}
