package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.storage.InstockDetail;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = InstockDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = InstockDetail.class)
public interface InstockDetailService extends EntityResolver<InstockDetail, Long>, ValidatorService<InstockDetail> {
}
