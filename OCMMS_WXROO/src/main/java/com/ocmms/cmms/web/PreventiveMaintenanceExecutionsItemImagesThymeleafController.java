package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceExecution;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PreventiveMaintenanceExecutionsItemImagesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PreventiveMaintenanceExecution.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "images", views = { "list" })
@RooThymeleaf
public class PreventiveMaintenanceExecutionsItemImagesThymeleafController {
}
