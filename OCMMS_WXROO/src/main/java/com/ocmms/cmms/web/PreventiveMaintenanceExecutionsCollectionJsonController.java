package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceExecution;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PreventiveMaintenanceExecutionsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PreventiveMaintenanceExecution.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class PreventiveMaintenanceExecutionsCollectionJsonController {
}
