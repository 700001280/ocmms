package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = NotificationHeadersItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationHeader.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class NotificationHeadersItemJsonController {
}
