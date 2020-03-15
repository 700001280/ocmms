package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.WorkLog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = WorkLogsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkLog.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class WorkLogsItemJsonController {
}
