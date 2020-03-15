package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.WorkLog;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkLogsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkLog.class, type = ControllerType.ITEM)
@RooThymeleaf
public class WorkLogsItemThymeleafController implements ConcurrencyManager<WorkLog> {
}
