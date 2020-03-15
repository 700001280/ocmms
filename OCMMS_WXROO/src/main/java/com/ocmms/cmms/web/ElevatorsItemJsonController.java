package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.Elevator;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ElevatorsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Elevator.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class ElevatorsItemJsonController {
}
