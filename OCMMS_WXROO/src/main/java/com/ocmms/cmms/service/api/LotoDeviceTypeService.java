package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.loto.LotoDeviceType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = LotoDeviceTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = LotoDeviceType.class)
public interface LotoDeviceTypeService extends EntityResolver<LotoDeviceType, Long>, ValidatorService<LotoDeviceType> {
}
