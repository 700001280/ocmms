package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PlannerGroupsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlannerGroup.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class PlannerGroupsItemJsonController {
}
