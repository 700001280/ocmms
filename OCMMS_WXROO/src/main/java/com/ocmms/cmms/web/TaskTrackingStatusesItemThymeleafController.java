package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.TaskTrackingStatus;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = TaskTrackingStatusesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskTrackingStatus.class, type = ControllerType.ITEM)
@RooThymeleaf
public class TaskTrackingStatusesItemThymeleafController implements ConcurrencyManager<TaskTrackingStatus> {
}
