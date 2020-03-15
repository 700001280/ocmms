package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.FailureDamageCause;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = FailureDamageCausesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = FailureDamageCause.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class FailureDamageCausesCollectionJsonController {
}
