package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.operation.FailureMaintenanceReport;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = FailureMaintenanceReportsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = FailureMaintenanceReport.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class FailureMaintenanceReportsItemJsonController {
}
