package com.ocmms.cmms.web;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = UnitOfMeasuresItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = UnitOfMeasure.class, type = ControllerType.ITEM)
@RooThymeleaf
public class UnitOfMeasuresItemThymeleafController implements ConcurrencyManager<UnitOfMeasure> {
}
