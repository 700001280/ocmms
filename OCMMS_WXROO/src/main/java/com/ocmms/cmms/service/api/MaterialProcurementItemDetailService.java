package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MaterialProcurementItemDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MaterialProcurementItemDetail.class)
public interface MaterialProcurementItemDetailService extends EntityResolver<MaterialProcurementItemDetail, Long>, ValidatorService<MaterialProcurementItemDetail> {
}
