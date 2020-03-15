package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PlantLocationsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlantLocation.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PlantLocationsItemThymeleafController implements ConcurrencyManager<PlantLocation> {
}
