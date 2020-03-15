package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PartMaintenanceRecordsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PartMaintenanceRecord.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class PartMaintenanceRecordsItemJsonController {
}
