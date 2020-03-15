package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.FunctionalLocation;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = FunctionalLocationsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = FunctionalLocation.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class FunctionalLocationsItemJsonController {
}
