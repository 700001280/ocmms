package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.storage.PartScrappingOutstockDetail;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PartScrappingOutstockDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PartScrappingOutstockDetail.class)
public interface PartScrappingOutstockDetailService extends EntityResolver<PartScrappingOutstockDetail, Long>, ValidatorService<PartScrappingOutstockDetail> {
}
