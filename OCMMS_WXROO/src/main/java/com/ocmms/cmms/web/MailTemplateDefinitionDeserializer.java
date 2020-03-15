package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.MailTemplateDefinition;
import com.ocmms.cmms.service.api.MailTemplateDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MailTemplateDefinitionDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MailTemplateDefinition.class)
public class MailTemplateDefinitionDeserializer extends JsonObjectDeserializer<MailTemplateDefinition> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MailTemplateDefinitionService mailTemplateDefinitionService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param mailTemplateDefinitionService
     * @param conversionService
     */
    @Autowired
    public MailTemplateDefinitionDeserializer(@Lazy MailTemplateDefinitionService mailTemplateDefinitionService, ConversionService conversionService) {
        this.mailTemplateDefinitionService = mailTemplateDefinitionService;
        this.conversionService = conversionService;
    }
}
