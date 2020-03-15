package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.TaskTrackingStatus;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = TaskTrackingStatusesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskTrackingStatus.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class TaskTrackingStatusesItemJsonController {
}
