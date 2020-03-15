package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PreventiveMaintenanceStandardsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PreventiveMaintenanceStandard.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class PreventiveMaintenanceStandardsCollectionJsonController {
}
