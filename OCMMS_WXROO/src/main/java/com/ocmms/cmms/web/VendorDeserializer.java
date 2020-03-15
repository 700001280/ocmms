package com.ocmms.cmms.web;
import com.ocmms.cmms.model.srm.Vendor;
import com.ocmms.cmms.service.api.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = VendorDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Vendor.class)
public class VendorDeserializer extends JsonObjectDeserializer<Vendor> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private VendorService vendorService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param vendorService
     * @param conversionService
     */
    @Autowired
    public VendorDeserializer(@Lazy VendorService vendorService, ConversionService conversionService) {
        this.vendorService = vendorService;
        this.conversionService = conversionService;
    }
}
