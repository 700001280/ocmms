package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Department;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = DepartmentsItemMaintWorkCentersThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Department.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "maintWorkCenters", views = { "list" })
@RooThymeleaf
public class DepartmentsItemMaintWorkCentersThymeleafController {
}
