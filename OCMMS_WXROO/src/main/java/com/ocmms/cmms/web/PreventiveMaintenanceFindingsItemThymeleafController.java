package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PreventiveMaintenanceFinding;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PreventiveMaintenanceFindingsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PreventiveMaintenanceFinding.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PreventiveMaintenanceFindingsItemThymeleafController implements ConcurrencyManager<PreventiveMaintenanceFinding> {
}
