package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Company;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CompaniesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Company.class, type = ControllerType.ITEM)
@RooThymeleaf
public class CompaniesItemThymeleafController implements ConcurrencyManager<Company> {
}
