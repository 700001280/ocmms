package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringPoint;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MeasuringPointsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MeasuringPoint.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MeasuringPointsItemThymeleafController implements ConcurrencyManager<MeasuringPoint> {
}
