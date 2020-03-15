package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.MessageLog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = MessageLogsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MessageLog.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class MessageLogsItemJsonController {
}
