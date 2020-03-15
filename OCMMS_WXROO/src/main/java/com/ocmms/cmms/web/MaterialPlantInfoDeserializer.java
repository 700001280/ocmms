package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.MaterialPlantInfo;
import com.ocmms.cmms.service.api.MaterialPlantInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MaterialPlantInfoDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MaterialPlantInfo.class)
public class MaterialPlantInfoDeserializer extends JsonObjectDeserializer<MaterialPlantInfo> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MaterialPlantInfoService materialPlantInfoService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param materialPlantInfoService
     * @param conversionService
     */
    @Autowired
    public MaterialPlantInfoDeserializer(@Lazy MaterialPlantInfoService materialPlantInfoService, ConversionService conversionService) {
        this.materialPlantInfoService = materialPlantInfoService;
        this.conversionService = conversionService;
    }
}
