package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = EquipmentsItemLotoInfoesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Equipment.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "lotoInfoes", views = { "list" })
@RooThymeleaf
public class EquipmentsItemLotoInfoesThymeleafController {
}
