package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.operation.FailureMaintenanceReport;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = FailureMaintenanceReportsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = FailureMaintenanceReport.class, type = ControllerType.ITEM)
@RooThymeleaf
public class FailureMaintenanceReportsItemThymeleafController implements ConcurrencyManager<FailureMaintenanceReport> {
}
