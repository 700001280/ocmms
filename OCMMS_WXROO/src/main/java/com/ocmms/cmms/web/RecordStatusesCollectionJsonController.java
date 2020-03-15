package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.RecordStatus;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = RecordStatusesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = RecordStatus.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class RecordStatusesCollectionJsonController {
}
