package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.PurchaseExpedite;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = PurchaseExpeditesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PurchaseExpedite.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class PurchaseExpeditesItemJsonController {
}
