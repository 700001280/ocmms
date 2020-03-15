package com.ocmms.cmms.web;
import com.ocmms.cmms.model.common.Country;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CountriesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Country.class, type = ControllerType.ITEM)
@RooThymeleaf
public class CountriesItemThymeleafController implements ConcurrencyManager<Country> {
}
