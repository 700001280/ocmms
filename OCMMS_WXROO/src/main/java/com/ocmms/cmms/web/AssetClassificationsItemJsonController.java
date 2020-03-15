package com.ocmms.cmms.web;
import com.ocmms.cmms.model.asset.AssetClassification;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = AssetClassificationsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = AssetClassification.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class AssetClassificationsItemJsonController {
}
