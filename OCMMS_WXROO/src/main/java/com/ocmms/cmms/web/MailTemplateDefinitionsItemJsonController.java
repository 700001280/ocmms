package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.MailTemplateDefinition;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = MailTemplateDefinitionsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MailTemplateDefinition.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class MailTemplateDefinitionsItemJsonController {
}
