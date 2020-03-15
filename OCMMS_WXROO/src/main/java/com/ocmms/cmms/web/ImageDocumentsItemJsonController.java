package com.ocmms.cmms.web;
import com.ocmms.cmms.model.edm.ImageDocument;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ImageDocumentsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ImageDocument.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class ImageDocumentsItemJsonController {
}
