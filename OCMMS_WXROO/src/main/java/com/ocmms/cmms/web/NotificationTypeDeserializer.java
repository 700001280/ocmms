package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationType;
import com.ocmms.cmms.service.api.NotificationTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = NotificationTypeDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = NotificationType.class)
public class NotificationTypeDeserializer extends JsonObjectDeserializer<NotificationType> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private NotificationTypeService notificationTypeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param notificationTypeService
     * @param conversionService
     */
    @Autowired
    public NotificationTypeDeserializer(@Lazy NotificationTypeService notificationTypeService, ConversionService conversionService) {
        this.notificationTypeService = notificationTypeService;
        this.conversionService = conversionService;
    }
}
