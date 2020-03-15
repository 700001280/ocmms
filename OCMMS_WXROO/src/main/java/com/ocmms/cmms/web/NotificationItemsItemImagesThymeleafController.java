package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationItem;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = NotificationItemsItemImagesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationItem.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "images", views = { "list" })
@RooThymeleaf
public class NotificationItemsItemImagesThymeleafController {
}
