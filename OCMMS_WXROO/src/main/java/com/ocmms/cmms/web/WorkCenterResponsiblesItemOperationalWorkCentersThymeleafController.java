package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkCenterResponsiblesItemOperationalWorkCentersThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkCenterResponsible.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "operationalWorkCenters", views = { "list" })
@RooThymeleaf
public class WorkCenterResponsiblesItemOperationalWorkCentersThymeleafController {
}
