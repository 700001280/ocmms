package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ServiceProcurementItemDetailsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ServiceProcurementItemDetail.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class ServiceProcurementItemDetailsCollectionJsonController {
}
