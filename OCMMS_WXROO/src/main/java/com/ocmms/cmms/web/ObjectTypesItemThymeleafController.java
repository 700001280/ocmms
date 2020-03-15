package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.ObjectType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ObjectTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ObjectType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ObjectTypesItemThymeleafController implements ConcurrencyManager<ObjectType> {
}
