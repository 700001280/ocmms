package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoDetail;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = LotoDetailsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = LotoDetail.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class LotoDetailsItemJsonController {
}
