package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationItem;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = NotificationItemsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationItem.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class NotificationItemsCollectionJsonController {
}
