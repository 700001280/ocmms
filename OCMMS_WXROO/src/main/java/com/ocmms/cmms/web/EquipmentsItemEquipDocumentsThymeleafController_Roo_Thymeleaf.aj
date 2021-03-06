// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.service.api.DocumentService;
import com.ocmms.cmms.service.api.EquipmentService;
import com.ocmms.cmms.web.EquipmentsCollectionThymeleafController;
import com.ocmms.cmms.web.EquipmentsCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.EquipmentsItemEquipDocumentsThymeleafController;
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

privileged aspect EquipmentsItemEquipDocumentsThymeleafController_Roo_Thymeleaf {
    
    declare @type: EquipmentsItemEquipDocumentsThymeleafController: @Controller;
    
    declare @type: EquipmentsItemEquipDocumentsThymeleafController: @RequestMapping(value = "/equipments/{equipment}/equipDocuments", name = "EquipmentsItemEquipDocumentsThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private EquipmentService EquipmentsItemEquipDocumentsThymeleafController.equipmentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private DocumentService EquipmentsItemEquipDocumentsThymeleafController.documentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource EquipmentsItemEquipDocumentsThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<EquipmentsCollectionThymeleafController> EquipmentsItemEquipDocumentsThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService EquipmentsItemEquipDocumentsThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param equipmentService
     * @param documentService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public EquipmentsItemEquipDocumentsThymeleafController.new(EquipmentService equipmentService, DocumentService documentService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setEquipmentService(equipmentService);
        setDocumentService(documentService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(EquipmentsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return EquipmentService
     */
    public EquipmentService EquipmentsItemEquipDocumentsThymeleafController.getEquipmentService() {
        return equipmentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipmentService
     */
    public void EquipmentsItemEquipDocumentsThymeleafController.setEquipmentService(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return DocumentService
     */
    public DocumentService EquipmentsItemEquipDocumentsThymeleafController.getDocumentService() {
        return documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentService
     */
    public void EquipmentsItemEquipDocumentsThymeleafController.setDocumentService(DocumentService documentService) {
        this.documentService = documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource EquipmentsItemEquipDocumentsThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void EquipmentsItemEquipDocumentsThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<EquipmentsCollectionThymeleafController> EquipmentsItemEquipDocumentsThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void EquipmentsItemEquipDocumentsThymeleafController.setCollectionLink(MethodLinkBuilderFactory<EquipmentsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService EquipmentsItemEquipDocumentsThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void EquipmentsItemEquipDocumentsThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return Equipment
     */
    @ModelAttribute
    public Equipment EquipmentsItemEquipDocumentsThymeleafController.getEquipment(@PathVariable("equipment") Long id, Locale locale, HttpMethod method) {
        Equipment equipment = null;
        if (HttpMethod.PUT.equals(method)) {
            equipment = equipmentService.findOneForUpdate(id);
        } else {
            equipment = equipmentService.findOne(id);
        }
        
        if (equipment == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"Equipment", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return equipment;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void EquipmentsItemEquipDocumentsThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("uploadDate_date_format", DateTimeFormat.patternForStyle("MM", LocaleContextHolder.getLocale()));
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void EquipmentsItemEquipDocumentsThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<Document>> EquipmentsItemEquipDocumentsThymeleafController.datatables(@ModelAttribute Equipment equipment, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<Document> equipDocuments = getDocumentService().findByEquipment(equipment, search, pageable);
        long totalEquipDocumentsCount = getDocumentService().countByEquipment(equipment);
        ConvertedDatatablesData<Document> data =  new ConvertedDatatablesData<Document>(equipDocuments, totalEquipDocumentsCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<Document>> EquipmentsItemEquipDocumentsThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<Document> equipDocuments = getDocumentService().findAllByIdsIn(ids, search, pageable);
        long totalEquipDocumentsCount = equipDocuments.getTotalElements();
        ConvertedDatatablesData<Document> data =  new ConvertedDatatablesData<Document>(equipDocuments, totalEquipDocumentsCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView EquipmentsItemEquipDocumentsThymeleafController.createForm(@ModelAttribute Equipment equipment, Model model) {
        populateForm(model);
        model.addAttribute("document", new Document());
        return new ModelAndView("equipments/equipDocuments/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @param equipDocumentsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromEquipDocuments", value = "/{equipDocumentsToRemove}")
    @ResponseBody
    public ResponseEntity<?> EquipmentsItemEquipDocumentsThymeleafController.removeFromEquipDocuments(@ModelAttribute Equipment equipment, @PathVariable("equipDocumentsToRemove") Long equipDocumentsToRemove) {
        getEquipmentService().removeFromEquipDocuments(equipment,Collections.singleton(equipDocumentsToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @param equipDocumentsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromEquipDocumentsBatch", value = "/batch/{equipDocumentsToRemove}")
    @ResponseBody
    public ResponseEntity<?> EquipmentsItemEquipDocumentsThymeleafController.removeFromEquipDocumentsBatch(@ModelAttribute Equipment equipment, @PathVariable("equipDocumentsToRemove") Collection<Long> equipDocumentsToRemove) {
        getEquipmentService().removeFromEquipDocuments(equipment, equipDocumentsToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param equipment
     * @param equipDocuments
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView EquipmentsItemEquipDocumentsThymeleafController.create(@ModelAttribute Equipment equipment, @RequestParam(value = "equipDocumentsIds", required = false) List<Long> equipDocuments, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (equipDocuments != null) {
            for (Iterator<Long> iterator = equipDocuments.iterator(); iterator.hasNext();) {
                if (iterator.next() == null) {
                    iterator.remove();
                }
            }
        }
        // Concurrency control
        if(!Objects.equals(version, equipment.getVersion()) && StringUtils.isEmpty(concurrencyControl)){
            populateForm(model);
            // Obtain the selected books and include them in the author that will be 
            // included in the view
            if (equipDocuments != null) {
                equipment.setEquipDocuments(new HashSet<Document>(getDocumentService().findAll(equipDocuments)));
            }else{
                equipment.setEquipDocuments(new HashSet<Document>());
            }
            // Reset the version to prevent update
             equipment.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("equipment", equipment);
            model.addAttribute("concurrency", true);
            return new ModelAndView("equipments/equipDocuments/create");
        }else if(!Objects.equals(version, equipment.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("equipment", equipment);
            model.addAttribute("concurrency", false);
            return new ModelAndView("equipments/equipDocuments/create");
        }
        getEquipmentService().setEquipDocuments(equipment,equipDocuments);
        return new ModelAndView("redirect:" + getCollectionLink().to(EquipmentsCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
