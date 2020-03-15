package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.CatalogType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CatalogTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = CatalogType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class CatalogTypesItemThymeleafController implements ConcurrencyManager<CatalogType> {
}
