package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.service.api.ProcurementOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ProcurementOrderDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ProcurementOrder.class)
public class ProcurementOrderDeserializer extends JsonObjectDeserializer<ProcurementOrder> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ProcurementOrderService procurementOrderService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param procurementOrderService
     * @param conversionService
     */
    @Autowired
    public ProcurementOrderDeserializer(@Lazy ProcurementOrderService procurementOrderService, ConversionService conversionService) {
        this.procurementOrderService = procurementOrderService;
        this.conversionService = conversionService;
    }
}
