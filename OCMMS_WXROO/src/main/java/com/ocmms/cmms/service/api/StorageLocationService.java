package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = StorageLocationService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = StorageLocation.class)
public interface StorageLocationService extends EntityResolver<StorageLocation, Long>, ValidatorService<StorageLocation> {
}
