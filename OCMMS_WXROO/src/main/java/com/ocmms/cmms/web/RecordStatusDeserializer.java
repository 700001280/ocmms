package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.service.api.RecordStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = RecordStatusDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = RecordStatus.class)
public class RecordStatusDeserializer extends JsonObjectDeserializer<RecordStatus> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private RecordStatusService recordStatusService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param recordStatusService
     * @param conversionService
     */
    @Autowired
    public RecordStatusDeserializer(@Lazy RecordStatusService recordStatusService, ConversionService conversionService) {
        this.recordStatusService = recordStatusService;
        this.conversionService = conversionService;
    }
}
