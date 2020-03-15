package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = StorageLocationsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = StorageLocation.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class StorageLocationsCollectionJsonController {
}
