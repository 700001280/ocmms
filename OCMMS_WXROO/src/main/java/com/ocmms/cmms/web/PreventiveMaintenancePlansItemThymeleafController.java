package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PreventiveMaintenancePlan;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PreventiveMaintenancePlansItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PreventiveMaintenancePlan.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PreventiveMaintenancePlansItemThymeleafController implements ConcurrencyManager<PreventiveMaintenancePlan> {
}
