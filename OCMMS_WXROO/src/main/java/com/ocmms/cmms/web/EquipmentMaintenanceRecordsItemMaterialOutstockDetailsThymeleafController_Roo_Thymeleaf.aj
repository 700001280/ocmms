// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import com.ocmms.cmms.service.api.EquipmentMaintenanceRecordService;
import com.ocmms.cmms.service.api.MaterialOutstockDetailService;
import com.ocmms.cmms.web.EquipmentMaintenanceRecordsCollectionThymeleafController;
import com.ocmms.cmms.web.EquipmentMaintenanceRecordsCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController;
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

privileged aspect EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController_Roo_Thymeleaf {
    
    declare @type: EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController: @Controller;
    
    declare @type: EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController: @RequestMapping(value = "/equipmentmaintenancerecords/{equipmentMaintenanceRecord}/materialOutstockDetails", name = "EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private EquipmentMaintenanceRecordService EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.equipmentMaintenanceRecordService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MaterialOutstockDetailService EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.materialOutstockDetailService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<EquipmentMaintenanceRecordsCollectionThymeleafController> EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param equipmentMaintenanceRecordService
     * @param materialOutstockDetailService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.new(EquipmentMaintenanceRecordService equipmentMaintenanceRecordService, MaterialOutstockDetailService materialOutstockDetailService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setEquipmentMaintenanceRecordService(equipmentMaintenanceRecordService);
        setMaterialOutstockDetailService(materialOutstockDetailService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(EquipmentMaintenanceRecordsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return EquipmentMaintenanceRecordService
     */
    public EquipmentMaintenanceRecordService EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.getEquipmentMaintenanceRecordService() {
        return equipmentMaintenanceRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecordService
     */
    public void EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.setEquipmentMaintenanceRecordService(EquipmentMaintenanceRecordService equipmentMaintenanceRecordService) {
        this.equipmentMaintenanceRecordService = equipmentMaintenanceRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MaterialOutstockDetailService
     */
    public MaterialOutstockDetailService EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.getMaterialOutstockDetailService() {
        return materialOutstockDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialOutstockDetailService
     */
    public void EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.setMaterialOutstockDetailService(MaterialOutstockDetailService materialOutstockDetailService) {
        this.materialOutstockDetailService = materialOutstockDetailService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<EquipmentMaintenanceRecordsCollectionThymeleafController> EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.setCollectionLink(MethodLinkBuilderFactory<EquipmentMaintenanceRecordsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return EquipmentMaintenanceRecord
     */
    @ModelAttribute
    public EquipmentMaintenanceRecord EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.getEquipmentMaintenanceRecord(@PathVariable("equipmentMaintenanceRecord") Long id, Locale locale, HttpMethod method) {
        EquipmentMaintenanceRecord equipmentMaintenanceRecord = null;
        if (HttpMethod.PUT.equals(method)) {
            equipmentMaintenanceRecord = equipmentMaintenanceRecordService.findOneForUpdate(id);
        } else {
            equipmentMaintenanceRecord = equipmentMaintenanceRecordService.findOne(id);
        }
        
        if (equipmentMaintenanceRecord == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"EquipmentMaintenanceRecord", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return equipmentMaintenanceRecord;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("issueDate_date_format", DateTimeFormat.patternForStyle("MM", LocaleContextHolder.getLocale()));
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("issueDate_date_format", DateTimeFormat.patternForStyle("MM", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<MaterialOutstockDetail>> EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.datatables(@ModelAttribute EquipmentMaintenanceRecord equipmentMaintenanceRecord, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<MaterialOutstockDetail> materialOutstockDetails = getMaterialOutstockDetailService().findByEquipmentMaintenanceRecord(equipmentMaintenanceRecord, search, pageable);
        long totalMaterialOutstockDetailsCount = getMaterialOutstockDetailService().countByEquipmentMaintenanceRecord(equipmentMaintenanceRecord);
        ConvertedDatatablesData<MaterialOutstockDetail> data =  new ConvertedDatatablesData<MaterialOutstockDetail>(materialOutstockDetails, totalMaterialOutstockDetailsCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<MaterialOutstockDetail>> EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<MaterialOutstockDetail> materialOutstockDetails = getMaterialOutstockDetailService().findAllByIdsIn(ids, search, pageable);
        long totalMaterialOutstockDetailsCount = materialOutstockDetails.getTotalElements();
        ConvertedDatatablesData<MaterialOutstockDetail> data =  new ConvertedDatatablesData<MaterialOutstockDetail>(materialOutstockDetails, totalMaterialOutstockDetailsCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.createForm(@ModelAttribute EquipmentMaintenanceRecord equipmentMaintenanceRecord, Model model) {
        populateForm(model);
        model.addAttribute("materialOutstockDetail", new MaterialOutstockDetail());
        return new ModelAndView("equipmentmaintenancerecords/materialOutstockDetails/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @param materialOutstockDetailsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromMaterialOutstockDetails", value = "/{materialOutstockDetailsToRemove}")
    @ResponseBody
    public ResponseEntity<?> EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.removeFromMaterialOutstockDetails(@ModelAttribute EquipmentMaintenanceRecord equipmentMaintenanceRecord, @PathVariable("materialOutstockDetailsToRemove") Long materialOutstockDetailsToRemove) {
        getEquipmentMaintenanceRecordService().removeFromMaterialOutstockDetails(equipmentMaintenanceRecord,Collections.singleton(materialOutstockDetailsToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @param materialOutstockDetailsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromMaterialOutstockDetailsBatch", value = "/batch/{materialOutstockDetailsToRemove}")
    @ResponseBody
    public ResponseEntity<?> EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.removeFromMaterialOutstockDetailsBatch(@ModelAttribute EquipmentMaintenanceRecord equipmentMaintenanceRecord, @PathVariable("materialOutstockDetailsToRemove") Collection<Long> materialOutstockDetailsToRemove) {
        getEquipmentMaintenanceRecordService().removeFromMaterialOutstockDetails(equipmentMaintenanceRecord, materialOutstockDetailsToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentMaintenanceRecord
     * @param materialOutstockDetails
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView EquipmentMaintenanceRecordsItemMaterialOutstockDetailsThymeleafController.create(@ModelAttribute EquipmentMaintenanceRecord equipmentMaintenanceRecord, @RequestParam(value = "materialOutstockDetailsIds", required = false) List<Long> materialOutstockDetails, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (materialOutstockDetails != null) {
            for (Iterator<Long> iterator = materialOutstockDetails.iterator(); iterator.hasNext();) {
                if (iterator.next() == null) {
                    iterator.remove();
                }
            }
        }
        // Concurrency control
        if(!Objects.equals(version, equipmentMaintenanceRecord.getVersion()) && StringUtils.isEmpty(concurrencyControl)){
            populateForm(model);
            // Obtain the selected books and include them in the author that will be 
            // included in the view
            if (materialOutstockDetails != null) {
                equipmentMaintenanceRecord.setMaterialOutstockDetails(new HashSet<MaterialOutstockDetail>(getMaterialOutstockDetailService().findAll(materialOutstockDetails)));
            }else{
                equipmentMaintenanceRecord.setMaterialOutstockDetails(new HashSet<MaterialOutstockDetail>());
            }
            // Reset the version to prevent update
             equipmentMaintenanceRecord.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("equipmentMaintenanceRecord", equipmentMaintenanceRecord);
            model.addAttribute("concurrency", true);
            return new ModelAndView("equipmentmaintenancerecords/materialOutstockDetails/create");
        }else if(!Objects.equals(version, equipmentMaintenanceRecord.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("equipmentMaintenanceRecord", equipmentMaintenanceRecord);
            model.addAttribute("concurrency", false);
            return new ModelAndView("equipmentmaintenancerecords/materialOutstockDetails/create");
        }
        getEquipmentMaintenanceRecordService().setMaterialOutstockDetails(equipmentMaintenanceRecord,materialOutstockDetails);
        return new ModelAndView("redirect:" + getCollectionLink().to(EquipmentMaintenanceRecordsCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
