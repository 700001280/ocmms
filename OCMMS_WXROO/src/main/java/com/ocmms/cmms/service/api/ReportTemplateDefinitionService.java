package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.system.ReportTemplateDefinition;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ReportTemplateDefinitionService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ReportTemplateDefinition.class)
public interface ReportTemplateDefinitionService extends EntityResolver<ReportTemplateDefinition, Long>, ValidatorService<ReportTemplateDefinition> {
}
