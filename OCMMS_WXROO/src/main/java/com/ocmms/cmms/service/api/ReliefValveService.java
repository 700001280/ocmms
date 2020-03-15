package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.ReliefValve;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ReliefValveService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ReliefValve.class)
public interface ReliefValveService extends EntityResolver<ReliefValve, Long>, ValidatorService<ReliefValve> {
}
