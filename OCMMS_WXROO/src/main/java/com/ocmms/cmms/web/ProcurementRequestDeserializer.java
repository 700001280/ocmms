package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import com.ocmms.cmms.service.api.ProcurementRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ProcurementRequestDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ProcurementRequest.class)
public class ProcurementRequestDeserializer extends JsonObjectDeserializer<ProcurementRequest> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ProcurementRequestService procurementRequestService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param procurementRequestService
     * @param conversionService
     */
    @Autowired
    public ProcurementRequestDeserializer(@Lazy ProcurementRequestService procurementRequestService, ConversionService conversionService) {
        this.procurementRequestService = procurementRequestService;
        this.conversionService = conversionService;
    }
}
