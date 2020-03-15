package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.TaskTrackingType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = TaskTrackingTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskTrackingType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class TaskTrackingTypesItemThymeleafController implements ConcurrencyManager<TaskTrackingType> {
}
