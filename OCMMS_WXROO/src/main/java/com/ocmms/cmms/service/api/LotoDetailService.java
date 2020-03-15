package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.loto.LotoDetail;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = LotoDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = LotoDetail.class)
public interface LotoDetailService extends EntityResolver<LotoDetail, Long>, ValidatorService<LotoDetail> {
}
