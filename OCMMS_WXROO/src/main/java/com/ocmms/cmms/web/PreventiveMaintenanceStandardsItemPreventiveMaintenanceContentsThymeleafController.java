package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PreventiveMaintenanceStandardsItemPreventiveMaintenanceContentsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PreventiveMaintenanceStandard.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "preventiveMaintenanceContents", views = { "list" })
@RooThymeleaf
public class PreventiveMaintenanceStandardsItemPreventiveMaintenanceContentsThymeleafController {
}
