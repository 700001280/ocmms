package com.ocmms.cmms.web;
import com.ocmms.cmms.model.common.City;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CitiesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = City.class, type = ControllerType.ITEM)
@RooThymeleaf
public class CitiesItemThymeleafController implements ConcurrencyManager<City> {
}
