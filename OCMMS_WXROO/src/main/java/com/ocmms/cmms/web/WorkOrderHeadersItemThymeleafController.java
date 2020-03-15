package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkOrderHeadersItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderHeader.class, type = ControllerType.ITEM)
@RooThymeleaf
public class WorkOrderHeadersItemThymeleafController implements ConcurrencyManager<WorkOrderHeader> {
}
