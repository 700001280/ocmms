package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.OrganizationCatalog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = OrganizationCatalogsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = OrganizationCatalog.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class OrganizationCatalogsItemJsonController {
}
