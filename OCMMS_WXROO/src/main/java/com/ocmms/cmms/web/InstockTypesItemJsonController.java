package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.InstockType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = InstockTypesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = InstockType.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class InstockTypesItemJsonController {
}
