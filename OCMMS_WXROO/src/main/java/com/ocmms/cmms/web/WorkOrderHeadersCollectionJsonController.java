package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = WorkOrderHeadersCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderHeader.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class WorkOrderHeadersCollectionJsonController {
}
