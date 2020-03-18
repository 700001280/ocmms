package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.PartScrappingOutstockDetail;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PartScrappingOutstockDetailsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PartScrappingOutstockDetail.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class PartScrappingOutstockDetailsCollectionJsonController {
}
