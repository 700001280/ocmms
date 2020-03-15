package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import com.ocmms.cmms.service.api.PartMaintenanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PartMaintenanceRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PartMaintenanceRecord.class)
public class PartMaintenanceRecordDeserializer extends JsonObjectDeserializer<PartMaintenanceRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PartMaintenanceRecordService partMaintenanceRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param partMaintenanceRecordService
     * @param conversionService
     */
    @Autowired
    public PartMaintenanceRecordDeserializer(@Lazy PartMaintenanceRecordService partMaintenanceRecordService, ConversionService conversionService) {
        this.partMaintenanceRecordService = partMaintenanceRecordService;
        this.conversionService = conversionService;
    }
}
