package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PreventiveMaintenanceContentsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PreventiveMaintenanceContent.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PreventiveMaintenanceContentsItemThymeleafController implements ConcurrencyManager<PreventiveMaintenanceContent> {
}
