package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PelletizerReplaceRecord;
import com.ocmms.cmms.service.api.PelletizerReplaceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PelletizerReplaceRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PelletizerReplaceRecord.class)
public class PelletizerReplaceRecordDeserializer extends JsonObjectDeserializer<PelletizerReplaceRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PelletizerReplaceRecordService pelletizerReplaceRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param pelletizerReplaceRecordService
     * @param conversionService
     */
    @Autowired
    public PelletizerReplaceRecordDeserializer(@Lazy PelletizerReplaceRecordService pelletizerReplaceRecordService, ConversionService conversionService) {
        this.pelletizerReplaceRecordService = pelletizerReplaceRecordService;
        this.conversionService = conversionService;
    }
}
