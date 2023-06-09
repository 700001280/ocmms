// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.hrm.OrganizationCatalog;
import com.ocmms.cmms.service.api.OrganizationCatalogService;
import com.ocmms.cmms.web.OrganizationCatalogsCollectionThymeleafController;
import com.ocmms.cmms.web.OrganizationCatalogsItemThymeleafController;
import com.ocmms.cmms.web.OrganizationCatalogsItemThymeleafLinkFactory;
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

privileged aspect OrganizationCatalogsItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: OrganizationCatalogsItemThymeleafController: @Controller;
    
    declare @type: OrganizationCatalogsItemThymeleafController: @RequestMapping(value = "/organizationcatalogs/{organizationCatalog}", name = "OrganizationCatalogsItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private OrganizationCatalogService OrganizationCatalogsItemThymeleafController.organizationCatalogService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource OrganizationCatalogsItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<OrganizationCatalogsItemThymeleafController> OrganizationCatalogsItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<OrganizationCatalogsCollectionThymeleafController> OrganizationCatalogsItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<OrganizationCatalog> OrganizationCatalogsItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<OrganizationCatalog>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param organizationCatalogService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public OrganizationCatalogsItemThymeleafController.new(OrganizationCatalogService organizationCatalogService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setOrganizationCatalogService(organizationCatalogService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(OrganizationCatalogsItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(OrganizationCatalogsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return OrganizationCatalogService
     */
    public OrganizationCatalogService OrganizationCatalogsItemThymeleafController.getOrganizationCatalogService() {
        return organizationCatalogService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organizationCatalogService
     */
    public void OrganizationCatalogsItemThymeleafController.setOrganizationCatalogService(OrganizationCatalogService organizationCatalogService) {
        this.organizationCatalogService = organizationCatalogService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource OrganizationCatalogsItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void OrganizationCatalogsItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<OrganizationCatalogsItemThymeleafController> OrganizationCatalogsItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void OrganizationCatalogsItemThymeleafController.setItemLink(MethodLinkBuilderFactory<OrganizationCatalogsItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<OrganizationCatalogsCollectionThymeleafController> OrganizationCatalogsItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void OrganizationCatalogsItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<OrganizationCatalogsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return OrganizationCatalog
     */
    @ModelAttribute
    public OrganizationCatalog OrganizationCatalogsItemThymeleafController.getOrganizationCatalog(@PathVariable("organizationCatalog") Long id, Locale locale, HttpMethod method) {
        OrganizationCatalog organizationCatalog = null;
        if (HttpMethod.PUT.equals(method)) {
            organizationCatalog = organizationCatalogService.findOneForUpdate(id);
        } else {
            organizationCatalog = organizationCatalogService.findOne(id);
        }
        
        if (organizationCatalog == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"OrganizationCatalog", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return organizationCatalog;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organizationCatalog
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView OrganizationCatalogsItemThymeleafController.show(@ModelAttribute OrganizationCatalog organizationCatalog, Model model) {
        model.addAttribute("organizationCatalog", organizationCatalog);
        return new ModelAndView("organizationcatalogs/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organizationCatalog
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView OrganizationCatalogsItemThymeleafController.showInline(@ModelAttribute OrganizationCatalog organizationCatalog, Model model) {
        model.addAttribute("organizationCatalog", organizationCatalog);
        return new ModelAndView("organizationcatalogs/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void OrganizationCatalogsItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void OrganizationCatalogsItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<OrganizationCatalog> OrganizationCatalogsItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String OrganizationCatalogsItemThymeleafController.getModelName() {
        return "organizationCatalog";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String OrganizationCatalogsItemThymeleafController.getEditViewPath() {
        return "organizationcatalogs/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer OrganizationCatalogsItemThymeleafController.getLastVersion(OrganizationCatalog record) {
        Long versionValue = getOrganizationCatalogService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView OrganizationCatalogsItemThymeleafController.populateAndGetFormView(OrganizationCatalog entity, Model model) {
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
    @InitBinder("organizationCatalog")
    public void OrganizationCatalogsItemThymeleafController.initOrganizationCatalogBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(OrganizationCatalog.class, getOrganizationCatalogService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organizationCatalog
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView OrganizationCatalogsItemThymeleafController.editForm(@ModelAttribute OrganizationCatalog organizationCatalog, Model model) {
        populateForm(model);
        
        model.addAttribute("organizationCatalog", organizationCatalog);
        return new ModelAndView("organizationcatalogs/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organizationCatalog
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView OrganizationCatalogsItemThymeleafController.update(@Valid @ModelAttribute OrganizationCatalog organizationCatalog, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        OrganizationCatalog savedOrganizationCatalog = getConcurrencyTemplate().execute(organizationCatalog, model, new ConcurrencyCallback<OrganizationCatalog>() {
            @Override
            public OrganizationCatalog doInConcurrency(OrganizationCatalog organizationCatalog) throws Exception {
                return getOrganizationCatalogService().save(organizationCatalog);
            }
        });
        UriComponents showURI = getItemLink().to(OrganizationCatalogsItemThymeleafLinkFactory.SHOW).with("organizationCatalog", savedOrganizationCatalog.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organizationCatalog
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> OrganizationCatalogsItemThymeleafController.delete(@ModelAttribute OrganizationCatalog organizationCatalog) {
        getOrganizationCatalogService().delete(organizationCatalog);
        return ResponseEntity.ok().build();
    }
    
}
