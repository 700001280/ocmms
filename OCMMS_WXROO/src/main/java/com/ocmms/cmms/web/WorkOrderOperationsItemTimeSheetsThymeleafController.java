package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkOrderOperationsItemTimeSheetsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderOperation.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "timeSheets", views = { "list" })
@RooThymeleaf
public class WorkOrderOperationsItemTimeSheetsThymeleafController {
}
