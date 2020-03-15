package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.TaskTracking;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = TaskTrackingsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskTracking.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class TaskTrackingsCollectionJsonController {
}
