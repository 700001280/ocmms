package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.MailTemplateDefinition;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = MailTemplateDefinitionsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MailTemplateDefinition.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class MailTemplateDefinitionsCollectionJsonController {
}
