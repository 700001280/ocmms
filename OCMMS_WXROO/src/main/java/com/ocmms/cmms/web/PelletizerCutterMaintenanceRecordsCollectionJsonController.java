package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PelletizerCutterMaintenanceRecord;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PelletizerCutterMaintenanceRecordsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PelletizerCutterMaintenanceRecord.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class PelletizerCutterMaintenanceRecordsCollectionJsonController {
}
