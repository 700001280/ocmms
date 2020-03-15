package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationItem;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = NotificationItemsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationItem.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class NotificationItemsItemJsonController {
}
