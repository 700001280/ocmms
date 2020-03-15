package com.ocmms.cmms.web;
import com.ocmms.cmms.model.fico.CostCenter;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CostCentersItemEmployeesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = CostCenter.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "employees", views = { "list" })
@RooThymeleaf
public class CostCentersItemEmployeesThymeleafController {
}
