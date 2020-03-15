package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.configuration.ProductMasterData;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ProductMasterDatasCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProductMasterData.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class ProductMasterDatasCollectionJsonController {
}
