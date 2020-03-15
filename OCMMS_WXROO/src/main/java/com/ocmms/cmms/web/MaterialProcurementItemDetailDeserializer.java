package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.service.api.MaterialProcurementItemDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MaterialProcurementItemDetailDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MaterialProcurementItemDetail.class)
public class MaterialProcurementItemDetailDeserializer extends JsonObjectDeserializer<MaterialProcurementItemDetail> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MaterialProcurementItemDetailService materialProcurementItemDetailService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param materialProcurementItemDetailService
     * @param conversionService
     */
    @Autowired
    public MaterialProcurementItemDetailDeserializer(@Lazy MaterialProcurementItemDetailService materialProcurementItemDetailService, ConversionService conversionService) {
        this.materialProcurementItemDetailService = materialProcurementItemDetailService;
        this.conversionService = conversionService;
    }
}
