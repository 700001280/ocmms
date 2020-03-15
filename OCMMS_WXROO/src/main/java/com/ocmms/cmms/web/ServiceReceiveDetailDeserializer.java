package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;
import com.ocmms.cmms.service.api.ServiceReceiveDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ServiceReceiveDetailDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ServiceReceiveDetail.class)
public class ServiceReceiveDetailDeserializer extends JsonObjectDeserializer<ServiceReceiveDetail> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ServiceReceiveDetailService serviceReceiveDetailService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param serviceReceiveDetailService
     * @param conversionService
     */
    @Autowired
    public ServiceReceiveDetailDeserializer(@Lazy ServiceReceiveDetailService serviceReceiveDetailService, ConversionService conversionService) {
        this.serviceReceiveDetailService = serviceReceiveDetailService;
        this.conversionService = conversionService;
    }
}
