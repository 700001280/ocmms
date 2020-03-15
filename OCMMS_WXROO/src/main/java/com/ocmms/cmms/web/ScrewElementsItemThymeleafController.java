package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.ScrewElement;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ScrewElementsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ScrewElement.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ScrewElementsItemThymeleafController implements ConcurrencyManager<ScrewElement> {
}
