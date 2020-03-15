package com.ocmms.cmms.web;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = AssetInventoryRecordsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = AssetInventoryRecord.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class AssetInventoryRecordsCollectionJsonController {
}
