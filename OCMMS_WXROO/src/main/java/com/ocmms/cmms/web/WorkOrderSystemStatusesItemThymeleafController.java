package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderSystemStatus;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkOrderSystemStatusesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderSystemStatus.class, type = ControllerType.ITEM)
@RooThymeleaf
public class WorkOrderSystemStatusesItemThymeleafController implements ConcurrencyManager<WorkOrderSystemStatus> {
}
