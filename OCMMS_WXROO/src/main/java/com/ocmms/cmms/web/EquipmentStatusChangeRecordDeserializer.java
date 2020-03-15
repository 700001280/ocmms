package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatusChangeRecord;
import com.ocmms.cmms.service.api.EquipmentStatusChangeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = EquipmentStatusChangeRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = EquipmentStatusChangeRecord.class)
public class EquipmentStatusChangeRecordDeserializer extends JsonObjectDeserializer<EquipmentStatusChangeRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private EquipmentStatusChangeRecordService equipmentStatusChangeRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param equipmentStatusChangeRecordService
     * @param conversionService
     */
    @Autowired
    public EquipmentStatusChangeRecordDeserializer(@Lazy EquipmentStatusChangeRecordService equipmentStatusChangeRecordService, ConversionService conversionService) {
        this.equipmentStatusChangeRecordService = equipmentStatusChangeRecordService;
        this.conversionService = conversionService;
    }
}
