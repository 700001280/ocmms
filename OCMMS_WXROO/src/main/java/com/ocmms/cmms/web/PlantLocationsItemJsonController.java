package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PlantLocationsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlantLocation.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class PlantLocationsItemJsonController {
}
