package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Company;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CompaniesCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Company.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class CompaniesCollectionThymeleafController {
}
