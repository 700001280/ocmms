package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentLubrication;
import com.ocmms.cmms.service.api.EquipmentLubricationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = EquipmentLubricationDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = EquipmentLubrication.class)
public class EquipmentLubricationDeserializer extends JsonObjectDeserializer<EquipmentLubrication> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private EquipmentLubricationService equipmentLubricationService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param equipmentLubricationService
     * @param conversionService
     */
    @Autowired
    public EquipmentLubricationDeserializer(@Lazy EquipmentLubricationService equipmentLubricationService, ConversionService conversionService) {
        this.equipmentLubricationService = equipmentLubricationService;
        this.conversionService = conversionService;
    }
}
