package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;
import com.ocmms.cmms.service.api.BillOfMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = BillOfMaterialDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = BillOfMaterial.class)
public class BillOfMaterialDeserializer extends JsonObjectDeserializer<BillOfMaterial> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private BillOfMaterialService billOfMaterialService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param billOfMaterialService
     * @param conversionService
     */
    @Autowired
    public BillOfMaterialDeserializer(@Lazy BillOfMaterialService billOfMaterialService, ConversionService conversionService) {
        this.billOfMaterialService = billOfMaterialService;
        this.conversionService = conversionService;
    }
}
