package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Company;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = CompaniesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Company.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class CompaniesCollectionJsonController {
}
