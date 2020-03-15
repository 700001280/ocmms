package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ProcurementItemDetailsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProcurementItemDetail.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class ProcurementItemDetailsCollectionJsonController {
}
