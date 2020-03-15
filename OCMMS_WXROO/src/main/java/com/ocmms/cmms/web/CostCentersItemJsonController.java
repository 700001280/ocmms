package com.ocmms.cmms.web;
import com.ocmms.cmms.model.fico.CostCenter;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = CostCentersItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = CostCenter.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class CostCentersItemJsonController {
}
