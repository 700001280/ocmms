package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = TechnicalObjectsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TechnicalObject.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class TechnicalObjectsCollectionJsonController {
}
