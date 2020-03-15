package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderTimeSheet;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = WorkOrderTimeSheetsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderTimeSheet.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class WorkOrderTimeSheetsItemJsonController {
}
