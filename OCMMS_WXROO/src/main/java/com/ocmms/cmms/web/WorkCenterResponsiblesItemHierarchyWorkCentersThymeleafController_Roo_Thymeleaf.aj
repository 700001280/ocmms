// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import com.ocmms.cmms.service.api.HierarchyWorkCenterService;
import com.ocmms.cmms.service.api.WorkCenterResponsibleService;
import com.ocmms.cmms.web.WorkCenterResponsiblesCollectionThymeleafController;
import com.ocmms.cmms.web.WorkCenterResponsiblesCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController;
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

privileged aspect WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController_Roo_Thymeleaf {
    
    declare @type: WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController: @Controller;
    
    declare @type: WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController: @RequestMapping(value = "/workcenterresponsibles/{workCenterResponsible}/hierarchyWorkCenters", name = "WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private WorkCenterResponsibleService WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.workCenterResponsibleService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private HierarchyWorkCenterService WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.hierarchyWorkCenterService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<WorkCenterResponsiblesCollectionThymeleafController> WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param workCenterResponsibleService
     * @param hierarchyWorkCenterService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.new(WorkCenterResponsibleService workCenterResponsibleService, HierarchyWorkCenterService hierarchyWorkCenterService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setWorkCenterResponsibleService(workCenterResponsibleService);
        setHierarchyWorkCenterService(hierarchyWorkCenterService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(WorkCenterResponsiblesCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return WorkCenterResponsibleService
     */
    public WorkCenterResponsibleService WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.getWorkCenterResponsibleService() {
        return workCenterResponsibleService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsibleService
     */
    public void WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.setWorkCenterResponsibleService(WorkCenterResponsibleService workCenterResponsibleService) {
        this.workCenterResponsibleService = workCenterResponsibleService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return HierarchyWorkCenterService
     */
    public HierarchyWorkCenterService WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.getHierarchyWorkCenterService() {
        return hierarchyWorkCenterService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param hierarchyWorkCenterService
     */
    public void WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.setHierarchyWorkCenterService(HierarchyWorkCenterService hierarchyWorkCenterService) {
        this.hierarchyWorkCenterService = hierarchyWorkCenterService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<WorkCenterResponsiblesCollectionThymeleafController> WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.setCollectionLink(MethodLinkBuilderFactory<WorkCenterResponsiblesCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return WorkCenterResponsible
     */
    @ModelAttribute
    public WorkCenterResponsible WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.getWorkCenterResponsible(@PathVariable("workCenterResponsible") Long id, Locale locale, HttpMethod method) {
        WorkCenterResponsible workCenterResponsible = null;
        if (HttpMethod.PUT.equals(method)) {
            workCenterResponsible = workCenterResponsibleService.findOneForUpdate(id);
        } else {
            workCenterResponsible = workCenterResponsibleService.findOne(id);
        }
        
        if (workCenterResponsible == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"WorkCenterResponsible", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return workCenterResponsible;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param responsible
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<HierarchyWorkCenter>> WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.datatables(@ModelAttribute WorkCenterResponsible responsible, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<HierarchyWorkCenter> hierarchyWorkCenters = getHierarchyWorkCenterService().findByResponsible(responsible, search, pageable);
        long totalHierarchyWorkCentersCount = getHierarchyWorkCenterService().countByResponsible(responsible);
        ConvertedDatatablesData<HierarchyWorkCenter> data =  new ConvertedDatatablesData<HierarchyWorkCenter>(hierarchyWorkCenters, totalHierarchyWorkCentersCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<HierarchyWorkCenter>> WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<HierarchyWorkCenter> hierarchyWorkCenters = getHierarchyWorkCenterService().findAllByIdsIn(ids, search, pageable);
        long totalHierarchyWorkCentersCount = hierarchyWorkCenters.getTotalElements();
        ConvertedDatatablesData<HierarchyWorkCenter> data =  new ConvertedDatatablesData<HierarchyWorkCenter>(hierarchyWorkCenters, totalHierarchyWorkCentersCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.createForm(@ModelAttribute WorkCenterResponsible workCenterResponsible, Model model) {
        populateForm(model);
        model.addAttribute("hierarchyWorkCenter", new HierarchyWorkCenter());
        return new ModelAndView("workcenterresponsibles/hierarchyWorkCenters/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param hierarchyWorkCentersToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromHierarchyWorkCenters", value = "/{hierarchyWorkCentersToRemove}")
    @ResponseBody
    public ResponseEntity<?> WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.removeFromHierarchyWorkCenters(@ModelAttribute WorkCenterResponsible workCenterResponsible, @PathVariable("hierarchyWorkCentersToRemove") Long hierarchyWorkCentersToRemove) {
        getWorkCenterResponsibleService().removeFromHierarchyWorkCenters(workCenterResponsible,Collections.singleton(hierarchyWorkCentersToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param hierarchyWorkCentersToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromHierarchyWorkCentersBatch", value = "/batch/{hierarchyWorkCentersToRemove}")
    @ResponseBody
    public ResponseEntity<?> WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.removeFromHierarchyWorkCentersBatch(@ModelAttribute WorkCenterResponsible workCenterResponsible, @PathVariable("hierarchyWorkCentersToRemove") Collection<Long> hierarchyWorkCentersToRemove) {
        getWorkCenterResponsibleService().removeFromHierarchyWorkCenters(workCenterResponsible, hierarchyWorkCentersToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param workCenterResponsible
     * @param hierarchyWorkCenters
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView WorkCenterResponsiblesItemHierarchyWorkCentersThymeleafController.create(@ModelAttribute WorkCenterResponsible workCenterResponsible, @RequestParam(value = "hierarchyWorkCentersIds", required = false) List<Long> hierarchyWorkCenters, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (hierarchyWorkCenters != null) {
            for (Iterator<Long> iterator = hierarchyWorkCenters.iterator(); iterator.hasNext();) {
                if (iterator.next() == null) {
                    iterator.remove();
                }
            }
        }
        // Concurrency control
        if(!Objects.equals(version, workCenterResponsible.getVersion()) && StringUtils.isEmpty(concurrencyControl)){
            populateForm(model);
            // Obtain the selected books and include them in the author that will be 
            // included in the view
            if (hierarchyWorkCenters != null) {
                workCenterResponsible.setHierarchyWorkCenters(new HashSet<HierarchyWorkCenter>(getHierarchyWorkCenterService().findAll(hierarchyWorkCenters)));
            }else{
                workCenterResponsible.setHierarchyWorkCenters(new HashSet<HierarchyWorkCenter>());
            }
            // Reset the version to prevent update
             workCenterResponsible.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("workCenterResponsible", workCenterResponsible);
            model.addAttribute("concurrency", true);
            return new ModelAndView("workcenterresponsibles/hierarchyWorkCenters/create");
        }else if(!Objects.equals(version, workCenterResponsible.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("workCenterResponsible", workCenterResponsible);
            model.addAttribute("concurrency", false);
            return new ModelAndView("workcenterresponsibles/hierarchyWorkCenters/create");
        }
        getWorkCenterResponsibleService().setHierarchyWorkCenters(workCenterResponsible,hierarchyWorkCenters);
        return new ModelAndView("redirect:" + getCollectionLink().to(WorkCenterResponsiblesCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
