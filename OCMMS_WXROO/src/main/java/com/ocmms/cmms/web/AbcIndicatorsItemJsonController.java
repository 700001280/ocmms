package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.AbcIndicator;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = AbcIndicatorsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = AbcIndicator.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class AbcIndicatorsItemJsonController {
}
