package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.PotentialHazard;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PotentialHazardsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PotentialHazard.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class PotentialHazardsCollectionJsonController {
}
