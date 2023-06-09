// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.web;

import com.ocmms.cmms.model.common.Province;
import com.ocmms.cmms.model.common.Region;
import com.ocmms.cmms.service.api.ProvinceService;
import com.ocmms.cmms.service.api.RegionService;
import com.ocmms.cmms.web.RegionsCollectionThymeleafController;
import com.ocmms.cmms.web.RegionsCollectionThymeleafLinkFactory;
import com.ocmms.cmms.web.RegionsItemProvincesThymeleafController;
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

privileged aspect RegionsItemProvincesThymeleafController_Roo_Thymeleaf {
    
    declare @type: RegionsItemProvincesThymeleafController: @Controller;
    
    declare @type: RegionsItemProvincesThymeleafController: @RequestMapping(value = "/regions/{region}/provinces", name = "RegionsItemProvincesThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private RegionService RegionsItemProvincesThymeleafController.regionService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ProvinceService RegionsItemProvincesThymeleafController.provinceService;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource RegionsItemProvincesThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<RegionsCollectionThymeleafController> RegionsItemProvincesThymeleafController.collectionLink;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private ConversionService RegionsItemProvincesThymeleafController.conversionService;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param regionService
     * @param provinceService
     * @param conversionService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public RegionsItemProvincesThymeleafController.new(RegionService regionService, ProvinceService provinceService, ConversionService conversionService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setRegionService(regionService);
        setProvinceService(provinceService);
        setConversionService(conversionService);
        setMessageSource(messageSource);
        setCollectionLink(linkBuilder.of(RegionsCollectionThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return RegionService
     */
    public RegionService RegionsItemProvincesThymeleafController.getRegionService() {
        return regionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param regionService
     */
    public void RegionsItemProvincesThymeleafController.setRegionService(RegionService regionService) {
        this.regionService = regionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ProvinceService
     */
    public ProvinceService RegionsItemProvincesThymeleafController.getProvinceService() {
        return provinceService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param provinceService
     */
    public void RegionsItemProvincesThymeleafController.setProvinceService(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource RegionsItemProvincesThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void RegionsItemProvincesThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<RegionsCollectionThymeleafController> RegionsItemProvincesThymeleafController.getCollectionLink() {
        return collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param collectionLink
     */
    public void RegionsItemProvincesThymeleafController.setCollectionLink(MethodLinkBuilderFactory<RegionsCollectionThymeleafController> collectionLink) {
        this.collectionLink = collectionLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService RegionsItemProvincesThymeleafController.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void RegionsItemProvincesThymeleafController.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return Region
     */
    @ModelAttribute
    public Region RegionsItemProvincesThymeleafController.getRegion(@PathVariable("region") Long id, Locale locale, HttpMethod method) {
        Region region = null;
        if (HttpMethod.PUT.equals(method)) {
            region = regionService.findOneForUpdate(id);
        } else {
            region = regionService.findOne(id);
        }
        
        if (region == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"Region", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return region;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void RegionsItemProvincesThymeleafController.populateFormats(Model model) {
        model.addAttribute("application_locale", LocaleContextHolder.getLocale().getLanguage());
        model.addAttribute("createdDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
        model.addAttribute("lastModifiedDate_date_format", DateTimeFormat.patternForStyle("M-", LocaleContextHolder.getLocale()));
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param model
     */
    public void RegionsItemProvincesThymeleafController.populateForm(Model model) {
        populateFormats(model);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @param datatablesColumns
     * @param search
     * @param pageable
     * @param draw
     * @return ResponseEntity
     */
    @GetMapping(name = "datatables", produces = Datatables.MEDIA_TYPE, value = "/dt")
    @ResponseBody
    public ResponseEntity<ConvertedDatatablesData<Province>> RegionsItemProvincesThymeleafController.datatables(@ModelAttribute Region region, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<Province> provinces = getProvinceService().findByRegion(region, search, pageable);
        long totalProvincesCount = getProvinceService().countByRegion(region);
        ConvertedDatatablesData<Province> data =  new ConvertedDatatablesData<Province>(provinces, totalProvincesCount, draw, getConversionService(), datatablesColumns);
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
    public ResponseEntity<ConvertedDatatablesData<Province>> RegionsItemProvincesThymeleafController.datatablesByIdsIn(@RequestParam("ids") List<Long> ids, DatatablesColumns datatablesColumns, GlobalSearch search, DatatablesPageable pageable, @RequestParam("draw") Integer draw) {
        
        Page<Province> provinces = getProvinceService().findAllByIdsIn(ids, search, pageable);
        long totalProvincesCount = provinces.getTotalElements();
        ConvertedDatatablesData<Province> data =  new ConvertedDatatablesData<Province>(provinces, totalProvincesCount, draw, getConversionService(), datatablesColumns);
        return ResponseEntity.ok(data);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/create-form", name = "createForm")
    public ModelAndView RegionsItemProvincesThymeleafController.createForm(@ModelAttribute Region region, Model model) {
        populateForm(model);
        model.addAttribute("province", new Province());
        return new ModelAndView("regions/provinces/create");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @param provincesToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromProvinces", value = "/{provincesToRemove}")
    @ResponseBody
    public ResponseEntity<?> RegionsItemProvincesThymeleafController.removeFromProvinces(@ModelAttribute Region region, @PathVariable("provincesToRemove") Long provincesToRemove) {
        getRegionService().removeFromProvinces(region,Collections.singleton(provincesToRemove));
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @param provincesToRemove
     * @return ResponseEntity
     */
    @DeleteMapping(name = "removeFromProvincesBatch", value = "/batch/{provincesToRemove}")
    @ResponseBody
    public ResponseEntity<?> RegionsItemProvincesThymeleafController.removeFromProvincesBatch(@ModelAttribute Region region, @PathVariable("provincesToRemove") Collection<Long> provincesToRemove) {
        getRegionService().removeFromProvinces(region, provincesToRemove);
        return ResponseEntity.ok().build();
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @param provinces
     * @param version
     * @param concurrencyControl
     * @param model
     * @return ModelAndView
     */
    @PostMapping(name = "create")
    public ModelAndView RegionsItemProvincesThymeleafController.create(@ModelAttribute Region region, @RequestParam(value = "provincesIds", required = false) List<Long> provinces, @RequestParam("parentVersion") Long version, @RequestParam(value = "concurrency", required = false, defaultValue = "") String concurrencyControl, Model model) {
        // Remove empty values
        if (provinces != null) {
            for (Iterator<Long> iterator = provinces.iterator(); iterator.hasNext();) {
                if (iterator.next() == null) {
                    iterator.remove();
                }
            }
        }
        // Concurrency control
        if(!Objects.equals(version, region.getVersion()) && StringUtils.isEmpty(concurrencyControl)){
            populateForm(model);
            // Obtain the selected books and include them in the author that will be 
            // included in the view
            if (provinces != null) {
                region.setProvinces(new HashSet<Province>(getProvinceService().findAll(provinces)));
            }else{
                region.setProvinces(new HashSet<Province>());
            }
            // Reset the version to prevent update
             region.setVersion(version);
            // Include the updated element in the model
            model.addAttribute("region", region);
            model.addAttribute("concurrency", true);
            return new ModelAndView("regions/provinces/create");
        }else if(!Objects.equals(version, region.getVersion()) && "discard".equals(concurrencyControl)){
            populateForm(model);
            // Provide the original element from the Database
            model.addAttribute("region", region);
            model.addAttribute("concurrency", false);
            return new ModelAndView("regions/provinces/create");
        }
        getRegionService().setProvinces(region,provinces);
        return new ModelAndView("redirect:" + getCollectionLink().to(RegionsCollectionThymeleafLinkFactory.LIST).toUriString());
    }
    
}
