package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskActivityType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = TaskActivityTypesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskActivityType.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class TaskActivityTypesItemJsonController {
}
