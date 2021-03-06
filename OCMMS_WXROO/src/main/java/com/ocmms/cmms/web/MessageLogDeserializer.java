package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.MessageLog;
import com.ocmms.cmms.service.api.MessageLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = MessageLogDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = MessageLog.class)
public class MessageLogDeserializer extends JsonObjectDeserializer<MessageLog> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private MessageLogService messageLogService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param messageLogService
     * @param conversionService
     */
    @Autowired
    public MessageLogDeserializer(@Lazy MessageLogService messageLogService, ConversionService conversionService) {
        this.messageLogService = messageLogService;
        this.conversionService = conversionService;
    }
}
