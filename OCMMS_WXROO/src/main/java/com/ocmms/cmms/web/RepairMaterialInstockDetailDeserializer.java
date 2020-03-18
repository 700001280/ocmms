package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.RepairMaterialInstockDetail;
import com.ocmms.cmms.service.api.RepairMaterialInstockDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = RepairMaterialInstockDetailDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = RepairMaterialInstockDetail.class)
public class RepairMaterialInstockDetailDeserializer extends JsonObjectDeserializer<RepairMaterialInstockDetail> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private RepairMaterialInstockDetailService repairMaterialInstockDetailService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param repairMaterialInstockDetailService
     * @param conversionService
     */
    @Autowired
    public RepairMaterialInstockDetailDeserializer(@Lazy RepairMaterialInstockDetailService repairMaterialInstockDetailService, ConversionService conversionService) {
        this.repairMaterialInstockDetailService = repairMaterialInstockDetailService;
        this.conversionService = conversionService;
    }
}
