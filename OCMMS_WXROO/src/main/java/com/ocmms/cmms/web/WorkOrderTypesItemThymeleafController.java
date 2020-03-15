package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkOrderTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class WorkOrderTypesItemThymeleafController implements ConcurrencyManager<WorkOrderType> {
}
