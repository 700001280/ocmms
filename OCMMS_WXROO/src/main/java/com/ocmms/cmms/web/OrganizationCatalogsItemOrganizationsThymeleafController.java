package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.OrganizationCatalog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = OrganizationCatalogsItemOrganizationsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = OrganizationCatalog.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "organizations", views = { "list" })
@RooThymeleaf
public class OrganizationCatalogsItemOrganizationsThymeleafController {
}
