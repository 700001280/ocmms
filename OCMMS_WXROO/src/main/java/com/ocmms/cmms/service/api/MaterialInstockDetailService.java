package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MaterialInstockDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MaterialInstockDetail.class)
public interface MaterialInstockDetailService extends EntityResolver<MaterialInstockDetail, Long>, ValidatorService<MaterialInstockDetail> {
}
