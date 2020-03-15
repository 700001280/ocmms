package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.ObjectType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ObjectTypesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ObjectType.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class ObjectTypesItemJsonController {
}
