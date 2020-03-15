package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.measuringpoint.Medium;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MediumsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Medium.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MediumsItemThymeleafController implements ConcurrencyManager<Medium> {
}
