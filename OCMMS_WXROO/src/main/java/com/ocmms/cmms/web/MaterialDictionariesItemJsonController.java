package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.mdrm.MaterialDictionary;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = MaterialDictionariesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MaterialDictionary.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class MaterialDictionariesItemJsonController {
}
