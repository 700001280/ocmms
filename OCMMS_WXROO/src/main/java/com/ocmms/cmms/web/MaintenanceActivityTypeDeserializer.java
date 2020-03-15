package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;
import com.ocmms.cmms.service.api.MaintenanceActivityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MaintenanceActivityTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MaintenanceActivityType.class)
public class MaintenanceActivityTypeDeserializer extends JsonObjectDeserializer<MaintenanceActivityType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MaintenanceActivityTypeService maintenanceActivityTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param maintenanceActivityTypeService
     * @param conversionService
     */
    @Autowired
    public MaintenanceActivityTypeDeserializer(@Lazy MaintenanceActivityTypeService maintenanceActivityTypeService, ConversionService conversionService) {
        this.maintenanceActivityTypeService = maintenanceActivityTypeService;
        this.conversionService = conversionService;
    }
}
