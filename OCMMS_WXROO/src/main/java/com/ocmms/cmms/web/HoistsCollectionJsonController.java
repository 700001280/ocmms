package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.Hoist;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = HoistsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Hoist.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class HoistsCollectionJsonController {
}
