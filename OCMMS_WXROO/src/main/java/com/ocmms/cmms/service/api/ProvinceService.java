package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.common.Province;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ProvinceService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Province.class)
public interface ProvinceService extends EntityResolver<Province, Long>, ValidatorService<Province> {
}
