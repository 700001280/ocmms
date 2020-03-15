package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.configuration.ProductMasterData;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ProductMasterDatasItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProductMasterData.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class ProductMasterDatasItemJsonController {
}
