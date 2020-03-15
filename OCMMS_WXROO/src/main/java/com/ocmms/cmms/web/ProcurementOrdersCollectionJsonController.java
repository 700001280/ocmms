package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ProcurementOrdersCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProcurementOrder.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class ProcurementOrdersCollectionJsonController {
}
