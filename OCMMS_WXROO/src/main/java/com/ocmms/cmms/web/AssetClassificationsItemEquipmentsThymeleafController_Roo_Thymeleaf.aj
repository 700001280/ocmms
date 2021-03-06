// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.asset.AssetClassification;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.service.api.AssetClassificationService;
import com.ocmms.cmms.service.api.EquipmentService;
import com.ocmms.cmms.web.AssetClassificationsCollectionThymeleafController;
import com.ocmms.cmms.web.AssetClassificationsCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.AssetClassificationsItemEquipmentsThymeleafController;
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

privileged aspect AssetClassificationsItemEquipmentsThymeleafController_Roo_Thymeleaf {
    
    declare @type: AssetClassificationsItemEquipmentsThymeleafController: @Controller;
    
    declare @type: AssetClassificationsItemEquipmentsThymeleafController: @RequestMapping(value = "/assetclassifications/{assetClassification}/equipments", name = "AssetClassificationsItemEquipmentsThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private AssetClassificationService AssetClassificationsItemEquipmentsThymeleafController.assetClassificationService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private EquipmentService AssetClassificationsItemEquipmentsThymeleafController.equipmentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource AssetClassificationsItemEquipmentsThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<AssetClassificationsCollectionThymeleafController> AssetClassificationsItemEquipmentsThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService AssetClassificationsItemEquipmentsThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param assetClassificationService
     * @param equipmentService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public AssetClassificationsItemEquipmentsThymeleafController.new(AssetClassificationService assetClassificationService, EquipmentService equipmentService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setAssetClassificationService(assetClassificationService);
        setEquipmentService(equipmentService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(AssetClassificationsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return AssetClassificationService
     */
    public AssetClassificationService AssetClassificationsItemEquipmentsThymeleafController.getAssetClassificationService() {
        return assetClassificationService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassificationService
     */
    public void AssetClassificationsItemEquipmentsThymeleafController.setAssetClassificationService(AssetClassificationService assetClassificationService) {
        this.assetClassificationService = assetClassificationService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return EquipmentService
     */
    public EquipmentService AssetClassificationsItemEquipmentsThymeleafController.getEquipmentService() {
        return equipmentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentService
     */
    public void AssetClassificationsItemEquipmentsThymeleafController.setEquipmentService(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource AssetClassificationsItemEquipmentsThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void AssetClassificationsItemEquipmentsThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<AssetClassificationsCollectionThymeleafController> AssetClassificationsItemEquipmentsThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void AssetClassificationsItemEquipmentsThymeleafController.setCollectionLink(MethodLinkBuilderFactory<AssetClassificationsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService AssetClassificationsItemEquipmentsThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void AssetClassificationsItemEquipmentsThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return AssetClassification
     */
    @ModelAttribute
    public AssetClassification AssetClassificationsItemEquipmentsThymeleafController.getAssetClassification(@PathVariable("assetClassification") Long id, Locale locale, HttpMethod method) {
        AssetClassification assetClassification = null;
        if (HttpMethod.PUT.equals(method)) {
            assetClassification = assetClassificationService.findOneForUpdate(id);
        } else {
            assetClassification = assetClassificationService.findOne(id);
        }
        
        if (assetClassification == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"AssetClassification", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return assetClassification;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void AssetClassificationsItemEquipmentsThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("constructionDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("acquisitionDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("beginGuaranteeDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("warrantyEndDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("capitalizedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void AssetClassificationsItemEquipmentsThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<Equipment>> AssetClassificationsItemEquipmentsThymeleafController.datatables(@ModelAttribute AssetClassification assetClassification, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<Equipment> equipments = getEquipmentService().findByAssetClassification(assetClassification, search, pageable);
        long totalEquipmentsCount = getEquipmentService().countByAssetClassification(assetClassification);
        ConvertedDatatablesData<Equipment> data =  new ConvertedDatatablesData<Equipment>(equipments, totalEquipmentsCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<Equipment>> AssetClassificationsItemEquipmentsThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<Equipment> equipments = getEquipmentService().findAllByIdsIn(ids, search, pageable);
        long totalEquipmentsCount = equipments.getTotalElements();
        ConvertedDatatablesData<Equipment> data =  new ConvertedDatatablesData<Equipment>(equipments, totalEquipmentsCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView AssetClassificationsItemEquipmentsThymeleafController.createForm(@ModelAttribute AssetClassification assetClassification, Model model) {
        populateForm(model);
        model.addAttribute("equipment", new Equipment());
        return new ModelAndView("assetclassifications/equipments/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param equipmentsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromEquipments", value = "/{equipmentsToRemove}")
    @ResponseBody
    public ResponseEntity<?> AssetClassificationsItemEquipmentsThymeleafController.removeFromEquipments(@ModelAttribute AssetClassification assetClassification, @PathVariable("equipmentsToRemove") Long equipmentsToRemove) {
        getAssetClassificationService().removeFromEquipments(assetClassification,Collections.singleton(equipmentsToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param equipmentsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromEquipmentsBatch", value = "/batch/{equipmentsToRemove}")
    @ResponseBody
    public ResponseEntity<?> AssetClassificationsItemEquipmentsThymeleafController.removeFromEquipmentsBatch(@ModelAttribute AssetClassification assetClassification, @PathVariable("equipmentsToRemove") Collection<Long> equipmentsToRemove) {
        getAssetClassificationService().removeFromEquipments(assetClassification, equipmentsToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param assetClassification
     * @param equipments
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView AssetClassificationsItemEquipmentsThymeleafController.create(@ModelAttribute AssetClassification assetClassification, @RequestParam(value = "equipmentsIds", required = false) List<Long> equipments, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (equipments != null) {
            for (Iterator<Long> iterator = equipments.iterator(); iterator.hasNext();) {
                if (iterator.next() == null) {
                    iterator.remove();
                }
            }
        }
        // Concurrency control
        if(!Objects.equals(version, assetClassification.getVersion()) && StringUtils.isEmpty(concurrencyControl)){
            populateForm(model);
            // Obtain the selected books and include them in the author that will be 
            // included in the view
            if (equipments != null) {
                assetClassification.setEquipments(new HashSet<Equipment>(getEquipmentService().findAll(equipments)));
            }else{
                assetClassification.setEquipments(new HashSet<Equipment>());
            }
            // Reset the version to prevent update
             assetClassification.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("assetClassification", assetClassification);
            model.addAttribute("concurrency", true);
            return new ModelAndView("assetclassifications/equipments/create");
        }else if(!Objects.equals(version, assetClassification.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("assetClassification", assetClassification);
            model.addAttribute("concurrency", false);
            return new ModelAndView("assetclassifications/equipments/create");
        }
        getAssetClassificationService().setEquipments(assetClassification,equipments);
        return new ModelAndView("redirect:" + getCollectionLink().to(AssetClassificationsCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
