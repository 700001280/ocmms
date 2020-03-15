package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Company;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CompaniesItemPlantsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Company.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "plants", views = { "list" })
@RooThymeleaf
public class CompaniesItemPlantsThymeleafController {
}
