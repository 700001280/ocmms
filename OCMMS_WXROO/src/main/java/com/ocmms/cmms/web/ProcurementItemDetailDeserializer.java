package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import com.ocmms.cmms.service.api.ProcurementItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ProcurementItemDetailDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ProcurementItemDetail.class)
public class ProcurementItemDetailDeserializer extends JsonObjectDeserializer<ProcurementItemDetail> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ProcurementItemDetailService procurementItemDetailService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param procurementItemDetailService
     * @param conversionService
     */
    @Autowired
    public ProcurementItemDetailDeserializer(@Lazy ProcurementItemDetailService procurementItemDetailService, ConversionService conversionService) {
        this.procurementItemDetailService = procurementItemDetailService;
        this.conversionService = conversionService;
    }
}
