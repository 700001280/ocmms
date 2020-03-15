package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkOrderOperationsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderOperation.class, type = ControllerType.ITEM)
@RooThymeleaf
public class WorkOrderOperationsItemThymeleafController implements ConcurrencyManager<WorkOrderOperation> {
}
