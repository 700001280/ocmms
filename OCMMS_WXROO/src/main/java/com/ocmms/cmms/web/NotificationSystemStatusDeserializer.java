package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationSystemStatus;
import com.ocmms.cmms.service.api.NotificationSystemStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = NotificationSystemStatusDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = NotificationSystemStatus.class)
public class NotificationSystemStatusDeserializer extends JsonObjectDeserializer<NotificationSystemStatus> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private NotificationSystemStatusService notificationSystemStatusService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param notificationSystemStatusService
     * @param conversionService
     */
    @Autowired
    public NotificationSystemStatusDeserializer(@Lazy NotificationSystemStatusService notificationSystemStatusService, ConversionService conversionService) {
        this.notificationSystemStatusService = notificationSystemStatusService;
        this.conversionService = conversionService;
    }
}
