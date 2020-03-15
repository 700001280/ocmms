package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.ScrewElement;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ScrewElementsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ScrewElement.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class ScrewElementsCollectionJsonController {
}
