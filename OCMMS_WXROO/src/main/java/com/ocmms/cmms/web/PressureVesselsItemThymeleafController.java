package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureVessel;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PressureVesselsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PressureVessel.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PressureVesselsItemThymeleafController implements ConcurrencyManager<PressureVessel> {
}
