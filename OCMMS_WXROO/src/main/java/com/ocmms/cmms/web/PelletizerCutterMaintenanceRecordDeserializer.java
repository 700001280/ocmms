package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PelletizerCutterMaintenanceRecord;
import com.ocmms.cmms.service.api.PelletizerCutterMaintenanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PelletizerCutterMaintenanceRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PelletizerCutterMaintenanceRecord.class)
public class PelletizerCutterMaintenanceRecordDeserializer extends JsonObjectDeserializer<PelletizerCutterMaintenanceRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PelletizerCutterMaintenanceRecordService pelletizerCutterMaintenanceRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param pelletizerCutterMaintenanceRecordService
     * @param conversionService
     */
    @Autowired
    public PelletizerCutterMaintenanceRecordDeserializer(@Lazy PelletizerCutterMaintenanceRecordService pelletizerCutterMaintenanceRecordService, ConversionService conversionService) {
        this.pelletizerCutterMaintenanceRecordService = pelletizerCutterMaintenanceRecordService;
        this.conversionService = conversionService;
    }
}
