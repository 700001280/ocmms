package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = OutstockDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = OutstockDetail.class)
public interface OutstockDetailService extends EntityResolver<OutstockDetail, Long>, ValidatorService<OutstockDetail> {
}
