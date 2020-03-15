package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.MaterialDiscipline;
import com.ocmms.cmms.service.api.MaterialDisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MaterialDisciplineDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MaterialDiscipline.class)
public class MaterialDisciplineDeserializer extends JsonObjectDeserializer<MaterialDiscipline> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MaterialDisciplineService materialDisciplineService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param materialDisciplineService
     * @param conversionService
     */
    @Autowired
    public MaterialDisciplineDeserializer(@Lazy MaterialDisciplineService materialDisciplineService, ConversionService conversionService) {
        this.materialDisciplineService = materialDisciplineService;
        this.conversionService = conversionService;
    }
}
