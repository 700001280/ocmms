package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoIssueReport;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = LotoIssueReportsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = LotoIssueReport.class, type = ControllerType.ITEM)
@RooThymeleaf
public class LotoIssueReportsItemThymeleafController implements ConcurrencyManager<LotoIssueReport> {
}
