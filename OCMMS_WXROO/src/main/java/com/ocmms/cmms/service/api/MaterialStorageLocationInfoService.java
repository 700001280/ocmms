package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MaterialStorageLocationInfoService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MaterialStorageLocationInfo.class)
public interface MaterialStorageLocationInfoService extends EntityResolver<MaterialStorageLocationInfo, Long>, ValidatorService<MaterialStorageLocationInfo> {
}
