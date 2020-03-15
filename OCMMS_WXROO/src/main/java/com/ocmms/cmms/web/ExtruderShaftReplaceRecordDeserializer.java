package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.ExtruderShaftReplaceRecord;
import com.ocmms.cmms.service.api.ExtruderShaftReplaceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ExtruderShaftReplaceRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ExtruderShaftReplaceRecord.class)
public class ExtruderShaftReplaceRecordDeserializer extends JsonObjectDeserializer<ExtruderShaftReplaceRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ExtruderShaftReplaceRecordService extruderShaftReplaceRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param extruderShaftReplaceRecordService
     * @param conversionService
     */
    @Autowired
    public ExtruderShaftReplaceRecordDeserializer(@Lazy ExtruderShaftReplaceRecordService extruderShaftReplaceRecordService, ConversionService conversionService) {
        this.extruderShaftReplaceRecordService = extruderShaftReplaceRecordService;
        this.conversionService = conversionService;
    }
}
