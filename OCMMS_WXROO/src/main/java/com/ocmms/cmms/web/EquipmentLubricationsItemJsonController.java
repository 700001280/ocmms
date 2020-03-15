package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentLubrication;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = EquipmentLubricationsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = EquipmentLubrication.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class EquipmentLubricationsItemJsonController {
}
