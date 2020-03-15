package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.OrgComInformation;
import com.ocmms.cmms.service.api.OrgComInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = OrgComInformationDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = OrgComInformation.class)
public class OrgComInformationDeserializer extends JsonObjectDeserializer<OrgComInformation> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private OrgComInformationService orgComInformationService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param orgComInformationService
     * @param conversionService
     */
    @Autowired
    public OrgComInformationDeserializer(@Lazy OrgComInformationService orgComInformationService, ConversionService conversionService) {
        this.orgComInformationService = orgComInformationService;
        this.conversionService = conversionService;
    }
}
