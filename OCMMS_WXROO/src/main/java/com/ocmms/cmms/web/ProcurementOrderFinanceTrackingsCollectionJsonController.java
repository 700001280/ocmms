package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrderFinanceTracking;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ProcurementOrderFinanceTrackingsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProcurementOrderFinanceTracking.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class ProcurementOrderFinanceTrackingsCollectionJsonController {
}
