package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.MaterialType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = MaterialTypesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MaterialType.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class MaterialTypesItemJsonController {
}
