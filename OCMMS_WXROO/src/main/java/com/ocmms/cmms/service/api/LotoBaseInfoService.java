package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.loto.LotoBaseInfo;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = LotoBaseInfoService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = LotoBaseInfo.class)
public interface LotoBaseInfoService extends EntityResolver<LotoBaseInfo, Long>, ValidatorService<LotoBaseInfo> {
}
