package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentCategory;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = EquipmentCategoryService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = EquipmentCategory.class)
public interface EquipmentCategoryService extends EntityResolver<EquipmentCategory, Long>, ValidatorService<EquipmentCategory> {
}
