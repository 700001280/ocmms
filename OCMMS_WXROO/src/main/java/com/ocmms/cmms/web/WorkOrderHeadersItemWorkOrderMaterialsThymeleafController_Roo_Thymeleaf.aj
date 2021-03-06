// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;
import com.ocmms.cmms.service.api.WorkOrderHeaderService;
import com.ocmms.cmms.service.api.WorkOrderMaterialService;
import com.ocmms.cmms.web.WorkOrderHeadersCollectionThymeleafController;
import com.ocmms.cmms.web.WorkOrderHeadersCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.WorkOrderHeadersItemWorkOrderMaterialsThymeleafController;
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

privileged aspect WorkOrderHeadersItemWorkOrderMaterialsThymeleafController_Roo_Thymeleaf {
    
    declare @type: WorkOrderHeadersItemWorkOrderMaterialsThymeleafController: @Controller;
    
    declare @type: WorkOrderHeadersItemWorkOrderMaterialsThymeleafController: @RequestMapping(value = "/workorderheaders/{workOrderHeader}/workOrderMaterials", name = "WorkOrderHeadersItemWorkOrderMaterialsThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private WorkOrderHeaderService WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.workOrderHeaderService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private WorkOrderMaterialService WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.workOrderMaterialService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<WorkOrderHeadersCollectionThymeleafController> WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param workOrderHeaderService
     * @param workOrderMaterialService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.new(WorkOrderHeaderService workOrderHeaderService, WorkOrderMaterialService workOrderMaterialService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setWorkOrderHeaderService(workOrderHeaderService);
        setWorkOrderMaterialService(workOrderMaterialService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(WorkOrderHeadersCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return WorkOrderHeaderService
     */
    public WorkOrderHeaderService WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.getWorkOrderHeaderService() {
        return workOrderHeaderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeaderService
     */
    public void WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.setWorkOrderHeaderService(WorkOrderHeaderService workOrderHeaderService) {
        this.workOrderHeaderService = workOrderHeaderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return WorkOrderMaterialService
     */
    public WorkOrderMaterialService WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.getWorkOrderMaterialService() {
        return workOrderMaterialService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderMaterialService
     */
    public void WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.setWorkOrderMaterialService(WorkOrderMaterialService workOrderMaterialService) {
        this.workOrderMaterialService = workOrderMaterialService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<WorkOrderHeadersCollectionThymeleafController> WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.setCollectionLink(MethodLinkBuilderFactory<WorkOrderHeadersCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.setConversionService(ConversionService conversionService) {
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
    public WorkOrderHeader WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.getWorkOrderHeader(@PathVariable("workOrderHeader") Long id, Locale locale, HttpMethod method) {
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
    public void WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrder
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<WorkOrderMaterial>> WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.datatables(@ModelAttribute WorkOrderHeader workOrder, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<WorkOrderMaterial> workOrderMaterials = getWorkOrderMaterialService().findByWorkOrder(workOrder, search, pageable);
        long totalWorkOrderMaterialsCount = getWorkOrderMaterialService().countByWorkOrder(workOrder);
        ConvertedDatatablesData<WorkOrderMaterial> data =  new ConvertedDatatablesData<WorkOrderMaterial>(workOrderMaterials, totalWorkOrderMaterialsCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<WorkOrderMaterial>> WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<WorkOrderMaterial> workOrderMaterials = getWorkOrderMaterialService().findAllByIdsIn(ids, search, pageable);
        long totalWorkOrderMaterialsCount = workOrderMaterials.getTotalElements();
        ConvertedDatatablesData<WorkOrderMaterial> data =  new ConvertedDatatablesData<WorkOrderMaterial>(workOrderMaterials, totalWorkOrderMaterialsCount, draw, getConversionService(), datatablesColumns);
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
    public ModelAndView WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.createForm(@ModelAttribute WorkOrderHeader workOrderHeader, Model model) {
        populateForm(model);
        model.addAttribute("workOrderMaterial", new WorkOrderMaterial());
        return new ModelAndView("workorderheaders/workOrderMaterials/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeader
     * @param workOrderMaterialsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromWorkOrderMaterials", value = "/{workOrderMaterialsToRemove}")
    @ResponseBody
    public ResponseEntity<?> WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.removeFromWorkOrderMaterials(@ModelAttribute WorkOrderHeader workOrderHeader, @PathVariable("workOrderMaterialsToRemove") Long workOrderMaterialsToRemove) {
        getWorkOrderHeaderService().removeFromWorkOrderMaterials(workOrderHeader,Collections.singleton(workOrderMaterialsToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeader
     * @param workOrderMaterialsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromWorkOrderMaterialsBatch", value = "/batch/{workOrderMaterialsToRemove}")
    @ResponseBody
    public ResponseEntity<?> WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.removeFromWorkOrderMaterialsBatch(@ModelAttribute WorkOrderHeader workOrderHeader, @PathVariable("workOrderMaterialsToRemove") Collection<Long> workOrderMaterialsToRemove) {
        getWorkOrderHeaderService().removeFromWorkOrderMaterials(workOrderHeader, workOrderMaterialsToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workOrderHeader
     * @param workOrderMaterials
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView WorkOrderHeadersItemWorkOrderMaterialsThymeleafController.create(@ModelAttribute WorkOrderHeader workOrderHeader, @RequestParam(value = "workOrderMaterialsIds", required = false) List<Long> workOrderMaterials, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (workOrderMaterials != null) {
            for (Iterator<Long> iterator = workOrderMaterials.iterator(); iterator.hasNext();) {
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
            if (workOrderMaterials != null) {
                workOrderHeader.setWorkOrderMaterials(new HashSet<WorkOrderMaterial>(getWorkOrderMaterialService().findAll(workOrderMaterials)));
            }else{
                workOrderHeader.setWorkOrderMaterials(new HashSet<WorkOrderMaterial>());
            }
            // Reset the version to prevent update
             workOrderHeader.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("workOrderHeader", workOrderHeader);
            model.addAttribute("concurrency", true);
            return new ModelAndView("workorderheaders/workOrderMaterials/create");
        }else if(!Objects.equals(version, workOrderHeader.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("workOrderHeader", workOrderHeader);
            model.addAttribute("concurrency", false);
            return new ModelAndView("workorderheaders/workOrderMaterials/create");
        }
        getWorkOrderHeaderService().setWorkOrderMaterials(workOrderHeader,workOrderMaterials);
        return new ModelAndView("redirect:" + getCollectionLink().to(WorkOrderHeadersCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
