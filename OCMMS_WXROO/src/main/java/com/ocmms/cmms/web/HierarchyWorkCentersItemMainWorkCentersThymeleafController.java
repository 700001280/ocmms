package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = HierarchyWorkCentersItemMainWorkCentersThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = HierarchyWorkCenter.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "mainWorkCenters", views = { "list" })
@RooThymeleaf
public class HierarchyWorkCentersItemMainWorkCentersThymeleafController {
}
