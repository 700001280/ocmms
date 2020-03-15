package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.operation.AutonomousMaintenanceFinding;
import com.ocmms.cmms.service.api.AutonomousMaintenanceFindingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = AutonomousMaintenanceFindingDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = AutonomousMaintenanceFinding.class)
public class AutonomousMaintenanceFindingDeserializer extends JsonObjectDeserializer<AutonomousMaintenanceFinding> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AutonomousMaintenanceFindingService autonomousMaintenanceFindingService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param autonomousMaintenanceFindingService
     * @param conversionService
     */
    @Autowired
    public AutonomousMaintenanceFindingDeserializer(@Lazy AutonomousMaintenanceFindingService autonomousMaintenanceFindingService, ConversionService conversionService) {
        this.autonomousMaintenanceFindingService = autonomousMaintenanceFindingService;
        this.conversionService = conversionService;
    }
}
