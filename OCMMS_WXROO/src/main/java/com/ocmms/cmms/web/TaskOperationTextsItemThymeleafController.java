package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskOperationText;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = TaskOperationTextsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskOperationText.class, type = ControllerType.ITEM)
@RooThymeleaf
public class TaskOperationTextsItemThymeleafController implements ConcurrencyManager<TaskOperationText> {
}
