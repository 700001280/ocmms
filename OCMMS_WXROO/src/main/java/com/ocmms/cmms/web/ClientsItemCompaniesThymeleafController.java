package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Client;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ClientsItemCompaniesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Client.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "companies", views = { "list" })
@RooThymeleaf
public class ClientsItemCompaniesThymeleafController {
}
