// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.master.MaterialType;
import com.ocmms.cmms.service.api.MaterialTypeService;
import com.ocmms.cmms.web.MaterialTypesCollectionThymeleafController;
import com.ocmms.cmms.web.MaterialTypesItemThymeleafController;
import com.ocmms.cmms.web.MaterialTypesItemThymeleafLinkFactory;
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

privileged aspect MaterialTypesItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: MaterialTypesItemThymeleafController: @Controller;
    
    declare @type: MaterialTypesItemThymeleafController: @RequestMapping(value = "/materialtypes/{materialType}", name = "MaterialTypesItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MaterialTypeService MaterialTypesItemThymeleafController.materialTypeService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource MaterialTypesItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<MaterialTypesItemThymeleafController> MaterialTypesItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<MaterialTypesCollectionThymeleafController> MaterialTypesItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<MaterialType> MaterialTypesItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<MaterialType>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param materialTypeService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public MaterialTypesItemThymeleafController.new(MaterialTypeService materialTypeService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setMaterialTypeService(materialTypeService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(MaterialTypesItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(MaterialTypesCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialTypeService
     */
    public MaterialTypeService MaterialTypesItemThymeleafController.getMaterialTypeService() {
        return materialTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialTypeService
     */
    public void MaterialTypesItemThymeleafController.setMaterialTypeService(MaterialTypeService materialTypeService) {
        this.materialTypeService = materialTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource MaterialTypesItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void MaterialTypesItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<MaterialTypesItemThymeleafController> MaterialTypesItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void MaterialTypesItemThymeleafController.setItemLink(MethodLinkBuilderFactory<MaterialTypesItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<MaterialTypesCollectionThymeleafController> MaterialTypesItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void MaterialTypesItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<MaterialTypesCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return MaterialType
     */
    @ModelAttribute
    public MaterialType MaterialTypesItemThymeleafController.getMaterialType(@PathVariable("materialType") Long id, Locale locale, HttpMethod method) {
        MaterialType materialType = null;
        if (HttpMethod.PUT.equals(method)) {
            materialType = materialTypeService.findOneForUpdate(id);
        } else {
            materialType = materialTypeService.findOne(id);
        }
        
        if (materialType == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"MaterialType", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return materialType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView MaterialTypesItemThymeleafController.show(@ModelAttribute MaterialType materialType, Model model) {
        model.addAttribute("materialType", materialType);
        return new ModelAndView("materialtypes/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView MaterialTypesItemThymeleafController.showInline(@ModelAttribute MaterialType materialType, Model model) {
        model.addAttribute("materialType", materialType);
        return new ModelAndView("materialtypes/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void MaterialTypesItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void MaterialTypesItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<MaterialType> MaterialTypesItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String MaterialTypesItemThymeleafController.getModelName() {
        return "materialType";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String MaterialTypesItemThymeleafController.getEditViewPath() {
        return "materialtypes/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer MaterialTypesItemThymeleafController.getLastVersion(MaterialType record) {
        Long versionValue = getMaterialTypeService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView MaterialTypesItemThymeleafController.populateAndGetFormView(MaterialType entity, Model model) {
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
    @InitBinder("materialType")
    public void MaterialTypesItemThymeleafController.initMaterialTypeBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(MaterialType.class, getMaterialTypeService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView MaterialTypesItemThymeleafController.editForm(@ModelAttribute MaterialType materialType, Model model) {
        populateForm(model);
        
        model.addAttribute("materialType", materialType);
        return new ModelAndView("materialtypes/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialType
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView MaterialTypesItemThymeleafController.update(@Valid @ModelAttribute MaterialType materialType, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        MaterialType savedMaterialType = getConcurrencyTemplate().execute(materialType, model, new ConcurrencyCallback<MaterialType>() {
            @Override
            public MaterialType doInConcurrency(MaterialType materialType) throws Exception {
                return getMaterialTypeService().save(materialType);
            }
        });
        UriComponents showURI = getItemLink().to(MaterialTypesItemThymeleafLinkFactory.SHOW).with("materialType", savedMaterialType.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialType
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> MaterialTypesItemThymeleafController.delete(@ModelAttribute MaterialType materialType) {
        getMaterialTypeService().delete(materialType);
        return ResponseEntity.ok().build();
    }
    
}
