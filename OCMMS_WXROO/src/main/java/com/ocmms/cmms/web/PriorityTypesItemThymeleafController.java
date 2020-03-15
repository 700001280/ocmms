package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.PriorityType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PriorityTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PriorityType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PriorityTypesItemThymeleafController implements ConcurrencyManager<PriorityType> {
}
