package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.Elevator;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ElevatorsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Elevator.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ElevatorsItemThymeleafController implements ConcurrencyManager<Elevator> {
}
