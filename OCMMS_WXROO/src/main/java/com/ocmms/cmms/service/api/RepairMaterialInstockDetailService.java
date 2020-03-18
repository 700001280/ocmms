package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.storage.RepairMaterialInstockDetail;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = RepairMaterialInstockDetailService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = RepairMaterialInstockDetail.class)
public interface RepairMaterialInstockDetailService extends EntityResolver<RepairMaterialInstockDetail, Long>, ValidatorService<RepairMaterialInstockDetail> {
}
