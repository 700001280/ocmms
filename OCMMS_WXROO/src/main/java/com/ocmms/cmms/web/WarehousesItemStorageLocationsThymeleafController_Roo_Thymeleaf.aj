// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.model.mm.storage.Warehouse;
import com.ocmms.cmms.service.api.StorageLocationService;
import com.ocmms.cmms.service.api.WarehouseService;
import com.ocmms.cmms.web.WarehousesCollectionThymeleafController;
import com.ocmms.cmms.web.WarehousesCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.WarehousesItemStorageLocationsThymeleafController;
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

privileged aspect WarehousesItemStorageLocationsThymeleafController_Roo_Thymeleaf {
    
    declare @type: WarehousesItemStorageLocationsThymeleafController: @Controller;
    
    declare @type: WarehousesItemStorageLocationsThymeleafController: @RequestMapping(value = "/warehouses/{warehouse}/storageLocations", name = "WarehousesItemStorageLocationsThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private WarehouseService WarehousesItemStorageLocationsThymeleafController.warehouseService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private StorageLocationService WarehousesItemStorageLocationsThymeleafController.storageLocationService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource WarehousesItemStorageLocationsThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<WarehousesCollectionThymeleafController> WarehousesItemStorageLocationsThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService WarehousesItemStorageLocationsThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param warehouseService
     * @param storageLocationService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public WarehousesItemStorageLocationsThymeleafController.new(WarehouseService warehouseService, StorageLocationService storageLocationService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setWarehouseService(warehouseService);
        setStorageLocationService(storageLocationService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(WarehousesCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return WarehouseService
     */
    public WarehouseService WarehousesItemStorageLocationsThymeleafController.getWarehouseService() {
        return warehouseService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param warehouseService
     */
    public void WarehousesItemStorageLocationsThymeleafController.setWarehouseService(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return StorageLocationService
     */
    public StorageLocationService WarehousesItemStorageLocationsThymeleafController.getStorageLocationService() {
        return storageLocationService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storageLocationService
     */
    public void WarehousesItemStorageLocationsThymeleafController.setStorageLocationService(StorageLocationService storageLocationService) {
        this.storageLocationService = storageLocationService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource WarehousesItemStorageLocationsThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void WarehousesItemStorageLocationsThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<WarehousesCollectionThymeleafController> WarehousesItemStorageLocationsThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void WarehousesItemStorageLocationsThymeleafController.setCollectionLink(MethodLinkBuilderFactory<WarehousesCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService WarehousesItemStorageLocationsThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void WarehousesItemStorageLocationsThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return Warehouse
     */
    @ModelAttribute
    public Warehouse WarehousesItemStorageLocationsThymeleafController.getWarehouse(@PathVariable("warehouse") Long id, Locale locale, HttpMethod method) {
        Warehouse warehouse = null;
        if (HttpMethod.PUT.equals(method)) {
            warehouse = warehouseService.findOneForUpdate(id);
        } else {
            warehouse = warehouseService.findOne(id);
        }
        
        if (warehouse == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"Warehouse", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return warehouse;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void WarehousesItemStorageLocationsThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void WarehousesItemStorageLocationsThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param warehouse
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<StorageLocation>> WarehousesItemStorageLocationsThymeleafController.datatables(@ModelAttribute Warehouse warehouse, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<StorageLocation> storageLocations = getStorageLocationService().findByWarehouse(warehouse, search, pageable);
        long totalStorageLocationsCount = getStorageLocationService().countByWarehouse(warehouse);
        ConvertedDatatablesData<StorageLocation> data =  new ConvertedDatatablesData<StorageLocation>(storageLocations, totalStorageLocationsCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<StorageLocation>> WarehousesItemStorageLocationsThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<StorageLocation> storageLocations = getStorageLocationService().findAllByIdsIn(ids, search, pageable);
        long totalStorageLocationsCount = storageLocations.getTotalElements();
        ConvertedDatatablesData<StorageLocation> data =  new ConvertedDatatablesData<StorageLocation>(storageLocations, totalStorageLocationsCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param warehouse
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView WarehousesItemStorageLocationsThymeleafController.createForm(@ModelAttribute Warehouse warehouse, Model model) {
        populateForm(model);
        model.addAttribute("storageLocation", new StorageLocation());
        return new ModelAndView("warehouses/storageLocations/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param warehouse
     * @param storageLocationsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromStorageLocations", value = "/{storageLocationsToRemove}")
    @ResponseBody
    public ResponseEntity<?> WarehousesItemStorageLocationsThymeleafController.removeFromStorageLocations(@ModelAttribute Warehouse warehouse, @PathVariable("storageLocationsToRemove") Long storageLocationsToRemove) {
        getWarehouseService().removeFromStorageLocations(warehouse,Collections.singleton(storageLocationsToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param warehouse
     * @param storageLocationsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromStorageLocationsBatch", value = "/batch/{storageLocationsToRemove}")
    @ResponseBody
    public ResponseEntity<?> WarehousesItemStorageLocationsThymeleafController.removeFromStorageLocationsBatch(@ModelAttribute Warehouse warehouse, @PathVariable("storageLocationsToRemove") Collection<Long> storageLocationsToRemove) {
        getWarehouseService().removeFromStorageLocations(warehouse, storageLocationsToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param warehouse
     * @param storageLocations
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView WarehousesItemStorageLocationsThymeleafController.create(@ModelAttribute Warehouse warehouse, @RequestParam(value = "storageLocationsIds", required = false) List<Long> storageLocations, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (storageLocations != null) {
            for (Iterator<Long> iterator = storageLocations.iterator(); iterator.hasNext();) {
                if (iterator.next() == null) {
                    iterator.remove();
                }
            }
        }
        // Concurrency control
        if(!Objects.equals(version, warehouse.getVersion()) && StringUtils.isEmpty(concurrencyControl)){
            populateForm(model);
            // Obtain the selected books and include them in the author that will be 
            // included in the view
            if (storageLocations != null) {
                warehouse.setStorageLocations(new HashSet<StorageLocation>(getStorageLocationService().findAll(storageLocations)));
            }else{
                warehouse.setStorageLocations(new HashSet<StorageLocation>());
            }
            // Reset the version to prevent update
             warehouse.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("warehouse", warehouse);
            model.addAttribute("concurrency", true);
            return new ModelAndView("warehouses/storageLocations/create");
        }else if(!Objects.equals(version, warehouse.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("warehouse", warehouse);
            model.addAttribute("concurrency", false);
            return new ModelAndView("warehouses/storageLocations/create");
        }
        getWarehouseService().setStorageLocations(warehouse,storageLocations);
        return new ModelAndView("redirect:" + getCollectionLink().to(WarehousesCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
