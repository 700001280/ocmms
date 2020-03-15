package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.FailureDamageType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = FailureDamageTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = FailureDamageType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class FailureDamageTypesItemThymeleafController implements ConcurrencyManager<FailureDamageType> {
}
