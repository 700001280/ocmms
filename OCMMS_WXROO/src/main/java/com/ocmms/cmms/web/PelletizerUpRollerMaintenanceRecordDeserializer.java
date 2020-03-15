package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerMaintenanceRecord;
import com.ocmms.cmms.service.api.PelletizerUpRollerMaintenanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PelletizerUpRollerMaintenanceRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PelletizerUpRollerMaintenanceRecord.class)
public class PelletizerUpRollerMaintenanceRecordDeserializer extends JsonObjectDeserializer<PelletizerUpRollerMaintenanceRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PelletizerUpRollerMaintenanceRecordService pelletizerUpRollerMaintenanceRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param pelletizerUpRollerMaintenanceRecordService
     * @param conversionService
     */
    @Autowired
    public PelletizerUpRollerMaintenanceRecordDeserializer(@Lazy PelletizerUpRollerMaintenanceRecordService pelletizerUpRollerMaintenanceRecordService, ConversionService conversionService) {
        this.pelletizerUpRollerMaintenanceRecordService = pelletizerUpRollerMaintenanceRecordService;
        this.conversionService = conversionService;
    }
}
