package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = MaterialStorageLocationInfoesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MaterialStorageLocationInfo.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class MaterialStorageLocationInfoesCollectionJsonController {
}
