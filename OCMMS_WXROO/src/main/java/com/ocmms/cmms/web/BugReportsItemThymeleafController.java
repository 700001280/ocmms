package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.BugReport;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = BugReportsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = BugReport.class, type = ControllerType.ITEM)
@RooThymeleaf
public class BugReportsItemThymeleafController implements ConcurrencyManager<BugReport> {
}
