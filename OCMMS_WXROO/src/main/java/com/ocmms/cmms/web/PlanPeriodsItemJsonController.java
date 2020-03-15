package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PlanPeriod;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PlanPeriodsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlanPeriod.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class PlanPeriodsItemJsonController {
}
