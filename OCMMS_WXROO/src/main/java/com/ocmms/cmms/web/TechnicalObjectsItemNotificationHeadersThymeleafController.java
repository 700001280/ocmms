package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = TechnicalObjectsItemNotificationHeadersThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TechnicalObject.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "notificationHeaders", views = { "list" })
@RooThymeleaf
public class TechnicalObjectsItemNotificationHeadersThymeleafController {
}
