package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PreventiveMaintenanceContentsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PreventiveMaintenanceContent.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class PreventiveMaintenanceContentsCollectionJsonController {
}
