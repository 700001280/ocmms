package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringRecord;
import com.ocmms.cmms.service.api.MeasuringRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MeasuringRecordDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MeasuringRecord.class)
public class MeasuringRecordDeserializer extends JsonObjectDeserializer<MeasuringRecord> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MeasuringRecordService measuringRecordService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param measuringRecordService
     * @param conversionService
     */
    @Autowired
    public MeasuringRecordDeserializer(@Lazy MeasuringRecordService measuringRecordService, ConversionService conversionService) {
        this.measuringRecordService = measuringRecordService;
        this.conversionService = conversionService;
    }
}
