package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoInfo;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = LotoInfoesItemLotoIssueReportsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = LotoInfo.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "lotoIssueReports", views = { "list" })
@RooThymeleaf
public class LotoInfoesItemLotoIssueReportsThymeleafController {
}
