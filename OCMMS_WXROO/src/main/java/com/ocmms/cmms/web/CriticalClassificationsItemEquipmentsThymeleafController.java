package com.ocmms.cmms.web;
import com.ocmms.cmms.model.eshem.CriticalClassification;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CriticalClassificationsItemEquipmentsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = CriticalClassification.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "equipments", views = { "list" })
@RooThymeleaf
public class CriticalClassificationsItemEquipmentsThymeleafController {
}
