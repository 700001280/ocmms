package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.CatalogType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = CatalogTypesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = CatalogType.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class CatalogTypesCollectionJsonController {
}
