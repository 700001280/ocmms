package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.PriorityType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PriorityTypesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PriorityType.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class PriorityTypesCollectionJsonController {
}
