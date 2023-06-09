// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import com.ocmms.cmms.service.api.OperationalWorkCenterService;
import com.ocmms.cmms.service.api.OrganizationService;
import com.ocmms.cmms.web.OrganizationsCollectionThymeleafController;
import com.ocmms.cmms.web.OrganizationsCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.OrganizationsItemOperationalWorkCentersThymeleafController;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.web.datatables.ConvertedDatatablesData;
import io.springlets.data.web.datatables.Datatables;
import io.springlets.data.web.datatables.DatatablesColumns;
import io.springlets.data.web.datatables.DatatablesPageable;
import io.springlets.web.NotFoundException;
import io.springlets.web.mvc.util.ControllerMethodLinkBuilderFactory;
import io.springlets.web.mvc.util.MethodLinkBuilderFactory;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

privileged aspect OrganizationsItemOperationalWorkCentersThymeleafController_Roo_Thymeleaf {
    
    declare @type: OrganizationsItemOperationalWorkCentersThymeleafController: @Controller;
    
    declare @type: OrganizationsItemOperationalWorkCentersThymeleafController: @RequestMapping(value = "/organizations/{organization}/operationalWorkCenters", name = "OrganizationsItemOperationalWorkCentersThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private OrganizationService OrganizationsItemOperationalWorkCentersThymeleafController.organizationService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private OperationalWorkCenterService OrganizationsItemOperationalWorkCentersThymeleafController.operationalWorkCenterService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource OrganizationsItemOperationalWorkCentersThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<OrganizationsCollectionThymeleafController> OrganizationsItemOperationalWorkCentersThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService OrganizationsItemOperationalWorkCentersThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param organizationService
     * @param operationalWorkCenterService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public OrganizationsItemOperationalWorkCentersThymeleafController.new(OrganizationService organizationService, OperationalWorkCenterService operationalWorkCenterService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setOrganizationService(organizationService);
        setOperationalWorkCenterService(operationalWorkCenterService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(OrganizationsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return OrganizationService
     */
    public OrganizationService OrganizationsItemOperationalWorkCentersThymeleafController.getOrganizationService() {
        return organizationService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organizationService
     */
    public void OrganizationsItemOperationalWorkCentersThymeleafController.setOrganizationService(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return OperationalWorkCenterService
     */
    public OperationalWorkCenterService OrganizationsItemOperationalWorkCentersThymeleafController.getOperationalWorkCenterService() {
        return operationalWorkCenterService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param operationalWorkCenterService
     */
    public void OrganizationsItemOperationalWorkCentersThymeleafController.setOperationalWorkCenterService(OperationalWorkCenterService operationalWorkCenterService) {
        this.operationalWorkCenterService = operationalWorkCenterService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource OrganizationsItemOperationalWorkCentersThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void OrganizationsItemOperationalWorkCentersThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<OrganizationsCollectionThymeleafController> OrganizationsItemOperationalWorkCentersThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void OrganizationsItemOperationalWorkCentersThymeleafController.setCollectionLink(MethodLinkBuilderFactory<OrganizationsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService OrganizationsItemOperationalWorkCentersThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void OrganizationsItemOperationalWorkCentersThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return Organization
     */
    @ModelAttribute
    public Organization OrganizationsItemOperationalWorkCentersThymeleafController.getOrganization(@PathVariable("organization") Long id, Locale locale, HttpMethod method) {
        Organization organization = null;
        if (HttpMethod.PUT.equals(method)) {
            organization = organizationService.findOneForUpdate(id);
        } else {
            organization = organizationService.findOne(id);
        }
        
        if (organization == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"Organization", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return organization;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void OrganizationsItemOperationalWorkCentersThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("capacityStartTime_date_format", DateTimeFormat.patternForStyle("-M", LocaleContextHolder.getLocale()));
        model.addAttribute("capacityEndTime_date_format", DateTimeFormat.patternForStyle("-M", LocaleContextHolder.getLocale()));
        model.addAttribute("validityStartDate_date_format", DateTimeFormat.patternForStyle("MM", LocaleContextHolder.getLocale()));
        model.addAttribute("validityEndDate_date_format", DateTimeFormat.patternForStyle("MM", LocaleContextHolder.getLocale()));
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void OrganizationsItemOperationalWorkCentersThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organization
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<OperationalWorkCenter>> OrganizationsItemOperationalWorkCentersThymeleafController.datatables(@ModelAttribute Organization organization, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<OperationalWorkCenter> operationalWorkCenters = getOperationalWorkCenterService().findByOrganization(organization, search, pageable);
        long totalOperationalWorkCentersCount = getOperationalWorkCenterService().countByOrganization(organization);
        ConvertedDatatablesData<OperationalWorkCenter> data =  new ConvertedDatatablesData<OperationalWorkCenter>(operationalWorkCenters, totalOperationalWorkCentersCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatablesByIdsIn", produces = Datatables.MEDIA_TYPE, value = "/dtByIdsIn")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<OperationalWorkCenter>> OrganizationsItemOperationalWorkCentersThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<OperationalWorkCenter> operationalWorkCenters = getOperationalWorkCenterService().findAllByIdsIn(ids, search, pageable);
        long totalOperationalWorkCentersCount = operationalWorkCenters.getTotalElements();
        ConvertedDatatablesData<OperationalWorkCenter> data =  new ConvertedDatatablesData<OperationalWorkCenter>(operationalWorkCenters, totalOperationalWorkCentersCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organization
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView OrganizationsItemOperationalWorkCentersThymeleafController.createForm(@ModelAttribute Organization organization, Model model) {
        populateForm(model);
        model.addAttribute("operationalWorkCenter", new OperationalWorkCenter());
        return new ModelAndView("organizations/operationalWorkCenters/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organization
     * @param operationalWorkCentersToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromOperationalWorkCenters", value = "/{operationalWorkCentersToRemove}")
    @ResponseBody
    public ResponseEntity<?> OrganizationsItemOperationalWorkCentersThymeleafController.removeFromOperationalWorkCenters(@ModelAttribute Organization organization, @PathVariable("operationalWorkCentersToRemove") Long operationalWorkCentersToRemove) {
        getOrganizationService().removeFromOperationalWorkCenters(organization,Collections.singleton(operationalWorkCentersToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organization
     * @param operationalWorkCentersToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromOperationalWorkCentersBatch", value = "/batch/{operationalWorkCentersToRemove}")
    @ResponseBody
    public ResponseEntity<?> OrganizationsItemOperationalWorkCentersThymeleafController.removeFromOperationalWorkCentersBatch(@ModelAttribute Organization organization, @PathVariable("operationalWorkCentersToRemove") Collection<Long> operationalWorkCentersToRemove) {
        getOrganizationService().removeFromOperationalWorkCenters(organization, operationalWorkCentersToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param organization
     * @param operationalWorkCenters
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView OrganizationsItemOperationalWorkCentersThymeleafController.create(@ModelAttribute Organization organization, @RequestParam(value = "operationalWorkCentersIds", required = false) List<Long> operationalWorkCenters, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (operationalWorkCenters != null) {
            for (Iterator<Long> iterator = operationalWorkCenters.iterator(); iterator.hasNext();) {
                if (iterator.next() == null) {
                    iterator.remove();
                }
            }
        }
        // Concurrency control
        if(!Objects.equals(version, organization.getVersion()) && StringUtils.isEmpty(concurrencyControl)){
            populateForm(model);
            // Obtain the selected books and include them in the author that will be 
            // included in the view
            if (operationalWorkCenters != null) {
                organization.setOperationalWorkCenters(new HashSet<OperationalWorkCenter>(getOperationalWorkCenterService().findAll(operationalWorkCenters)));
            }else{
                organization.setOperationalWorkCenters(new HashSet<OperationalWorkCenter>());
            }
            // Reset the version to prevent update
             organization.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("organization", organization);
            model.addAttribute("concurrency", true);
            return new ModelAndView("organizations/operationalWorkCenters/create");
        }else if(!Objects.equals(version, organization.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("organization", organization);
            model.addAttribute("concurrency", false);
            return new ModelAndView("organizations/operationalWorkCenters/create");
        }
        getOrganizationService().setOperationalWorkCenters(organization,operationalWorkCenters);
        return new ModelAndView("redirect:" + getCollectionLink().to(OrganizationsCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
