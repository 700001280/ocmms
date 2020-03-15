package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureVessel;
import com.ocmms.cmms.service.api.PressureVesselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PressureVesselDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PressureVessel.class)
public class PressureVesselDeserializer extends JsonObjectDeserializer<PressureVessel> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PressureVesselService pressureVesselService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param pressureVesselService
     * @param conversionService
     */
    @Autowired
    public PressureVesselDeserializer(@Lazy PressureVesselService pressureVesselService, ConversionService conversionService) {
        this.pressureVesselService = pressureVesselService;
        this.conversionService = conversionService;
    }
}
