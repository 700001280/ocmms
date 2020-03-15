package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PlanItem;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PlanItemsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlanItem.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class PlanItemsItemJsonController {
}
