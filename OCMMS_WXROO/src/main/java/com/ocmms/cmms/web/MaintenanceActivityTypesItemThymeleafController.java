package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MaintenanceActivityTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MaintenanceActivityType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MaintenanceActivityTypesItemThymeleafController implements ConcurrencyManager<MaintenanceActivityType> {
}
