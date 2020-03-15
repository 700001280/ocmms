package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PlantSectionsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlantSection.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class PlantSectionsCollectionJsonController {
}
