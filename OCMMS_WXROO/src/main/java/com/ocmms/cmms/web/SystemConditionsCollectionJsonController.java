package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = SystemConditionsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = SystemCondition.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class SystemConditionsCollectionJsonController {
}
