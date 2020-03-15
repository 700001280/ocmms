package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationPriority;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = NotificationPrioritiesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationPriority.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class NotificationPrioritiesCollectionJsonController {
}
