package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderControlkey;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = WorkOrderControlkeysItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderControlkey.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class WorkOrderControlkeysItemJsonController {
}
