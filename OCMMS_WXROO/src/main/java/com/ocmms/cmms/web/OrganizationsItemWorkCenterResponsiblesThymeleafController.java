package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Organization;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = OrganizationsItemWorkCenterResponsiblesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Organization.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "workCenterResponsibles", views = { "list" })
@RooThymeleaf
public class OrganizationsItemWorkCenterResponsiblesThymeleafController {
}
