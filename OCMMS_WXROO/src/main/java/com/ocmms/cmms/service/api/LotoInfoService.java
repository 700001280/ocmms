package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.loto.LotoInfo;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = LotoInfoService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = LotoInfo.class)
public interface LotoInfoService extends EntityResolver<LotoInfo, Long>, ValidatorService<LotoInfo> {
}
