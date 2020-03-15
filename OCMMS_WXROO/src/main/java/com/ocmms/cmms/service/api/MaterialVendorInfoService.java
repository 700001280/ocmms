package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.master.MaterialVendorInfo;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MaterialVendorInfoService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MaterialVendorInfo.class)
public interface MaterialVendorInfoService extends EntityResolver<MaterialVendorInfo, Long>, ValidatorService<MaterialVendorInfo> {
}
