package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.MaterialAttribute;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = MaterialAttributesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MaterialAttribute.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class MaterialAttributesItemJsonController {
}
