package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.configuration.ProductType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ProductTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProductType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ProductTypesItemThymeleafController implements ConcurrencyManager<ProductType> {
}
