package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.ReportTemplateDefinition;
import com.ocmms.cmms.service.api.ReportTemplateDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ReportTemplateDefinitionDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ReportTemplateDefinition.class)
public class ReportTemplateDefinitionDeserializer extends JsonObjectDeserializer<ReportTemplateDefinition> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ReportTemplateDefinitionService reportTemplateDefinitionService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param reportTemplateDefinitionService
     * @param conversionService
     */
    @Autowired
    public ReportTemplateDefinitionDeserializer(@Lazy ReportTemplateDefinitionService reportTemplateDefinitionService, ConversionService conversionService) {
        this.reportTemplateDefinitionService = reportTemplateDefinitionService;
        this.conversionService = conversionService;
    }
}
