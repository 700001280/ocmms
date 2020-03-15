package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.operation.AutonomousMaintenanceFinding;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = AutonomousMaintenanceFindingsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = AutonomousMaintenanceFinding.class, type = ControllerType.ITEM)
@RooThymeleaf
public class AutonomousMaintenanceFindingsItemThymeleafController implements ConcurrencyManager<AutonomousMaintenanceFinding> {
}
