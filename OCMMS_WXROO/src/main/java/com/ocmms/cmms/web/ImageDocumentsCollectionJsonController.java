package com.ocmms.cmms.web;
import com.ocmms.cmms.model.edm.ImageDocument;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ImageDocumentsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ImageDocument.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class ImageDocumentsCollectionJsonController {
}
