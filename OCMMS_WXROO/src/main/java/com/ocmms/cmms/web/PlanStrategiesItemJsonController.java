package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PlanStrategy;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PlanStrategiesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlanStrategy.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class PlanStrategiesItemJsonController {
}
