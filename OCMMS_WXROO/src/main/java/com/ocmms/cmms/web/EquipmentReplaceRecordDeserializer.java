package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.EquipmentReplaceRecord;
import com.ocmms.cmms.service.api.EquipmentReplaceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = EquipmentReplaceRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = EquipmentReplaceRecord.class)
public class EquipmentReplaceRecordDeserializer extends JsonObjectDeserializer<EquipmentReplaceRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private EquipmentReplaceRecordService equipmentReplaceRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param equipmentReplaceRecordService
     * @param conversionService
     */
    @Autowired
    public EquipmentReplaceRecordDeserializer(@Lazy EquipmentReplaceRecordService equipmentReplaceRecordService, ConversionService conversionService) {
        this.equipmentReplaceRecordService = equipmentReplaceRecordService;
        this.conversionService = conversionService;
    }
}
