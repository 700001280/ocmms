package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.OrganizationCatalog;
import com.ocmms.cmms.service.api.OrganizationCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = OrganizationCatalogDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = OrganizationCatalog.class)
public class OrganizationCatalogDeserializer extends JsonObjectDeserializer<OrganizationCatalog> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private OrganizationCatalogService organizationCatalogService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param organizationCatalogService
     * @param conversionService
     */
    @Autowired
    public OrganizationCatalogDeserializer(@Lazy OrganizationCatalogService organizationCatalogService, ConversionService conversionService) {
        this.organizationCatalogService = organizationCatalogService;
        this.conversionService = conversionService;
    }
}
