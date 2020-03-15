package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.storage.Warehouse;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = WarehouseService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Warehouse.class)
public interface WarehouseService extends EntityResolver<Warehouse, Long>, ValidatorService<Warehouse> {
}
