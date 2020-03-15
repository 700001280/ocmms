package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskHeader;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = TaskHeadersCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskHeader.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class TaskHeadersCollectionJsonController {
}
