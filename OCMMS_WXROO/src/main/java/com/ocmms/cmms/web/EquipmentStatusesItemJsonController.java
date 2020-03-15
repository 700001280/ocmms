package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatus;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = EquipmentStatusesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = EquipmentStatus.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class EquipmentStatusesItemJsonController {
}
