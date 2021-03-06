// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.pm.routine.PartReplaceRecord;
import com.ocmms.cmms.service.api.ImageDocumentService;
import com.ocmms.cmms.service.api.PartReplaceRecordService;
import com.ocmms.cmms.web.PartReplaceRecordsCollectionThymeleafController;
import com.ocmms.cmms.web.PartReplaceRecordsCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.PartReplaceRecordsItemImagesThymeleafController;
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

privileged aspect PartReplaceRecordsItemImagesThymeleafController_Roo_Thymeleaf {
    
    declare @type: PartReplaceRecordsItemImagesThymeleafController: @Controller;
    
    declare @type: PartReplaceRecordsItemImagesThymeleafController: @RequestMapping(value = "/partreplacerecords/{partReplaceRecord}/images", name = "PartReplaceRecordsItemImagesThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private PartReplaceRecordService PartReplaceRecordsItemImagesThymeleafController.partReplaceRecordService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ImageDocumentService PartReplaceRecordsItemImagesThymeleafController.imageDocumentService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource PartReplaceRecordsItemImagesThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<PartReplaceRecordsCollectionThymeleafController> PartReplaceRecordsItemImagesThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService PartReplaceRecordsItemImagesThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param partReplaceRecordService
     * @param imageDocumentService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public PartReplaceRecordsItemImagesThymeleafController.new(PartReplaceRecordService partReplaceRecordService, ImageDocumentService imageDocumentService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setPartReplaceRecordService(partReplaceRecordService);
        setImageDocumentService(imageDocumentService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(PartReplaceRecordsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return PartReplaceRecordService
     */
    public PartReplaceRecordService PartReplaceRecordsItemImagesThymeleafController.getPartReplaceRecordService() {
        return partReplaceRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partReplaceRecordService
     */
    public void PartReplaceRecordsItemImagesThymeleafController.setPartReplaceRecordService(PartReplaceRecordService partReplaceRecordService) {
        this.partReplaceRecordService = partReplaceRecordService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ImageDocumentService
     */
    public ImageDocumentService PartReplaceRecordsItemImagesThymeleafController.getImageDocumentService() {
        return imageDocumentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param imageDocumentService
     */
    public void PartReplaceRecordsItemImagesThymeleafController.setImageDocumentService(ImageDocumentService imageDocumentService) {
        this.imageDocumentService = imageDocumentService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource PartReplaceRecordsItemImagesThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void PartReplaceRecordsItemImagesThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<PartReplaceRecordsCollectionThymeleafController> PartReplaceRecordsItemImagesThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void PartReplaceRecordsItemImagesThymeleafController.setCollectionLink(MethodLinkBuilderFactory<PartReplaceRecordsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService PartReplaceRecordsItemImagesThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void PartReplaceRecordsItemImagesThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return PartReplaceRecord
     */
    @ModelAttribute
    public PartReplaceRecord PartReplaceRecordsItemImagesThymeleafController.getPartReplaceRecord(@PathVariable("partReplaceRecord") Long id, Locale locale, HttpMethod method) {
        PartReplaceRecord partReplaceRecord = null;
        if (HttpMethod.PUT.equals(method)) {
            partReplaceRecord = partReplaceRecordService.findOneForUpdate(id);
        } else {
            partReplaceRecord = partReplaceRecordService.findOne(id);
        }
        
        if (partReplaceRecord == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"PartReplaceRecord", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return partReplaceRecord;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void PartReplaceRecordsItemImagesThymeleafController.populateFormats(Model model) {
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
    public void PartReplaceRecordsItemImagesThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partReplaceRecord
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<ImageDocument>> PartReplaceRecordsItemImagesThymeleafController.datatables(@ModelAttribute PartReplaceRecord partReplaceRecord, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<ImageDocument> images = getImageDocumentService().findByPartReplaceRecord(partReplaceRecord, search, pageable);
        long totalImagesCount = getImageDocumentService().countByPartReplaceRecord(partReplaceRecord);
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
    public ResponseEntity<ConvertedDatatablesData<ImageDocument>> PartReplaceRecordsItemImagesThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<ImageDocument> images = getImageDocumentService().findAllByIdsIn(ids, search, pageable);
        long totalImagesCount = images.getTotalElements();
        ConvertedDatatablesData<ImageDocument> data =  new ConvertedDatatablesData<ImageDocument>(images, totalImagesCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partReplaceRecord
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView PartReplaceRecordsItemImagesThymeleafController.createForm(@ModelAttribute PartReplaceRecord partReplaceRecord, Model model) {
        populateForm(model);
        model.addAttribute("imageDocument", new ImageDocument());
        return new ModelAndView("partreplacerecords/images/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partReplaceRecord
     * @param imagesToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromImages", value = "/{imagesToRemove}")
    @ResponseBody
    public ResponseEntity<?> PartReplaceRecordsItemImagesThymeleafController.removeFromImages(@ModelAttribute PartReplaceRecord partReplaceRecord, @PathVariable("imagesToRemove") Long imagesToRemove) {
        getPartReplaceRecordService().removeFromImages(partReplaceRecord,Collections.singleton(imagesToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partReplaceRecord
     * @param imagesToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromImagesBatch", value = "/batch/{imagesToRemove}")
    @ResponseBody
    public ResponseEntity<?> PartReplaceRecordsItemImagesThymeleafController.removeFromImagesBatch(@ModelAttribute PartReplaceRecord partReplaceRecord, @PathVariable("imagesToRemove") Collection<Long> imagesToRemove) {
        getPartReplaceRecordService().removeFromImages(partReplaceRecord, imagesToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param partReplaceRecord
     * @param images
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView PartReplaceRecordsItemImagesThymeleafController.create(@ModelAttribute PartReplaceRecord partReplaceRecord, @RequestParam(value = "imagesIds", required = false) List<Long> images, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (images != null) {
            for (Iterator<Long> iterator = images.iterator(); iterator.hasNext();) {
                if (iterator.next() == null) {
                    iterator.remove();
                }
            }
        }
        // Concurrency control
        if(!Objects.equals(version, partReplaceRecord.getVersion()) && StringUtils.isEmpty(concurrencyControl)){
            populateForm(model);
            // Obtain the selected books and include them in the author that will be 
            // included in the view
            if (images != null) {
                partReplaceRecord.setImages(new HashSet<ImageDocument>(getImageDocumentService().findAll(images)));
            }else{
                partReplaceRecord.setImages(new HashSet<ImageDocument>());
            }
            // Reset the version to prevent update
             partReplaceRecord.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("partReplaceRecord", partReplaceRecord);
            model.addAttribute("concurrency", true);
            return new ModelAndView("partreplacerecords/images/create");
        }else if(!Objects.equals(version, partReplaceRecord.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("partReplaceRecord", partReplaceRecord);
            model.addAttribute("concurrency", false);
            return new ModelAndView("partreplacerecords/images/create");
        }
        getPartReplaceRecordService().setImages(partReplaceRecord,images);
        return new ModelAndView("redirect:" + getCollectionLink().to(PartReplaceRecordsCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
