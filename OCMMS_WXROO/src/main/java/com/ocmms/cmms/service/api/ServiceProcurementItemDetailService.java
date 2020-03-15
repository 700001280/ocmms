package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ServiceProcurementItemDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ServiceProcurementItemDetail.class)
public interface ServiceProcurementItemDetailService extends EntityResolver<ServiceProcurementItemDetail, Long>, ValidatorService<ServiceProcurementItemDetail> {
}
