package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.OrganizationCatalog;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = OrganizationCatalogsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = OrganizationCatalog.class, type = ControllerType.ITEM)
@RooThymeleaf
public class OrganizationCatalogsItemThymeleafController implements ConcurrencyManager<OrganizationCatalog> {
}
