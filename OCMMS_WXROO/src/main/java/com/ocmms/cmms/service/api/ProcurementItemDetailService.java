package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ProcurementItemDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ProcurementItemDetail.class)
public interface ProcurementItemDetailService extends EntityResolver<ProcurementItemDetail, Long>, ValidatorService<ProcurementItemDetail> {
}
