package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatus;
import com.ocmms.cmms.service.api.EquipmentStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = EquipmentStatusDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = EquipmentStatus.class)
public class EquipmentStatusDeserializer extends JsonObjectDeserializer<EquipmentStatus> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private EquipmentStatusService equipmentStatusService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param equipmentStatusService
     * @param conversionService
     */
    @Autowired
    public EquipmentStatusDeserializer(@Lazy EquipmentStatusService equipmentStatusService, ConversionService conversionService) {
        this.equipmentStatusService = equipmentStatusService;
        this.conversionService = conversionService;
    }
}
