package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentCategory;
import com.ocmms.cmms.service.api.EquipmentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = EquipmentCategoryDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = EquipmentCategory.class)
public class EquipmentCategoryDeserializer extends JsonObjectDeserializer<EquipmentCategory> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private EquipmentCategoryService equipmentCategoryService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param equipmentCategoryService
     * @param conversionService
     */
    @Autowired
    public EquipmentCategoryDeserializer(@Lazy EquipmentCategoryService equipmentCategoryService, ConversionService conversionService) {
        this.equipmentCategoryService = equipmentCategoryService;
        this.conversionService = conversionService;
    }
}
