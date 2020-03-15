package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.TreeMenu;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = TreeMenusItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TreeMenu.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class TreeMenusItemJsonController {
}
