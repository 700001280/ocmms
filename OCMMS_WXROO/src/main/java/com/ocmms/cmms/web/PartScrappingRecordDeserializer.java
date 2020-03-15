package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PartScrappingRecord;
import com.ocmms.cmms.service.api.PartScrappingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = PartScrappingRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = PartScrappingRecord.class)
public class PartScrappingRecordDeserializer extends JsonObjectDeserializer<PartScrappingRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private PartScrappingRecordService partScrappingRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param partScrappingRecordService
     * @param conversionService
     */
    @Autowired
    public PartScrappingRecordDeserializer(@Lazy PartScrappingRecordService partScrappingRecordService, ConversionService conversionService) {
        this.partScrappingRecordService = partScrappingRecordService;
        this.conversionService = conversionService;
    }
}
