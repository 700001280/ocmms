package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskHeader;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = TaskHeadersItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskHeader.class, type = ControllerType.ITEM)
@RooThymeleaf
public class TaskHeadersItemThymeleafController implements ConcurrencyManager<TaskHeader> {
}
