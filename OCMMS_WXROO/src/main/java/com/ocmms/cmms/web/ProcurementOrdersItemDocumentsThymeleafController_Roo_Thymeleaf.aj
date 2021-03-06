// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.service.api.DocumentService;
import com.ocmms.cmms.service.api.ProcurementOrderService;
import com.ocmms.cmms.web.ProcurementOrdersCollectionThymeleafController;
import com.ocmms.cmms.web.ProcurementOrdersCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.ProcurementOrdersItemDocumentsThymeleafController;
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

privileged aspect ProcurementOrdersItemDocumentsThymeleafController_Roo_Thymeleaf {
    
    declare @type: ProcurementOrdersItemDocumentsThymeleafController: @Controller;
    
    declare @type: ProcurementOrdersItemDocumentsThymeleafController: @RequestMapping(value = "/procurementorders/{procurementOrder}/documents", name = "ProcurementOrdersItemDocumentsThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ProcurementOrderService ProcurementOrdersItemDocumentsThymeleafController.procurementOrderService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private DocumentService ProcurementOrdersItemDocumentsThymeleafController.documentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource ProcurementOrdersItemDocumentsThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<ProcurementOrdersCollectionThymeleafController> ProcurementOrdersItemDocumentsThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService ProcurementOrdersItemDocumentsThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param procurementOrderService
     * @param documentService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public ProcurementOrdersItemDocumentsThymeleafController.new(ProcurementOrderService procurementOrderService, DocumentService documentService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setProcurementOrderService(procurementOrderService);
        setDocumentService(documentService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(ProcurementOrdersCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return ProcurementOrderService
     */
    public ProcurementOrderService ProcurementOrdersItemDocumentsThymeleafController.getProcurementOrderService() {
        return procurementOrderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrderService
     */
    public void ProcurementOrdersItemDocumentsThymeleafController.setProcurementOrderService(ProcurementOrderService procurementOrderService) {
        this.procurementOrderService = procurementOrderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return DocumentService
     */
    public DocumentService ProcurementOrdersItemDocumentsThymeleafController.getDocumentService() {
        return documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param documentService
     */
    public void ProcurementOrdersItemDocumentsThymeleafController.setDocumentService(DocumentService documentService) {
        this.documentService = documentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource ProcurementOrdersItemDocumentsThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void ProcurementOrdersItemDocumentsThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<ProcurementOrdersCollectionThymeleafController> ProcurementOrdersItemDocumentsThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void ProcurementOrdersItemDocumentsThymeleafController.setCollectionLink(MethodLinkBuilderFactory<ProcurementOrdersCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService ProcurementOrdersItemDocumentsThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void ProcurementOrdersItemDocumentsThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return ProcurementOrder
     */
    @ModelAttribute
    public ProcurementOrder ProcurementOrdersItemDocumentsThymeleafController.getProcurementOrder(@PathVariable("procurementOrder") Long id, Locale locale, HttpMethod method) {
        ProcurementOrder procurementOrder = null;
        if (HttpMethod.PUT.equals(method)) {
            procurementOrder = procurementOrderService.findOneForUpdate(id);
        } else {
            procurementOrder = procurementOrderService.findOne(id);
        }
        
        if (procurementOrder == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"ProcurementOrder", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return procurementOrder;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void ProcurementOrdersItemDocumentsThymeleafController.populateFormats(Model model) {
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
    public void ProcurementOrdersItemDocumentsThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<Document>> ProcurementOrdersItemDocumentsThymeleafController.datatables(@ModelAttribute ProcurementOrder procurementOrder, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<Document> documents = getDocumentService().findByProcurementOrder(procurementOrder, search, pageable);
        long totalDocumentsCount = getDocumentService().countByProcurementOrder(procurementOrder);
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
    public ResponseEntity<ConvertedDatatablesData<Document>> ProcurementOrdersItemDocumentsThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<Document> documents = getDocumentService().findAllByIdsIn(ids, search, pageable);
        long totalDocumentsCount = documents.getTotalElements();
        ConvertedDatatablesData<Document> data =  new ConvertedDatatablesData<Document>(documents, totalDocumentsCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView ProcurementOrdersItemDocumentsThymeleafController.createForm(@ModelAttribute ProcurementOrder procurementOrder, Model model) {
        populateForm(model);
        model.addAttribute("document", new Document());
        return new ModelAndView("procurementorders/documents/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param documentsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromDocuments", value = "/{documentsToRemove}")
    @ResponseBody
    public ResponseEntity<?> ProcurementOrdersItemDocumentsThymeleafController.removeFromDocuments(@ModelAttribute ProcurementOrder procurementOrder, @PathVariable("documentsToRemove") Long documentsToRemove) {
        getProcurementOrderService().removeFromDocuments(procurementOrder,Collections.singleton(documentsToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param documentsToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromDocumentsBatch", value = "/batch/{documentsToRemove}")
    @ResponseBody
    public ResponseEntity<?> ProcurementOrdersItemDocumentsThymeleafController.removeFromDocumentsBatch(@ModelAttribute ProcurementOrder procurementOrder, @PathVariable("documentsToRemove") Collection<Long> documentsToRemove) {
        getProcurementOrderService().removeFromDocuments(procurementOrder, documentsToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param documents
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView ProcurementOrdersItemDocumentsThymeleafController.create(@ModelAttribute ProcurementOrder procurementOrder, @RequestParam(value = "documentsIds", required = false) List<Long> documents, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (documents != null) {
            for (Iterator<Long> iterator = documents.iterator(); iterator.hasNext();) {
                if (iterator.next() == null) {
                    iterator.remove();
                }
            }
        }
        // Concurrency control
        if(!Objects.equals(version, procurementOrder.getVersion()) && StringUtils.isEmpty(concurrencyControl)){
            populateForm(model);
            // Obtain the selected books and include them in the author that will be 
            // included in the view
            if (documents != null) {
                procurementOrder.setDocuments(new HashSet<Document>(getDocumentService().findAll(documents)));
            }else{
                procurementOrder.setDocuments(new HashSet<Document>());
            }
            // Reset the version to prevent update
             procurementOrder.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("procurementOrder", procurementOrder);
            model.addAttribute("concurrency", true);
            return new ModelAndView("procurementorders/documents/create");
        }else if(!Objects.equals(version, procurementOrder.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("procurementOrder", procurementOrder);
            model.addAttribute("concurrency", false);
            return new ModelAndView("procurementorders/documents/create");
        }
        getProcurementOrderService().setDocuments(procurementOrder,documents);
        return new ModelAndView("redirect:" + getCollectionLink().to(ProcurementOrdersCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
