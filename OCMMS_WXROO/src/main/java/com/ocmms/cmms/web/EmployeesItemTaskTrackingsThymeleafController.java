package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Employee;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = EmployeesItemTaskTrackingsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Employee.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "taskTrackings", views = { "list" })
@RooThymeleaf
public class EmployeesItemTaskTrackingsThymeleafController {
}
