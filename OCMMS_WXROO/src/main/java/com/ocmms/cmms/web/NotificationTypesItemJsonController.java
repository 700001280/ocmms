package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = NotificationTypesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationType.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class NotificationTypesItemJsonController {
}
