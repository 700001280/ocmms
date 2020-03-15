package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.OrgComInformation;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = OrgComInformationsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = OrgComInformation.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class OrgComInformationsCollectionJsonController {
}
