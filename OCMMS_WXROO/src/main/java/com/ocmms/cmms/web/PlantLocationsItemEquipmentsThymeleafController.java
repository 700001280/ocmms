package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PlantLocationsItemEquipmentsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlantLocation.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "equipments", views = { "list" })
@RooThymeleaf
public class PlantLocationsItemEquipmentsThymeleafController {
}
