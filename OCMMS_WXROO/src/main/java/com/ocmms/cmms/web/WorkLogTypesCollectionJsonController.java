package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.WorkLogType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = WorkLogTypesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkLogType.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class WorkLogTypesCollectionJsonController {
}
