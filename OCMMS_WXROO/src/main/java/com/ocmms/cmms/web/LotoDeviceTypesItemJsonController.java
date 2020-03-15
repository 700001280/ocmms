package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoDeviceType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = LotoDeviceTypesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = LotoDeviceType.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class LotoDeviceTypesItemJsonController {
}
