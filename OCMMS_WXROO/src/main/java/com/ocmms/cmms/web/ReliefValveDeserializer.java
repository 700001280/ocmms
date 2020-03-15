package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.ReliefValve;
import com.ocmms.cmms.service.api.ReliefValveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ReliefValveDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ReliefValve.class)
public class ReliefValveDeserializer extends JsonObjectDeserializer<ReliefValve> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ReliefValveService reliefValveService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param reliefValveService
     * @param conversionService
     */
    @Autowired
    public ReliefValveDeserializer(@Lazy ReliefValveService reliefValveService, ConversionService conversionService) {
        this.reliefValveService = reliefValveService;
        this.conversionService = conversionService;
    }
}
