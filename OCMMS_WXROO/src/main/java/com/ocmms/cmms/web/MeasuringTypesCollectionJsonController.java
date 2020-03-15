package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = MeasuringTypesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MeasuringType.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class MeasuringTypesCollectionJsonController {
}
