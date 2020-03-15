package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskHeader;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = TaskHeadersItemTaskHeaderTextsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskHeader.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "taskHeaderTexts", views = { "list" })
@RooThymeleaf
public class TaskHeadersItemTaskHeaderTextsThymeleafController {
}
