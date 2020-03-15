package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = NotificationHeadersItemNotificationItemsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationHeader.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "notificationItems", views = { "list" })
@RooThymeleaf
public class NotificationHeadersItemNotificationItemsThymeleafController {
}
