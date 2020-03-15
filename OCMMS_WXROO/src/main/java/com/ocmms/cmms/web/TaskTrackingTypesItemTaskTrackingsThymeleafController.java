package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.TaskTrackingType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = TaskTrackingTypesItemTaskTrackingsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskTrackingType.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "taskTrackings", views = { "list" })
@RooThymeleaf
public class TaskTrackingTypesItemTaskTrackingsThymeleafController {
}
