package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderSystemStatus;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = WorkOrderSystemStatusesCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderSystemStatus.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class WorkOrderSystemStatusesCollectionJsonController {
}
