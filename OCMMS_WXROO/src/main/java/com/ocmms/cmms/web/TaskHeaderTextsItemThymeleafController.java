package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskHeaderText;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = TaskHeaderTextsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskHeaderText.class, type = ControllerType.ITEM)
@RooThymeleaf
public class TaskHeaderTextsItemThymeleafController implements ConcurrencyManager<TaskHeaderText> {
}
