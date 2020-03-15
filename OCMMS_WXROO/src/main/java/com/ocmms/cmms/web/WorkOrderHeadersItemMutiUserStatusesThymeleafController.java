package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkOrderHeadersItemMutiUserStatusesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderHeader.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "mutiUserStatuses", views = { "list" })
@RooThymeleaf
public class WorkOrderHeadersItemMutiUserStatusesThymeleafController {
}
