package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureVessel;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PressureVesselsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PressureVessel.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class PressureVesselsItemJsonController {
}
