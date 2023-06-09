package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PlantSectionsItemEquipmentsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlantSection.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "equipments", views = { "list" })
@RooThymeleaf
public class PlantSectionsItemEquipmentsThymeleafController {
}
