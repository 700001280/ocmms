package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.IsolationMethod;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = IsolationMethodsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = IsolationMethod.class, type = ControllerType.ITEM)
@RooThymeleaf
public class IsolationMethodsItemThymeleafController implements ConcurrencyManager<IsolationMethod> {
}
