package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PartReplaceRecord;
import com.ocmms.cmms.service.api.PartReplaceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PartReplaceRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PartReplaceRecord.class)
public class PartReplaceRecordDeserializer extends JsonObjectDeserializer<PartReplaceRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PartReplaceRecordService partReplaceRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param partReplaceRecordService
     * @param conversionService
     */
    @Autowired
    public PartReplaceRecordDeserializer(@Lazy PartReplaceRecordService partReplaceRecordService, ConversionService conversionService) {
        this.partReplaceRecordService = partReplaceRecordService;
        this.conversionService = conversionService;
    }
}
