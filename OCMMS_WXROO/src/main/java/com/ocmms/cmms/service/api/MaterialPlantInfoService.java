package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MaterialPlantInfoService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MaterialPlantInfo.class)
public interface MaterialPlantInfoService extends EntityResolver<MaterialPlantInfo, Long>, ValidatorService<MaterialPlantInfo> {
}
