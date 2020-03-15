package com.ocmms.cmms.web;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = UnitOfMeasuresCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = UnitOfMeasure.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class UnitOfMeasuresCollectionJsonController {
}
