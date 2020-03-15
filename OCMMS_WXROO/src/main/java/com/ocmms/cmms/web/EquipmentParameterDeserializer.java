package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentParameter;
import com.ocmms.cmms.service.api.EquipmentParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = EquipmentParameterDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = EquipmentParameter.class)
public class EquipmentParameterDeserializer extends JsonObjectDeserializer<EquipmentParameter> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private EquipmentParameterService equipmentParameterService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param equipmentParameterService
     * @param conversionService
     */
    @Autowired
    public EquipmentParameterDeserializer(@Lazy EquipmentParameterService equipmentParameterService, ConversionService conversionService) {
        this.equipmentParameterService = equipmentParameterService;
        this.conversionService = conversionService;
    }
}
