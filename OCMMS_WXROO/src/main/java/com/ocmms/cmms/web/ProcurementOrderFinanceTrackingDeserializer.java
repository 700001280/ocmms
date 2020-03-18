package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrderFinanceTracking;
import com.ocmms.cmms.service.api.ProcurementOrderFinanceTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ProcurementOrderFinanceTrackingDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ProcurementOrderFinanceTracking.class)
public class ProcurementOrderFinanceTrackingDeserializer extends JsonObjectDeserializer<ProcurementOrderFinanceTracking> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ProcurementOrderFinanceTrackingService procurementOrderFinanceTrackingService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param procurementOrderFinanceTrackingService
     * @param conversionService
     */
    @Autowired
    public ProcurementOrderFinanceTrackingDeserializer(@Lazy ProcurementOrderFinanceTrackingService procurementOrderFinanceTrackingService, ConversionService conversionService) {
        this.procurementOrderFinanceTrackingService = procurementOrderFinanceTrackingService;
        this.conversionService = conversionService;
    }
}
