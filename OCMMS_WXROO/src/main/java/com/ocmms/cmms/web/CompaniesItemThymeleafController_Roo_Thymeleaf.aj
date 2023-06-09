// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.hrm.Company;
import com.ocmms.cmms.service.api.CompanyService;
import com.ocmms.cmms.web.CompaniesCollectionThymeleafController;
import com.ocmms.cmms.web.CompaniesItemThymeleafController;
import com.ocmms.cmms.web.CompaniesItemThymeleafLinkFactory;
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

privileged aspect CompaniesItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: CompaniesItemThymeleafController: @Controller;
    
    declare @type: CompaniesItemThymeleafController: @RequestMapping(value = "/companies/{company}", name = "CompaniesItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private CompanyService CompaniesItemThymeleafController.companyService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource CompaniesItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<CompaniesItemThymeleafController> CompaniesItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<CompaniesCollectionThymeleafController> CompaniesItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<Company> CompaniesItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<Company>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param companyService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public CompaniesItemThymeleafController.new(CompanyService companyService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setCompanyService(companyService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(CompaniesItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(CompaniesCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return CompanyService
     */
    public CompanyService CompaniesItemThymeleafController.getCompanyService() {
        return companyService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param companyService
     */
    public void CompaniesItemThymeleafController.setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource CompaniesItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void CompaniesItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<CompaniesItemThymeleafController> CompaniesItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void CompaniesItemThymeleafController.setItemLink(MethodLinkBuilderFactory<CompaniesItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<CompaniesCollectionThymeleafController> CompaniesItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void CompaniesItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<CompaniesCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return Company
     */
    @ModelAttribute
    public Company CompaniesItemThymeleafController.getCompany(@PathVariable("company") Long id, Locale locale, HttpMethod method) {
        Company company = null;
        if (HttpMethod.PUT.equals(method)) {
            company = companyService.findOneForUpdate(id);
        } else {
            company = companyService.findOne(id);
        }
        
        if (company == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"Company", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return company;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param company
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView CompaniesItemThymeleafController.show(@ModelAttribute Company company, Model model) {
        model.addAttribute("company", company);
        return new ModelAndView("companies/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param company
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView CompaniesItemThymeleafController.showInline(@ModelAttribute Company company, Model model) {
        model.addAttribute("company", company);
        return new ModelAndView("companies/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void CompaniesItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void CompaniesItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<Company> CompaniesItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String CompaniesItemThymeleafController.getModelName() {
        return "company";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String CompaniesItemThymeleafController.getEditViewPath() {
        return "companies/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer CompaniesItemThymeleafController.getLastVersion(Company record) {
        Long versionValue = getCompanyService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView CompaniesItemThymeleafController.populateAndGetFormView(Company entity, Model model) {
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
    @InitBinder("company")
    public void CompaniesItemThymeleafController.initCompanyBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(Company.class, getCompanyService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param company
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView CompaniesItemThymeleafController.editForm(@ModelAttribute Company company, Model model) {
        populateForm(model);
        
        model.addAttribute("company", company);
        return new ModelAndView("companies/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param company
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView CompaniesItemThymeleafController.update(@Valid @ModelAttribute Company company, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        Company savedCompany = getConcurrencyTemplate().execute(company, model, new ConcurrencyCallback<Company>() {
            @Override
            public Company doInConcurrency(Company company) throws Exception {
                return getCompanyService().save(company);
            }
        });
        UriComponents showURI = getItemLink().to(CompaniesItemThymeleafLinkFactory.SHOW).with("company", savedCompany.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param company
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> CompaniesItemThymeleafController.delete(@ModelAttribute Company company) {
        getCompanyService().delete(company);
        return ResponseEntity.ok().build();
    }
    
}
