package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.configuration.OperationRelationship;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = OperationRelationshipService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = OperationRelationship.class)
public interface OperationRelationshipService extends EntityResolver<OperationRelationship, Long>, ValidatorService<OperationRelationship> {
}
