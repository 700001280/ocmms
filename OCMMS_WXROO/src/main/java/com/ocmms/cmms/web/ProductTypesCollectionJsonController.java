package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.configuration.ProductType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ProductTypesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProductType.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class ProductTypesCollectionJsonController {
}
