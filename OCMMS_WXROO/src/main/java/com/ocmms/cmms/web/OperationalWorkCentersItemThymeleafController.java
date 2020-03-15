package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = OperationalWorkCentersItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = OperationalWorkCenter.class, type = ControllerType.ITEM)
@RooThymeleaf
public class OperationalWorkCentersItemThymeleafController implements ConcurrencyManager<OperationalWorkCenter> {
}
