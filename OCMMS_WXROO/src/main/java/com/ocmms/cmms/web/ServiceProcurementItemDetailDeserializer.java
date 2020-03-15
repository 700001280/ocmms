package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import com.ocmms.cmms.service.api.ServiceProcurementItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ServiceProcurementItemDetailDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ServiceProcurementItemDetail.class)
public class ServiceProcurementItemDetailDeserializer extends JsonObjectDeserializer<ServiceProcurementItemDetail> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ServiceProcurementItemDetailService serviceProcurementItemDetailService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param serviceProcurementItemDetailService
     * @param conversionService
     */
    @Autowired
    public ServiceProcurementItemDetailDeserializer(@Lazy ServiceProcurementItemDetailService serviceProcurementItemDetailService, ConversionService conversionService) {
        this.serviceProcurementItemDetailService = serviceProcurementItemDetailService;
        this.conversionService = conversionService;
    }
}
