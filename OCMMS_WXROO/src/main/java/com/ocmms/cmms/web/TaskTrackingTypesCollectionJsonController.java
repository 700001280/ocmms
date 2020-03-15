package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.TaskTrackingType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = TaskTrackingTypesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskTrackingType.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class TaskTrackingTypesCollectionJsonController {
}
