package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import com.ocmms.cmms.service.api.HierarchyWorkCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = HierarchyWorkCenterDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = HierarchyWorkCenter.class)
public class HierarchyWorkCenterDeserializer extends JsonObjectDeserializer<HierarchyWorkCenter> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private HierarchyWorkCenterService hierarchyWorkCenterService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param hierarchyWorkCenterService
     * @param conversionService
     */
    @Autowired
    public HierarchyWorkCenterDeserializer(@Lazy HierarchyWorkCenterService hierarchyWorkCenterService, ConversionService conversionService) {
        this.hierarchyWorkCenterService = hierarchyWorkCenterService;
        this.conversionService = conversionService;
    }
}
