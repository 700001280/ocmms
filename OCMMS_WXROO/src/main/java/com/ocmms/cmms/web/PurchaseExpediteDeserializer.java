package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.PurchaseExpedite;
import com.ocmms.cmms.service.api.PurchaseExpediteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PurchaseExpediteDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PurchaseExpedite.class)
public class PurchaseExpediteDeserializer extends JsonObjectDeserializer<PurchaseExpedite> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PurchaseExpediteService purchaseExpediteService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param purchaseExpediteService
     * @param conversionService
     */
    @Autowired
    public PurchaseExpediteDeserializer(@Lazy PurchaseExpediteService purchaseExpediteService, ConversionService conversionService) {
        this.purchaseExpediteService = purchaseExpediteService;
        this.conversionService = conversionService;
    }
}
