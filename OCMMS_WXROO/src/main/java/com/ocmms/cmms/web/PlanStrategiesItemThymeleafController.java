package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PlanStrategy;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PlanStrategiesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlanStrategy.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PlanStrategiesItemThymeleafController implements ConcurrencyManager<PlanStrategy> {
}
