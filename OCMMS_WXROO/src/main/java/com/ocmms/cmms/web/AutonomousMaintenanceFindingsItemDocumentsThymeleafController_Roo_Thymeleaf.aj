// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.pp.operation.AutonomousMaintenanceFinding;
import com.ocmms.cmms.service.api.AutonomousMaintenanceFindingService;
import com.ocmms.cmms.service.api.DocumentService;
import com.ocmms.cmms.web.AutonomousMaintenanceFindingsCollectionThymeleafController;
import com.ocmms.cmms.web.AutonomousMaintenanceFindingsCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.AutonomousMaintenanceFindingsItemDocumentsThymeleafController;
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

privileged aspect AutonomousMaintenanceFindingsItemDocumentsThymeleafController_Roo_Thymeleaf {
    
    declare @type: AutonomousMaintenanceFindingsItemDocumentsThymeleafController: @Controller;
    
    declare @type: AutonomousMaintenanceFindingsItemDocumentsThymeleafController: @RequestMapping(value = "/autonomousmaintenancefindings/{autonomousMaintenanceFinding}/documents", name = "AutonomousMaintenanceFindingsItemDocumentsThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private AutonomousMaintenanceFindingService AutonomousMaintenanceFindingsItemDocumentsThymeleafController.autonomousMaintenanceFindingService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private DocumentService AutonomousMaintenanceFindingsItemDocumentsThymeleafController.documentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource AutonomousMaintenanceFindingsItemDocumentsThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<AutonomousMaintenanceFindingsCollectionThymeleafController> AutonomousMaintenanceFindingsItemDocumentsThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService AutonomousMaintenanceFindingsItemDocumentsThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param autonomousMaintenanceFindingService
     * @param documentService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public AutonomousMaintenanceFindingsItemDocumentsThymeleafController.new(AutonomousMaintenanceFindingService autonomousMaintenanceFindingService, DocumentService documentService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setAutonomousMaintenanceFindingService(autonomousMaintenanceFindingService);
        setDocumentService(documentService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(AutonomousMaintenanceFindingsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return AutonomousMaintenanceFindingService
     */
    public AutonomousMaintenanceFindingService AutonomousMaintenanceFindingsItemDocumentsThymeleafController.getAutonomousMaintenanceFindingService() {
        return autonomousMaintenanceFindingService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param autonomousMaintenanceFindingService
     */
    public void AutonomousMaintenanceFindingsItemDocumentsThymeleafController.setAutonomousMaintenanceFindingService(AutonomousMaintenanceFindingService autonomousMaintenanceFindingService) {
        this.autonomousMaintenanceFindingService = autonomousMaintenanceFindingService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return DocumentService
     */
    public DocumentService AutonomousMaintenanceFindingsItemDocumentsThymeleafController.getDocumentService() {
        return documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentService
     */
    public void AutonomousMaintenanceFindingsItemDocumentsThymeleafController.setDocumentService(DocumentService documentService) {
        this.documentService = documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource AutonomousMaintenanceFindingsItemDocumentsThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void AutonomousMaintenanceFindingsItemDocumentsThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<AutonomousMaintenanceFindingsCollectionThymeleafController> AutonomousMaintenanceFindingsItemDocumentsThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void AutonomousMaintenanceFindingsItemDocumentsThymeleafController.setCollectionLink(MethodLinkBuilderFactory<AutonomousMaintenanceFindingsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService AutonomousMaintenanceFindingsItemDocumentsThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void AutonomousMaintenanceFindingsItemDocumentsThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return AutonomousMaintenanceFinding
     */
    @ModelAttribute
    public AutonomousMaintenanceFinding AutonomousMaintenanceFindingsItemDocumentsThymeleafController.getAutonomousMaintenanceFinding(@PathVariable("autonomousMaintenanceFinding") Long id, Locale locale, HttpMethod method) {
        AutonomousMaintenanceFinding autonomousMaintenanceFinding = null;
        if (HttpMethod.PUT.equals(method)) {
            autonomousMaintenanceFinding = autonomousMaintenanceFindingService.findOneForUpdate(id);
        } else {
            autonomousMaintenanceFinding = autonomousMaintenanceFindingService.findOne(id);
        }
        
        if (autonomousMaintenanceFinding == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"AutonomousMaintenanceFinding", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return autonomousMaintenanceFinding;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void AutonomousMaintenanceFindingsItemDocumentsThymeleafController.populateFormats(Model model) {
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
    public void AutonomousMaintenanceFindingsItemDocumentsThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param autonomousMaintenanceFinding
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<Document>> AutonomousMaintenanceFindingsItemDocumentsThymeleafController.datatables(@ModelAttribute AutonomousMaintenanceFinding autonomousMaintenanceFinding, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<Document> documents = getDocumentService().findByAutonomousMaintenanceFinding(autonomousMaintenanceFinding, search, pageable);
        long totalDocumentsCount = getDocumentService().countByAutonomousMaintenanceFinding(autonomousMaintenanceFinding);
        ConvertedDatatablesData<Document> data =  new ConvertedDatatablesData<Document>(documents, totalDocumentsCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<Document>> AutonomousMaintenanceFindingsItemDocumentsThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<Document> documents = getDocumentService().findAllByIdsIn(ids, search, pageable);
        long totalDocumentsCount = documents.getTotalElements();
        ConvertedDatatablesData<Document> data =  new ConvertedDatatablesData<Document>(documents, totalDocumentsCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param autonomousMaintenanceFinding
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView AutonomousMaintenanceFindingsItemDocumentsThymeleafController.createForm(@ModelAttribute AutonomousMaintenanceFinding autonomousMaintenanceFinding, Model model) {
        populateForm(model);
        model.addAttribute("document", new Document());
        return new ModelAndView("autonomousmaintenancefindings/documents/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param autonomousMaintenanceFinding
     * @param documentsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromDocuments", value = "/{documentsToRemove}")
    @ResponseBody
    public ResponseEntity<?> AutonomousMaintenanceFindingsItemDocumentsThymeleafController.removeFromDocuments(@ModelAttribute AutonomousMaintenanceFinding autonomousMaintenanceFinding, @PathVariable("documentsToRemove") Long documentsToRemove) {
        getAutonomousMaintenanceFindingService().removeFromDocuments(autonomousMaintenanceFinding,Collections.singleton(documentsToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param autonomousMaintenanceFinding
     * @param documentsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromDocumentsBatch", value = "/batch/{documentsToRemove}")
    @ResponseBody
    public ResponseEntity<?> AutonomousMaintenanceFindingsItemDocumentsThymeleafController.removeFromDocumentsBatch(@ModelAttribute AutonomousMaintenanceFinding autonomousMaintenanceFinding, @PathVariable("documentsToRemove") Collection<Long> documentsToRemove) {
        getAutonomousMaintenanceFindingService().removeFromDocuments(autonomousMaintenanceFinding, documentsToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param autonomousMaintenanceFinding
     * @param documents
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView AutonomousMaintenanceFindingsItemDocumentsThymeleafController.create(@ModelAttribute AutonomousMaintenanceFinding autonomousMaintenanceFinding, @RequestParam(value = "documentsIds", required = false) List<Long> documents, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (documents != null) {
            for (Iterator<Long> iterator = documents.iterator(); iterator.hasNext();) {
                if (iterator.next() == null) {
                    iterator.remove();
                }
            }
        }
        // Concurrency control
        if(!Objects.equals(version, autonomousMaintenanceFinding.getVersion()) && StringUtils.isEmpty(concurrencyControl)){
            populateForm(model);
            // Obtain the selected books and include them in the author that will be 
            // included in the view
            if (documents != null) {
                autonomousMaintenanceFinding.setDocuments(new HashSet<Document>(getDocumentService().findAll(documents)));
            }else{
                autonomousMaintenanceFinding.setDocuments(new HashSet<Document>());
            }
            // Reset the version to prevent update
             autonomousMaintenanceFinding.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("autonomousMaintenanceFinding", autonomousMaintenanceFinding);
            model.addAttribute("concurrency", true);
            return new ModelAndView("autonomousmaintenancefindings/documents/create");
        }else if(!Objects.equals(version, autonomousMaintenanceFinding.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("autonomousMaintenanceFinding", autonomousMaintenanceFinding);
            model.addAttribute("concurrency", false);
            return new ModelAndView("autonomousmaintenancefindings/documents/create");
        }
        getAutonomousMaintenanceFindingService().setDocuments(autonomousMaintenanceFinding,documents);
        return new ModelAndView("redirect:" + getCollectionLink().to(AutonomousMaintenanceFindingsCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
