package com.ocmms.cmms.web;
import com.ocmms.cmms.model.srm.Vendor;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = VendorsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Vendor.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class VendorsCollectionJsonController {
}
