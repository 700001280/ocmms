package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.fico.CostCenter;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = CostCenterService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = CostCenter.class)
public interface CostCenterService extends EntityResolver<CostCenter, Long>, ValidatorService<CostCenter> {
}
