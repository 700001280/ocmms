package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringPoint;
import com.ocmms.cmms.service.api.MeasuringPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MeasuringPointDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MeasuringPoint.class)
public class MeasuringPointDeserializer extends JsonObjectDeserializer<MeasuringPoint> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MeasuringPointService measuringPointService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param measuringPointService
     * @param conversionService
     */
    @Autowired
    public MeasuringPointDeserializer(@Lazy MeasuringPointService measuringPointService, ConversionService conversionService) {
        this.measuringPointService = measuringPointService;
        this.conversionService = conversionService;
    }
}
