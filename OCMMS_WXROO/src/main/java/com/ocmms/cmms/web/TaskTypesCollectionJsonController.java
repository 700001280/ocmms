package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = TaskTypesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskType.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class TaskTypesCollectionJsonController {
}
