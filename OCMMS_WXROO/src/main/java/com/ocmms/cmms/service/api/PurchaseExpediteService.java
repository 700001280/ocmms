package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.procurement.PurchaseExpedite;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = PurchaseExpediteService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = PurchaseExpedite.class)
public interface PurchaseExpediteService extends EntityResolver<PurchaseExpedite, Long>, ValidatorService<PurchaseExpedite> {
}
