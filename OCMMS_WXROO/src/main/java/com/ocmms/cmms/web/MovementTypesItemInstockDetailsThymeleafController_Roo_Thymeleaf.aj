// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.storage.InstockDetail;
import com.ocmms.cmms.model.mm.storage.MovementType;
import com.ocmms.cmms.service.api.InstockDetailService;
import com.ocmms.cmms.service.api.MovementTypeService;
import com.ocmms.cmms.web.MovementTypesCollectionThymeleafController;
import com.ocmms.cmms.web.MovementTypesCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.MovementTypesItemInstockDetailsThymeleafController;
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

privileged aspect MovementTypesItemInstockDetailsThymeleafController_Roo_Thymeleaf {
    
    declare @type: MovementTypesItemInstockDetailsThymeleafController: @Controller;
    
    declare @type: MovementTypesItemInstockDetailsThymeleafController: @RequestMapping(value = "/movementtypes/{movementType}/instockDetails", name = "MovementTypesItemInstockDetailsThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MovementTypeService MovementTypesItemInstockDetailsThymeleafController.movementTypeService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private InstockDetailService MovementTypesItemInstockDetailsThymeleafController.instockDetailService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource MovementTypesItemInstockDetailsThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<MovementTypesCollectionThymeleafController> MovementTypesItemInstockDetailsThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService MovementTypesItemInstockDetailsThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param movementTypeService
     * @param instockDetailService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public MovementTypesItemInstockDetailsThymeleafController.new(MovementTypeService movementTypeService, InstockDetailService instockDetailService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setMovementTypeService(movementTypeService);
        setInstockDetailService(instockDetailService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(MovementTypesCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MovementTypeService
     */
    public MovementTypeService MovementTypesItemInstockDetailsThymeleafController.getMovementTypeService() {
        return movementTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param movementTypeService
     */
    public void MovementTypesItemInstockDetailsThymeleafController.setMovementTypeService(MovementTypeService movementTypeService) {
        this.movementTypeService = movementTypeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return InstockDetailService
     */
    public InstockDetailService MovementTypesItemInstockDetailsThymeleafController.getInstockDetailService() {
        return instockDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param instockDetailService
     */
    public void MovementTypesItemInstockDetailsThymeleafController.setInstockDetailService(InstockDetailService instockDetailService) {
        this.instockDetailService = instockDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource MovementTypesItemInstockDetailsThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void MovementTypesItemInstockDetailsThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<MovementTypesCollectionThymeleafController> MovementTypesItemInstockDetailsThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void MovementTypesItemInstockDetailsThymeleafController.setCollectionLink(MethodLinkBuilderFactory<MovementTypesCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService MovementTypesItemInstockDetailsThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void MovementTypesItemInstockDetailsThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return MovementType
     */
    @ModelAttribute
    public MovementType MovementTypesItemInstockDetailsThymeleafController.getMovementType(@PathVariable("movementType") Long id, Locale locale, HttpMethod method) {
        MovementType movementType = null;
        if (HttpMethod.PUT.equals(method)) {
            movementType = movementTypeService.findOneForUpdate(id);
        } else {
            movementType = movementTypeService.findOne(id);
        }
        
        if (movementType == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"MovementType", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return movementType;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void MovementTypesItemInstockDetailsThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("receiveDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("expirationDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void MovementTypesItemInstockDetailsThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param movementType
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<InstockDetail>> MovementTypesItemInstockDetailsThymeleafController.datatables(@ModelAttribute MovementType movementType, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<InstockDetail> instockDetails = getInstockDetailService().findByMovementType(movementType, search, pageable);
        long totalInstockDetailsCount = getInstockDetailService().countByMovementType(movementType);
        ConvertedDatatablesData<InstockDetail> data =  new ConvertedDatatablesData<InstockDetail>(instockDetails, totalInstockDetailsCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<InstockDetail>> MovementTypesItemInstockDetailsThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<InstockDetail> instockDetails = getInstockDetailService().findAllByIdsIn(ids, search, pageable);
        long totalInstockDetailsCount = instockDetails.getTotalElements();
        ConvertedDatatablesData<InstockDetail> data =  new ConvertedDatatablesData<InstockDetail>(instockDetails, totalInstockDetailsCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param movementType
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView MovementTypesItemInstockDetailsThymeleafController.createForm(@ModelAttribute MovementType movementType, Model model) {
        populateForm(model);
        model.addAttribute("instockDetail", new InstockDetail());
        return new ModelAndView("movementtypes/instockDetails/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param movementType
     * @param instockDetailsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromInstockDetails", value = "/{instockDetailsToRemove}")
    @ResponseBody
    public ResponseEntity<?> MovementTypesItemInstockDetailsThymeleafController.removeFromInstockDetails(@ModelAttribute MovementType movementType, @PathVariable("instockDetailsToRemove") Long instockDetailsToRemove) {
        getMovementTypeService().removeFromInstockDetails(movementType,Collections.singleton(instockDetailsToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param movementType
     * @param instockDetailsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromInstockDetailsBatch", value = "/batch/{instockDetailsToRemove}")
    @ResponseBody
    public ResponseEntity<?> MovementTypesItemInstockDetailsThymeleafController.removeFromInstockDetailsBatch(@ModelAttribute MovementType movementType, @PathVariable("instockDetailsToRemove") Collection<Long> instockDetailsToRemove) {
        getMovementTypeService().removeFromInstockDetails(movementType, instockDetailsToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param movementType
     * @param instockDetails
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView MovementTypesItemInstockDetailsThymeleafController.create(@ModelAttribute MovementType movementType, @RequestParam(value = "instockDetailsIds", required = false) List<Long> instockDetails, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (instockDetails != null) {
            for (Iterator<Long> iterator = instockDetails.iterator(); iterator.hasNext();) {
                if (iterator.next() == null) {
                    iterator.remove();
                }
            }
        }
        // Concurrency control
        if(!Objects.equals(version, movementType.getVersion()) && StringUtils.isEmpty(concurrencyControl)){
            populateForm(model);
            // Obtain the selected books and include them in the author that will be 
            // included in the view
            if (instockDetails != null) {
                movementType.setInstockDetails(new HashSet<InstockDetail>(getInstockDetailService().findAll(instockDetails)));
            }else{
                movementType.setInstockDetails(new HashSet<InstockDetail>());
            }
            // Reset the version to prevent update
             movementType.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("movementType", movementType);
            model.addAttribute("concurrency", true);
            return new ModelAndView("movementtypes/instockDetails/create");
        }else if(!Objects.equals(version, movementType.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("movementType", movementType);
            model.addAttribute("concurrency", false);
            return new ModelAndView("movementtypes/instockDetails/create");
        }
        getMovementTypeService().setInstockDetails(movementType,instockDetails);
        return new ModelAndView("redirect:" + getCollectionLink().to(MovementTypesCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
