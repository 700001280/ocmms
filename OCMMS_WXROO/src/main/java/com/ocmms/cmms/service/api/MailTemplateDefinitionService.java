package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.system.MailTemplateDefinition;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MailTemplateDefinitionService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MailTemplateDefinition.class)
public interface MailTemplateDefinitionService extends EntityResolver<MailTemplateDefinition, Long>, ValidatorService<MailTemplateDefinition> {
}
