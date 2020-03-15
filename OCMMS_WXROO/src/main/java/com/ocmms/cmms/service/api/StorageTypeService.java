package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.storage.StorageType;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = StorageTypeService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = StorageType.class)
public interface StorageTypeService extends EntityResolver<StorageType, Long>, ValidatorService<StorageType> {
}
