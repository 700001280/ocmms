package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = OutstockDetailsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = OutstockDetail.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class OutstockDetailsItemJsonController {
}
