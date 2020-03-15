package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = TechnicalObjectsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TechnicalObject.class, type = ControllerType.ITEM)
@RooThymeleaf
public class TechnicalObjectsItemThymeleafController implements ConcurrencyManager<TechnicalObject> {
}
