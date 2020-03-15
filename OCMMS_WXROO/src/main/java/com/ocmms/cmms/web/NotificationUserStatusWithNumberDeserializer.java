package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithNumber;
import com.ocmms.cmms.service.api.NotificationUserStatusWithNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = NotificationUserStatusWithNumberDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = NotificationUserStatusWithNumber.class)
public class NotificationUserStatusWithNumberDeserializer extends JsonObjectDeserializer<NotificationUserStatusWithNumber> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private NotificationUserStatusWithNumberService notificationUserStatusWithNumberService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param notificationUserStatusWithNumberService
     * @param conversionService
     */
    @Autowired
    public NotificationUserStatusWithNumberDeserializer(@Lazy NotificationUserStatusWithNumberService notificationUserStatusWithNumberService, ConversionService conversionService) {
        this.notificationUserStatusWithNumberService = notificationUserStatusWithNumberService;
        this.conversionService = conversionService;
    }
}
