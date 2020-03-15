package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationPriority;
import com.ocmms.cmms.service.api.NotificationPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = NotificationPriorityDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = NotificationPriority.class)
public class NotificationPriorityDeserializer extends JsonObjectDeserializer<NotificationPriority> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private NotificationPriorityService notificationPriorityService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param notificationPriorityService
     * @param conversionService
     */
    @Autowired
    public NotificationPriorityDeserializer(@Lazy NotificationPriorityService notificationPriorityService, ConversionService conversionService) {
        this.notificationPriorityService = notificationPriorityService;
        this.conversionService = conversionService;
    }
}
