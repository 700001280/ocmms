package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.InstockType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = InstockTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = InstockType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class InstockTypesItemThymeleafController implements ConcurrencyManager<InstockType> {
}
