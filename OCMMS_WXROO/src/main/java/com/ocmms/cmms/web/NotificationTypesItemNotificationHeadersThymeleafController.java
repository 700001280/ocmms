package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = NotificationTypesItemNotificationHeadersThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationType.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "notificationHeaders", views = { "list" })
@RooThymeleaf
public class NotificationTypesItemNotificationHeadersThymeleafController {
}
