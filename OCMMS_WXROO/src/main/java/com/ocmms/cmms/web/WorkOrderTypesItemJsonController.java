package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = WorkOrderTypesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderType.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class WorkOrderTypesItemJsonController {
}
