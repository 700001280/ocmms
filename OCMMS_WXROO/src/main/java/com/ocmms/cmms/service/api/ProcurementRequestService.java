package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ProcurementRequestService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ProcurementRequest.class)
public interface ProcurementRequestService extends EntityResolver<ProcurementRequest, Long>, ValidatorService<ProcurementRequest> {
}
