package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = WorkOrderMaterialsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderMaterial.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class WorkOrderMaterialsCollectionJsonController {
}
