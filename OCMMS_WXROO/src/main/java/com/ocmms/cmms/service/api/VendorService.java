package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.srm.Vendor;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = VendorService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Vendor.class)
public interface VendorService extends EntityResolver<Vendor, Long>, ValidatorService<Vendor> {
}
