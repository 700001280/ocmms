package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.common.Address;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = AddressService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Address.class)
public interface AddressService extends EntityResolver<Address, Long>, ValidatorService<Address> {
}
