package com.ocmms.cmms.web;
import com.ocmms.cmms.model.common.Address;
import com.ocmms.cmms.service.api.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = AddressDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Address.class)
public class AddressDeserializer extends JsonObjectDeserializer<Address> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private AddressService addressService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param addressService
     * @param conversionService
     */
    @Autowired
    public AddressDeserializer(@Lazy AddressService addressService, ConversionService conversionService) {
        this.addressService = addressService;
        this.conversionService = conversionService;
    }
}
