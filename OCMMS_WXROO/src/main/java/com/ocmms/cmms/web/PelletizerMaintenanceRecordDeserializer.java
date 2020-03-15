package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PelletizerMaintenanceRecord;
import com.ocmms.cmms.service.api.PelletizerMaintenanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PelletizerMaintenanceRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PelletizerMaintenanceRecord.class)
public class PelletizerMaintenanceRecordDeserializer extends JsonObjectDeserializer<PelletizerMaintenanceRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PelletizerMaintenanceRecordService pelletizerMaintenanceRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param pelletizerMaintenanceRecordService
     * @param conversionService
     */
    @Autowired
    public PelletizerMaintenanceRecordDeserializer(@Lazy PelletizerMaintenanceRecordService pelletizerMaintenanceRecordService, ConversionService conversionService) {
        this.pelletizerMaintenanceRecordService = pelletizerMaintenanceRecordService;
        this.conversionService = conversionService;
    }
}
