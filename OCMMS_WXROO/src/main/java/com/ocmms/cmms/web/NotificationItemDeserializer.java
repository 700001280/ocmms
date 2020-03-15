package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationItem;
import com.ocmms.cmms.service.api.NotificationItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = NotificationItemDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = NotificationItem.class)
public class NotificationItemDeserializer extends JsonObjectDeserializer<NotificationItem> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private NotificationItemService notificationItemService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param notificationItemService
     * @param conversionService
     */
    @Autowired
    public NotificationItemDeserializer(@Lazy NotificationItemService notificationItemService, ConversionService conversionService) {
        this.notificationItemService = notificationItemService;
        this.conversionService = conversionService;
    }
}
