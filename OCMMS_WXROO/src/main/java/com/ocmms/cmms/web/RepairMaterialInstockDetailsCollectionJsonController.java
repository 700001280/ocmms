package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.RepairMaterialInstockDetail;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = RepairMaterialInstockDetailsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = RepairMaterialInstockDetail.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class RepairMaterialInstockDetailsCollectionJsonController {
}
