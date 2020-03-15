package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.OperationRelationship;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = OperationRelationshipsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = OperationRelationship.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class OperationRelationshipsCollectionJsonController {
}
