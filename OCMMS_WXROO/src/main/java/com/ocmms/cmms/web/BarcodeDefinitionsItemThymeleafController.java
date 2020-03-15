package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.BarcodeDefinition;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = BarcodeDefinitionsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = BarcodeDefinition.class, type = ControllerType.ITEM)
@RooThymeleaf
public class BarcodeDefinitionsItemThymeleafController implements ConcurrencyManager<BarcodeDefinition> {
}
