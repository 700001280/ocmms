package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.EquipmentScrappingRecord;
import com.ocmms.cmms.service.api.EquipmentScrappingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = EquipmentScrappingRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = EquipmentScrappingRecord.class)
public class EquipmentScrappingRecordDeserializer extends JsonObjectDeserializer<EquipmentScrappingRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private EquipmentScrappingRecordService equipmentScrappingRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param equipmentScrappingRecordService
     * @param conversionService
     */
    @Autowired
    public EquipmentScrappingRecordDeserializer(@Lazy EquipmentScrappingRecordService equipmentScrappingRecordService, ConversionService conversionService) {
        this.equipmentScrappingRecordService = equipmentScrappingRecordService;
        this.conversionService = conversionService;
    }
}
