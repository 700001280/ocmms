// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import com.ocmms.cmms.service.api.MaterialStorageLocationInfoService;
import com.ocmms.cmms.web.MaterialStorageLocationInfoesCollectionThymeleafController;
import com.ocmms.cmms.web.MaterialStorageLocationInfoesItemThymeleafController;
import com.ocmms.cmms.web.MaterialStorageLocationInfoesItemThymeleafLinkFactory;
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

privileged aspect MaterialStorageLocationInfoesItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: MaterialStorageLocationInfoesItemThymeleafController: @Controller;
    
    declare @type: MaterialStorageLocationInfoesItemThymeleafController: @RequestMapping(value = "/materialstoragelocationinfoes/{materialStorageLocationInfo}", name = "MaterialStorageLocationInfoesItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MaterialStorageLocationInfoService MaterialStorageLocationInfoesItemThymeleafController.materialStorageLocationInfoService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource MaterialStorageLocationInfoesItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<MaterialStorageLocationInfoesItemThymeleafController> MaterialStorageLocationInfoesItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<MaterialStorageLocationInfoesCollectionThymeleafController> MaterialStorageLocationInfoesItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<MaterialStorageLocationInfo> MaterialStorageLocationInfoesItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<MaterialStorageLocationInfo>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param materialStorageLocationInfoService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public MaterialStorageLocationInfoesItemThymeleafController.new(MaterialStorageLocationInfoService materialStorageLocationInfoService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setMaterialStorageLocationInfoService(materialStorageLocationInfoService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(MaterialStorageLocationInfoesItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(MaterialStorageLocationInfoesCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialStorageLocationInfoService
     */
    public MaterialStorageLocationInfoService MaterialStorageLocationInfoesItemThymeleafController.getMaterialStorageLocationInfoService() {
        return materialStorageLocationInfoService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialStorageLocationInfoService
     */
    public void MaterialStorageLocationInfoesItemThymeleafController.setMaterialStorageLocationInfoService(MaterialStorageLocationInfoService materialStorageLocationInfoService) {
        this.materialStorageLocationInfoService = materialStorageLocationInfoService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource MaterialStorageLocationInfoesItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void MaterialStorageLocationInfoesItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<MaterialStorageLocationInfoesItemThymeleafController> MaterialStorageLocationInfoesItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void MaterialStorageLocationInfoesItemThymeleafController.setItemLink(MethodLinkBuilderFactory<MaterialStorageLocationInfoesItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<MaterialStorageLocationInfoesCollectionThymeleafController> MaterialStorageLocationInfoesItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void MaterialStorageLocationInfoesItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<MaterialStorageLocationInfoesCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return MaterialStorageLocationInfo
     */
    @ModelAttribute
    public MaterialStorageLocationInfo MaterialStorageLocationInfoesItemThymeleafController.getMaterialStorageLocationInfo(@PathVariable("materialStorageLocationInfo") Long id, Locale locale, HttpMethod method) {
        MaterialStorageLocationInfo materialStorageLocationInfo = null;
        if (HttpMethod.PUT.equals(method)) {
            materialStorageLocationInfo = materialStorageLocationInfoService.findOneForUpdate(id);
        } else {
            materialStorageLocationInfo = materialStorageLocationInfoService.findOne(id);
        }
        
        if (materialStorageLocationInfo == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"MaterialStorageLocationInfo", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return materialStorageLocationInfo;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialStorageLocationInfo
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView MaterialStorageLocationInfoesItemThymeleafController.show(@ModelAttribute MaterialStorageLocationInfo materialStorageLocationInfo, Model model) {
        model.addAttribute("materialStorageLocationInfo", materialStorageLocationInfo);
        return new ModelAndView("materialstoragelocationinfoes/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialStorageLocationInfo
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView MaterialStorageLocationInfoesItemThymeleafController.showInline(@ModelAttribute MaterialStorageLocationInfo materialStorageLocationInfo, Model model) {
        model.addAttribute("materialStorageLocationInfo", materialStorageLocationInfo);
        return new ModelAndView("materialstoragelocationinfoes/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void MaterialStorageLocationInfoesItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void MaterialStorageLocationInfoesItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<MaterialStorageLocationInfo> MaterialStorageLocationInfoesItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String MaterialStorageLocationInfoesItemThymeleafController.getModelName() {
        return "materialStorageLocationInfo";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String MaterialStorageLocationInfoesItemThymeleafController.getEditViewPath() {
        return "materialstoragelocationinfoes/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer MaterialStorageLocationInfoesItemThymeleafController.getLastVersion(MaterialStorageLocationInfo record) {
        Long versionValue = getMaterialStorageLocationInfoService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView MaterialStorageLocationInfoesItemThymeleafController.populateAndGetFormView(MaterialStorageLocationInfo entity, Model model) {
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
    @InitBinder("materialStorageLocationInfo")
    public void MaterialStorageLocationInfoesItemThymeleafController.initMaterialStorageLocationInfoBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(MaterialStorageLocationInfo.class, getMaterialStorageLocationInfoService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialStorageLocationInfo
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView MaterialStorageLocationInfoesItemThymeleafController.editForm(@ModelAttribute MaterialStorageLocationInfo materialStorageLocationInfo, Model model) {
        populateForm(model);
        
        model.addAttribute("materialStorageLocationInfo", materialStorageLocationInfo);
        return new ModelAndView("materialstoragelocationinfoes/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialStorageLocationInfo
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView MaterialStorageLocationInfoesItemThymeleafController.update(@Valid @ModelAttribute MaterialStorageLocationInfo materialStorageLocationInfo, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        MaterialStorageLocationInfo savedMaterialStorageLocationInfo = getConcurrencyTemplate().execute(materialStorageLocationInfo, model, new ConcurrencyCallback<MaterialStorageLocationInfo>() {
            @Override
            public MaterialStorageLocationInfo doInConcurrency(MaterialStorageLocationInfo materialStorageLocationInfo) throws Exception {
                return getMaterialStorageLocationInfoService().save(materialStorageLocationInfo);
            }
        });
        UriComponents showURI = getItemLink().to(MaterialStorageLocationInfoesItemThymeleafLinkFactory.SHOW).with("materialStorageLocationInfo", savedMaterialStorageLocationInfo.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialStorageLocationInfo
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> MaterialStorageLocationInfoesItemThymeleafController.delete(@ModelAttribute MaterialStorageLocationInfo materialStorageLocationInfo) {
        getMaterialStorageLocationInfoService().delete(materialStorageLocationInfo);
        return ResponseEntity.ok().build();
    }
    
}
