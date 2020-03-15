package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ProcurementOrderService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ProcurementOrder.class)
public interface ProcurementOrderService extends EntityResolver<ProcurementOrder, Long>, ValidatorService<ProcurementOrder> {
}
