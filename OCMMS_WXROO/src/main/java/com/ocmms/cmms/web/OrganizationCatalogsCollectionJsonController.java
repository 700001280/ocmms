package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.OrganizationCatalog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = OrganizationCatalogsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = OrganizationCatalog.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class OrganizationCatalogsCollectionJsonController {
}
