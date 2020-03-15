package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.BugReport;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = BugReportsItemDocumentsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = BugReport.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "documents", views = { "list" })
@RooThymeleaf
public class BugReportsItemDocumentsThymeleafController {
}
