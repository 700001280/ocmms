package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import com.ocmms.cmms.service.api.EquipmentMaintenanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = EquipmentMaintenanceRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = EquipmentMaintenanceRecord.class)
public class EquipmentMaintenanceRecordDeserializer extends JsonObjectDeserializer<EquipmentMaintenanceRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private EquipmentMaintenanceRecordService equipmentMaintenanceRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param equipmentMaintenanceRecordService
     * @param conversionService
     */
    @Autowired
    public EquipmentMaintenanceRecordDeserializer(@Lazy EquipmentMaintenanceRecordService equipmentMaintenanceRecordService, ConversionService conversionService) {
        this.equipmentMaintenanceRecordService = equipmentMaintenanceRecordService;
        this.conversionService = conversionService;
    }
}
