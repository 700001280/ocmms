package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.Hoist;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = HoistsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Hoist.class, type = ControllerType.ITEM)
@RooThymeleaf
public class HoistsItemThymeleafController implements ConcurrencyManager<Hoist> {
}
