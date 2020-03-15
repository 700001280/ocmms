package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.operation.AutonomousMaintenanceFinding;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = AutonomousMaintenanceFindingsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = AutonomousMaintenanceFinding.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class AutonomousMaintenanceFindingsCollectionJsonController {
}
