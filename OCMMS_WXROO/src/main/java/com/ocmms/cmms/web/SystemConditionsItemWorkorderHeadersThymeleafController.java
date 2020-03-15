package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = SystemConditionsItemWorkorderHeadersThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = SystemCondition.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "workorderHeaders", views = { "list" })
@RooThymeleaf
public class SystemConditionsItemWorkorderHeadersThymeleafController {
}
