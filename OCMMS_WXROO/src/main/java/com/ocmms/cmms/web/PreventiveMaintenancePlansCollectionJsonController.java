package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PreventiveMaintenancePlan;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PreventiveMaintenancePlansCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PreventiveMaintenancePlan.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class PreventiveMaintenancePlansCollectionJsonController {
}
