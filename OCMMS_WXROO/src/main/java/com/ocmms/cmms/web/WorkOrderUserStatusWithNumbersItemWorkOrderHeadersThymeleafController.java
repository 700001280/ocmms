package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkOrderUserStatusWithNumbersItemWorkOrderHeadersThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderUserStatusWithNumber.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "workOrderHeaders", views = { "list" })
@RooThymeleaf
public class WorkOrderUserStatusWithNumbersItemWorkOrderHeadersThymeleafController {
}
