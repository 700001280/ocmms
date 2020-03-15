package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = BillOfMaterialService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = BillOfMaterial.class)
public interface BillOfMaterialService extends EntityResolver<BillOfMaterial, Long>, ValidatorService<BillOfMaterial> {
}
