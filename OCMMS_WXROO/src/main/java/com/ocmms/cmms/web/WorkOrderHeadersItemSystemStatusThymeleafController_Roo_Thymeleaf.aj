// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.ocmms.cmms.model.pm.workorder.WorkOrderSystemStatus;
import com.ocmms.cmms.service.api.WorkOrderHeaderService;
import com.ocmms.cmms.service.api.WorkOrderSystemStatusService;
import com.ocmms.cmms.web.WorkOrderHeadersCollectionThymeleafController;
import com.ocmms.cmms.web.WorkOrderHeadersCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.WorkOrderHeadersItemSystemStatusThymeleafController;
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

privileged aspect WorkOrderHeadersItemSystemStatusThymeleafController_Roo_Thymeleaf {
    
    declare @type: WorkOrderHeadersItemSystemStatusThymeleafController: @Controller;
    
    declare @type: WorkOrderHeadersItemSystemStatusThymeleafController: @RequestMapping(value = "/workorderheaders/{workOrderHeader}/systemStatus", name = "WorkOrderHeadersItemSystemStatusThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private WorkOrderHeaderService WorkOrderHeadersItemSystemStatusThymeleafController.workOrderHeaderService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private WorkOrderSystemStatusService WorkOrderHeadersItemSystemStatusThymeleafController.workOrderSystemStatusService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource WorkOrderHeadersItemSystemStatusThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<WorkOrderHeadersCollectionThymeleafController> WorkOrderHeadersItemSystemStatusThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService WorkOrderHeadersItemSystemStatusThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param workOrderHeaderService
     * @param workOrderSystemStatusService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public WorkOrderHeadersItemSystemStatusThymeleafController.new(WorkOrderHeaderService workOrderHeaderService, WorkOrderSystemStatusService workOrderSystemStatusService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setWorkOrderHeaderService(workOrderHeaderService);
        setWorkOrderSystemStatusService(workOrderSystemStatusService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(WorkOrderHeadersCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return WorkOrderHeaderService
     */
    public WorkOrderHeaderService WorkOrderHeadersItemSystemStatusThymeleafController.getWorkOrderHeaderService() {
        return workOrderHeaderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeaderService
     */
    public void WorkOrderHeadersItemSystemStatusThymeleafController.setWorkOrderHeaderService(WorkOrderHeaderService workOrderHeaderService) {
        this.workOrderHeaderService = workOrderHeaderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return WorkOrderSystemStatusService
     */
    public WorkOrderSystemStatusService WorkOrderHeadersItemSystemStatusThymeleafController.getWorkOrderSystemStatusService() {
        return workOrderSystemStatusService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderSystemStatusService
     */
    public void WorkOrderHeadersItemSystemStatusThymeleafController.setWorkOrderSystemStatusService(WorkOrderSystemStatusService workOrderSystemStatusService) {
        this.workOrderSystemStatusService = workOrderSystemStatusService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource WorkOrderHeadersItemSystemStatusThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void WorkOrderHeadersItemSystemStatusThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<WorkOrderHeadersCollectionThymeleafController> WorkOrderHeadersItemSystemStatusThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void WorkOrderHeadersItemSystemStatusThymeleafController.setCollectionLink(MethodLinkBuilderFactory<WorkOrderHeadersCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService WorkOrderHeadersItemSystemStatusThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void WorkOrderHeadersItemSystemStatusThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return WorkOrderHeader
     */
    @ModelAttribute
    public WorkOrderHeader WorkOrderHeadersItemSystemStatusThymeleafController.getWorkOrderHeader(@PathVariable("workOrderHeader") Long id, Locale locale, HttpMethod method) {
        WorkOrderHeader workOrderHeader = null;
        if (HttpMethod.PUT.equals(method)) {
            workOrderHeader = workOrderHeaderService.findOneForUpdate(id);
        } else {
            workOrderHeader = workOrderHeaderService.findOne(id);
        }
        
        if (workOrderHeader == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"WorkOrderHeader", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return workOrderHeader;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void WorkOrderHeadersItemSystemStatusThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void WorkOrderHeadersItemSystemStatusThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeaders
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<WorkOrderSystemStatus>> WorkOrderHeadersItemSystemStatusThymeleafController.datatables(@ModelAttribute WorkOrderHeader workOrderHeaders, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<WorkOrderSystemStatus> systemStatus = getWorkOrderSystemStatusService().findByWorkOrderHeadersContains(workOrderHeaders, search, pageable);
        long totalSystemStatusCount = getWorkOrderSystemStatusService().countByWorkOrderHeadersContains(workOrderHeaders);
        ConvertedDatatablesData<WorkOrderSystemStatus> data =  new ConvertedDatatablesData<WorkOrderSystemStatus>(systemStatus, totalSystemStatusCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<WorkOrderSystemStatus>> WorkOrderHeadersItemSystemStatusThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<WorkOrderSystemStatus> systemStatus = getWorkOrderSystemStatusService().findAllByIdsIn(ids, search, pageable);
        long totalSystemStatusCount = systemStatus.getTotalElements();
        ConvertedDatatablesData<WorkOrderSystemStatus> data =  new ConvertedDatatablesData<WorkOrderSystemStatus>(systemStatus, totalSystemStatusCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeader
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView WorkOrderHeadersItemSystemStatusThymeleafController.createForm(@ModelAttribute WorkOrderHeader workOrderHeader, Model model) {
        populateForm(model);
        model.addAttribute("workOrderSystemStatus", new WorkOrderSystemStatus());
        return new ModelAndView("workorderheaders/systemStatus/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeader
     * @param systemStatusToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromSystemStatus", value = "/{systemStatusToRemove}")
    @ResponseBody
    public ResponseEntity<?> WorkOrderHeadersItemSystemStatusThymeleafController.removeFromSystemStatus(@ModelAttribute WorkOrderHeader workOrderHeader, @PathVariable("systemStatusToRemove") Long systemStatusToRemove) {
        getWorkOrderHeaderService().removeFromSystemStatus(workOrderHeader,Collections.singleton(systemStatusToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeader
     * @param systemStatusToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromSystemStatusBatch", value = "/batch/{systemStatusToRemove}")
    @ResponseBody
    public ResponseEntity<?> WorkOrderHeadersItemSystemStatusThymeleafController.removeFromSystemStatusBatch(@ModelAttribute WorkOrderHeader workOrderHeader, @PathVariable("systemStatusToRemove") Collection<Long> systemStatusToRemove) {
        getWorkOrderHeaderService().removeFromSystemStatus(workOrderHeader, systemStatusToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeader
     * @param systemStatus
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView WorkOrderHeadersItemSystemStatusThymeleafController.create(@ModelAttribute WorkOrderHeader workOrderHeader, @RequestParam(value = "systemStatusIds", required = false) List<Long> systemStatus, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (systemStatus != null) {
            for (Iterator<Long> iterator = systemStatus.iterator(); iterator.hasNext();) {
                if (iterator.next() == null) {
                    iterator.remove();
                }
            }
        }
        // Concurrency control
        if(!Objects.equals(version, workOrderHeader.getVersion()) && StringUtils.isEmpty(concurrencyControl)){
            populateForm(model);
            // Obtain the selected books and include them in the author that will be 
            // included in the view
            if (systemStatus != null) {
                workOrderHeader.setSystemStatus(new HashSet<WorkOrderSystemStatus>(getWorkOrderSystemStatusService().findAll(systemStatus)));
            }else{
                workOrderHeader.setSystemStatus(new HashSet<WorkOrderSystemStatus>());
            }
            // Reset the version to prevent update
             workOrderHeader.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("workOrderHeader", workOrderHeader);
            model.addAttribute("concurrency", true);
            return new ModelAndView("workorderheaders/systemStatus/create");
        }else if(!Objects.equals(version, workOrderHeader.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("workOrderHeader", workOrderHeader);
            model.addAttribute("concurrency", false);
            return new ModelAndView("workorderheaders/systemStatus/create");
        }
        getWorkOrderHeaderService().setSystemStatus(workOrderHeader,systemStatus);
        return new ModelAndView("redirect:" + getCollectionLink().to(WorkOrderHeadersCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
