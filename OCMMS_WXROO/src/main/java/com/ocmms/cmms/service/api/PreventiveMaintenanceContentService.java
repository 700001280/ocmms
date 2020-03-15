package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PreventiveMaintenanceContentService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PreventiveMaintenanceContent.class)
public interface PreventiveMaintenanceContentService extends EntityResolver<PreventiveMaintenanceContent, Long>, ValidatorService<PreventiveMaintenanceContent> {
}
