package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PlantSectionsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlantSection.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class PlantSectionsItemJsonController {
}
