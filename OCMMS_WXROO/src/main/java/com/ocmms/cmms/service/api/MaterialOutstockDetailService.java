package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MaterialOutstockDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MaterialOutstockDetail.class)
public interface MaterialOutstockDetailService extends EntityResolver<MaterialOutstockDetail, Long>, ValidatorService<MaterialOutstockDetail> {
}
