// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.service.api.ImageDocumentService;
import com.ocmms.cmms.service.api.ProcurementOrderService;
import com.ocmms.cmms.web.ProcurementOrdersCollectionThymeleafController;
import com.ocmms.cmms.web.ProcurementOrdersCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.ProcurementOrdersItemImagesThymeleafController;
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

privileged aspect ProcurementOrdersItemImagesThymeleafController_Roo_Thymeleaf {
    
    declare @type: ProcurementOrdersItemImagesThymeleafController: @Controller;
    
    declare @type: ProcurementOrdersItemImagesThymeleafController: @RequestMapping(value = "/procurementorders/{procurementOrder}/images", name = "ProcurementOrdersItemImagesThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ProcurementOrderService ProcurementOrdersItemImagesThymeleafController.procurementOrderService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ImageDocumentService ProcurementOrdersItemImagesThymeleafController.imageDocumentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource ProcurementOrdersItemImagesThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<ProcurementOrdersCollectionThymeleafController> ProcurementOrdersItemImagesThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService ProcurementOrdersItemImagesThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param procurementOrderService
     * @param imageDocumentService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public ProcurementOrdersItemImagesThymeleafController.new(ProcurementOrderService procurementOrderService, ImageDocumentService imageDocumentService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setProcurementOrderService(procurementOrderService);
        setImageDocumentService(imageDocumentService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(ProcurementOrdersCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return ProcurementOrderService
     */
    public ProcurementOrderService ProcurementOrdersItemImagesThymeleafController.getProcurementOrderService() {
        return procurementOrderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrderService
     */
    public void ProcurementOrdersItemImagesThymeleafController.setProcurementOrderService(ProcurementOrderService procurementOrderService) {
        this.procurementOrderService = procurementOrderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ImageDocumentService
     */
    public ImageDocumentService ProcurementOrdersItemImagesThymeleafController.getImageDocumentService() {
        return imageDocumentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imageDocumentService
     */
    public void ProcurementOrdersItemImagesThymeleafController.setImageDocumentService(ImageDocumentService imageDocumentService) {
        this.imageDocumentService = imageDocumentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource ProcurementOrdersItemImagesThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void ProcurementOrdersItemImagesThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<ProcurementOrdersCollectionThymeleafController> ProcurementOrdersItemImagesThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void ProcurementOrdersItemImagesThymeleafController.setCollectionLink(MethodLinkBuilderFactory<ProcurementOrdersCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService ProcurementOrdersItemImagesThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void ProcurementOrdersItemImagesThymeleafController.setConversionService(ConversionService conversionService) {
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
    public ProcurementOrder ProcurementOrdersItemImagesThymeleafController.getProcurementOrder(@PathVariable("procurementOrder") Long id, Locale locale, HttpMethod method) {
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
    public void ProcurementOrdersItemImagesThymeleafController.populateFormats(Model model) {
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
    public void ProcurementOrdersItemImagesThymeleafController.populateForm(Model model) {
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
    public ResponseEntity<ConvertedDatatablesData<ImageDocument>> ProcurementOrdersItemImagesThymeleafController.datatables(@ModelAttribute ProcurementOrder procurementOrder, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<ImageDocument> images = getImageDocumentService().findByProcurementOrder(procurementOrder, search, pageable);
        long totalImagesCount = getImageDocumentService().countByProcurementOrder(procurementOrder);
        ConvertedDatatablesData<ImageDocument> data =  new ConvertedDatatablesData<ImageDocument>(images, totalImagesCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<ImageDocument>> ProcurementOrdersItemImagesThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<ImageDocument> images = getImageDocumentService().findAllByIdsIn(ids, search, pageable);
        long totalImagesCount = images.getTotalElements();
        ConvertedDatatablesData<ImageDocument> data =  new ConvertedDatatablesData<ImageDocument>(images, totalImagesCount, draw, getConversionService(), datatablesColumns);
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
    public ModelAndView ProcurementOrdersItemImagesThymeleafController.createForm(@ModelAttribute ProcurementOrder procurementOrder, Model model) {
        populateForm(model);
        model.addAttribute("imageDocument", new ImageDocument());
        return new ModelAndView("procurementorders/images/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param imagesToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromImages", value = "/{imagesToRemove}")
    @ResponseBody
    public ResponseEntity<?> ProcurementOrdersItemImagesThymeleafController.removeFromImages(@ModelAttribute ProcurementOrder procurementOrder, @PathVariable("imagesToRemove") Long imagesToRemove) {
        getProcurementOrderService().removeFromImages(procurementOrder,Collections.singleton(imagesToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param imagesToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromImagesBatch", value = "/batch/{imagesToRemove}")
    @ResponseBody
    public ResponseEntity<?> ProcurementOrdersItemImagesThymeleafController.removeFromImagesBatch(@ModelAttribute ProcurementOrder procurementOrder, @PathVariable("imagesToRemove") Collection<Long> imagesToRemove) {
        getProcurementOrderService().removeFromImages(procurementOrder, imagesToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param procurementOrder
     * @param images
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView ProcurementOrdersItemImagesThymeleafController.create(@ModelAttribute ProcurementOrder procurementOrder, @RequestParam(value = "imagesIds", required = false) List<Long> images, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (images != null) {
            for (Iterator<Long> iterator = images.iterator(); iterator.hasNext();) {
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
            if (images != null) {
                procurementOrder.setImages(new HashSet<ImageDocument>(getImageDocumentService().findAll(images)));
            }else{
                procurementOrder.setImages(new HashSet<ImageDocument>());
            }
            // Reset the version to prevent update
             procurementOrder.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("procurementOrder", procurementOrder);
            model.addAttribute("concurrency", true);
            return new ModelAndView("procurementorders/images/create");
        }else if(!Objects.equals(version, procurementOrder.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("procurementOrder", procurementOrder);
            model.addAttribute("concurrency", false);
            return new ModelAndView("procurementorders/images/create");
        }
        getProcurementOrderService().setImages(procurementOrder,images);
        return new ModelAndView("redirect:" + getCollectionLink().to(ProcurementOrdersCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
