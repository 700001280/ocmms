package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.SortField;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = SortFieldsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = SortField.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class SortFieldsItemJsonController {
}
