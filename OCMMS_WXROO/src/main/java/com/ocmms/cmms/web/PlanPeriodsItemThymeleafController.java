package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PlanPeriod;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PlanPeriodsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlanPeriod.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PlanPeriodsItemThymeleafController implements ConcurrencyManager<PlanPeriod> {
}
