package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MeasuringTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MeasuringType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MeasuringTypesItemThymeleafController implements ConcurrencyManager<MeasuringType> {
}
