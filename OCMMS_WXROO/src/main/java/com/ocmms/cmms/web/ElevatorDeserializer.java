package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.Elevator;
import com.ocmms.cmms.service.api.ElevatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ElevatorDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Elevator.class)
public class ElevatorDeserializer extends JsonObjectDeserializer<Elevator> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ElevatorService elevatorService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param elevatorService
     * @param conversionService
     */
    @Autowired
    public ElevatorDeserializer(@Lazy ElevatorService elevatorService, ConversionService conversionService) {
        this.elevatorService = elevatorService;
        this.conversionService = conversionService;
    }
}
