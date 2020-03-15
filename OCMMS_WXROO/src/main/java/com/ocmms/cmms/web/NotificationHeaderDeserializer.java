package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.service.api.NotificationHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = NotificationHeaderDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = NotificationHeader.class)
public class NotificationHeaderDeserializer extends JsonObjectDeserializer<NotificationHeader> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private NotificationHeaderService notificationHeaderService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param notificationHeaderService
     * @param conversionService
     */
    @Autowired
    public NotificationHeaderDeserializer(@Lazy NotificationHeaderService notificationHeaderService, ConversionService conversionService) {
        this.notificationHeaderService = notificationHeaderService;
        this.conversionService = conversionService;
    }
}
