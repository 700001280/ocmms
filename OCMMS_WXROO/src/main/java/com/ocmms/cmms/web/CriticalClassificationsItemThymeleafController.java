package com.ocmms.cmms.web;
import com.ocmms.cmms.model.eshem.CriticalClassification;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CriticalClassificationsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = CriticalClassification.class, type = ControllerType.ITEM)
@RooThymeleaf
public class CriticalClassificationsItemThymeleafController implements ConcurrencyManager<CriticalClassification> {
}
