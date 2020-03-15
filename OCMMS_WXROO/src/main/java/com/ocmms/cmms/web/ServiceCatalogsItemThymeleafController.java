package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.ServiceCatalog;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ServiceCatalogsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ServiceCatalog.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ServiceCatalogsItemThymeleafController implements ConcurrencyManager<ServiceCatalog> {
}
