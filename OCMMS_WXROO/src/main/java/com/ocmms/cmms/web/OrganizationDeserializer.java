package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.service.api.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = OrganizationDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Organization.class)
public class OrganizationDeserializer extends JsonObjectDeserializer<Organization> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private OrganizationService organizationService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param organizationService
     * @param conversionService
     */
    @Autowired
    public OrganizationDeserializer(@Lazy OrganizationService organizationService, ConversionService conversionService) {
        this.organizationService = organizationService;
        this.conversionService = conversionService;
    }
}
