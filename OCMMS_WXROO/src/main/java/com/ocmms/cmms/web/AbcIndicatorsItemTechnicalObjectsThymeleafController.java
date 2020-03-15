package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.AbcIndicator;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = AbcIndicatorsItemTechnicalObjectsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = AbcIndicator.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "technicalObjects", views = { "list" })
@RooThymeleaf
public class AbcIndicatorsItemTechnicalObjectsThymeleafController {
}
