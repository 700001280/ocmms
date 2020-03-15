package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithoutNumber;
import com.ocmms.cmms.service.api.NotificationUserStatusWithoutNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = NotificationUserStatusWithoutNumberDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = NotificationUserStatusWithoutNumber.class)
public class NotificationUserStatusWithoutNumberDeserializer extends JsonObjectDeserializer<NotificationUserStatusWithoutNumber> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private NotificationUserStatusWithoutNumberService notificationUserStatusWithoutNumberService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param notificationUserStatusWithoutNumberService
     * @param conversionService
     */
    @Autowired
    public NotificationUserStatusWithoutNumberDeserializer(@Lazy NotificationUserStatusWithoutNumberService notificationUserStatusWithoutNumberService, ConversionService conversionService) {
        this.notificationUserStatusWithoutNumberService = notificationUserStatusWithoutNumberService;
        this.conversionService = conversionService;
    }
}
