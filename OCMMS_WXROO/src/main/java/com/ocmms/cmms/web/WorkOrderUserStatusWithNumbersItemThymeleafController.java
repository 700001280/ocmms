package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkOrderUserStatusWithNumbersItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderUserStatusWithNumber.class, type = ControllerType.ITEM)
@RooThymeleaf
public class WorkOrderUserStatusWithNumbersItemThymeleafController implements ConcurrencyManager<WorkOrderUserStatusWithNumber> {
}
