package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.ServiceCatalog;
import com.ocmms.cmms.service.api.ServiceCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ServiceCatalogDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ServiceCatalog.class)
public class ServiceCatalogDeserializer extends JsonObjectDeserializer<ServiceCatalog> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ServiceCatalogService serviceCatalogService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param serviceCatalogService
     * @param conversionService
     */
    @Autowired
    public ServiceCatalogDeserializer(@Lazy ServiceCatalogService serviceCatalogService, ConversionService conversionService) {
        this.serviceCatalogService = serviceCatalogService;
        this.conversionService = conversionService;
    }
}
