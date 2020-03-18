package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrderFinanceTracking;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ProcurementOrderFinanceTrackingService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ProcurementOrderFinanceTracking.class)
public interface ProcurementOrderFinanceTrackingService extends EntityResolver<ProcurementOrderFinanceTracking, Long>, ValidatorService<ProcurementOrderFinanceTracking> {
}
