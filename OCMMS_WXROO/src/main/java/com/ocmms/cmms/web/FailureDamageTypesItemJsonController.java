package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.FailureDamageType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = FailureDamageTypesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = FailureDamageType.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class FailureDamageTypesItemJsonController {
}
