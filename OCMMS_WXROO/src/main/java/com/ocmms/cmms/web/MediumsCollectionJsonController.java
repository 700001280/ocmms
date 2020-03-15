package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.measuringpoint.Medium;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = MediumsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Medium.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class MediumsCollectionJsonController {
}
