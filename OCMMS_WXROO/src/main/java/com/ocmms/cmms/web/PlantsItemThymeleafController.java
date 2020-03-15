package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.Plant;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PlantsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Plant.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PlantsItemThymeleafController implements ConcurrencyManager<Plant> {
}
