package com.ocmms.cmms.web;
import com.ocmms.cmms.model.asset.AssetStatusChangeRecord;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = AssetStatusChangeRecordsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = AssetStatusChangeRecord.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class AssetStatusChangeRecordsCollectionJsonController {
}
