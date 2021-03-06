// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.hrm.Client;
import com.ocmms.cmms.service.api.ClientService;
import com.ocmms.cmms.web.ClientsCollectionThymeleafController;
import com.ocmms.cmms.web.ClientsItemThymeleafController;
import com.ocmms.cmms.web.ClientsItemThymeleafLinkFactory;
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

privileged aspect ClientsItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: ClientsItemThymeleafController: @Controller;
    
    declare @type: ClientsItemThymeleafController: @RequestMapping(value = "/clients/{client}", name = "ClientsItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ClientService ClientsItemThymeleafController.clientService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource ClientsItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<ClientsItemThymeleafController> ClientsItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<ClientsCollectionThymeleafController> ClientsItemThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private final ConcurrencyTemplate<Client> ClientsItemThymeleafController.concurrencyTemplate = new ConcurrencyTemplate<Client>(this);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param clientService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public ClientsItemThymeleafController.new(ClientService clientService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setClientService(clientService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(ClientsItemThymeleafController.class));
        setCollectionLink(linkBuilder.of(ClientsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return ClientService
     */
    public ClientService ClientsItemThymeleafController.getClientService() {
        return clientService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param clientService
     */
    public void ClientsItemThymeleafController.setClientService(ClientService clientService) {
        this.clientService = clientService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource ClientsItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void ClientsItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<ClientsItemThymeleafController> ClientsItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void ClientsItemThymeleafController.setItemLink(MethodLinkBuilderFactory<ClientsItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<ClientsCollectionThymeleafController> ClientsItemThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void ClientsItemThymeleafController.setCollectionLink(MethodLinkBuilderFactory<ClientsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return Client
     */
    @ModelAttribute
    public Client ClientsItemThymeleafController.getClient(@PathVariable("client") Long id, Locale locale, HttpMethod method) {
        Client client = null;
        if (HttpMethod.PUT.equals(method)) {
            client = clientService.findOneForUpdate(id);
        } else {
            client = clientService.findOne(id);
        }
        
        if (client == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"Client", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return client;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param client
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView ClientsItemThymeleafController.show(@ModelAttribute Client client, Model model) {
        model.addAttribute("client", client);
        return new ModelAndView("clients/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param client
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView ClientsItemThymeleafController.showInline(@ModelAttribute Client client, Model model) {
        model.addAttribute("client", client);
        return new ModelAndView("clients/showInline :: inline-content");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void ClientsItemThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void ClientsItemThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConcurrencyTemplate
     */
    public ConcurrencyTemplate<Client> ClientsItemThymeleafController.getConcurrencyTemplate() {
        return concurrencyTemplate;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String ClientsItemThymeleafController.getModelName() {
        return "client";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return String
     */
    public String ClientsItemThymeleafController.getEditViewPath() {
        return "clients/edit";
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param record
     * @return Integer
     */
    public Integer ClientsItemThymeleafController.getLastVersion(Client record) {
        Long versionValue = getClientService().findOne(record.getId()).getVersion();
        return versionValue != null ? versionValue.intValue() : null;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param entity
     * @param model
     * @return ModelAndView
     */
    public ModelAndView ClientsItemThymeleafController.populateAndGetFormView(Client entity, Model model) {
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
    @InitBinder("client")
    public void ClientsItemThymeleafController.initClientBinder(WebDataBinder binder) {
        binder.setDisallowedFields("id");
        // Register validators
        GenericValidator validator = new GenericValidator(Client.class, getClientService());
        binder.addValidators(validator);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param client
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/edit-form", name = "editForm")
    public ModelAndView ClientsItemThymeleafController.editForm(@ModelAttribute Client client, Model model) {
        populateForm(model);
        
        model.addAttribute("client", client);
        return new ModelAndView("clients/edit");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param client
     * @param result
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PutMapping(name = "update")
    public ModelAndView ClientsItemThymeleafController.update(@Valid @ModelAttribute Client client, BindingResult result, @RequestParam("version") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Check if provided form contain errors
        if (result.hasErrors()) {
            populateForm(model);
            return new ModelAndView(getEditViewPath());
        }
        // Create Concurrency Spring Template to ensure that the following code will manage the
        // possible concurrency exceptions that appears and execute the provided coded inside the Spring template.
        // If some concurrency exception appears the template will manage it.
        Client savedClient = getConcurrencyTemplate().execute(client, model, new ConcurrencyCallback<Client>() {
            @Override
            public Client doInConcurrency(Client client) throws Exception {
                return getClientService().save(client);
            }
        });
        UriComponents showURI = getItemLink().to(ClientsItemThymeleafLinkFactory.SHOW).with("client", savedClient.getId()).toUri();
        return new ModelAndView("redirect:" + showURI.toUriString());
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param client
     * @return ResponseEntity
     */
    @ResponseBody
    @DeleteMapping(name = "delete")
    public ResponseEntity<?> ClientsItemThymeleafController.delete(@ModelAttribute Client client) {
        getClientService().delete(client);
        return ResponseEntity.ok().build();
    }
    
}
