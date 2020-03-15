package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.ProjectMemo;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = ProjectMemoesItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProjectMemo.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class ProjectMemoesItemJsonController {
}
