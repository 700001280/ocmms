package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.AuthourizationGroup;
import com.ocmms.cmms.service.api.AuthourizationGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = AuthourizationGroupDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = AuthourizationGroup.class)
public class AuthourizationGroupDeserializer extends JsonObjectDeserializer<AuthourizationGroup> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AuthourizationGroupService authourizationGroupService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param authourizationGroupService
     * @param conversionService
     */
    @Autowired
    public AuthourizationGroupDeserializer(@Lazy AuthourizationGroupService authourizationGroupService, ConversionService conversionService) {
        this.authourizationGroupService = authourizationGroupService;
        this.conversionService = conversionService;
    }
}
