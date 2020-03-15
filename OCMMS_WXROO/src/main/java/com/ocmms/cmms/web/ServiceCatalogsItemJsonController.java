package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.ServiceCatalog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ServiceCatalogsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ServiceCatalog.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class ServiceCatalogsItemJsonController {
}
