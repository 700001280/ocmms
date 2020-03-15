package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PelletizerCutterReplaceRecord;
import com.ocmms.cmms.service.api.PelletizerCutterReplaceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PelletizerCutterReplaceRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PelletizerCutterReplaceRecord.class)
public class PelletizerCutterReplaceRecordDeserializer extends JsonObjectDeserializer<PelletizerCutterReplaceRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PelletizerCutterReplaceRecordService pelletizerCutterReplaceRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param pelletizerCutterReplaceRecordService
     * @param conversionService
     */
    @Autowired
    public PelletizerCutterReplaceRecordDeserializer(@Lazy PelletizerCutterReplaceRecordService pelletizerCutterReplaceRecordService, ConversionService conversionService) {
        this.pelletizerCutterReplaceRecordService = pelletizerCutterReplaceRecordService;
        this.conversionService = conversionService;
    }
}
