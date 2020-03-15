package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.MachineWorkCenter;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MachineWorkCentersItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MachineWorkCenter.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MachineWorkCentersItemThymeleafController implements ConcurrencyManager<MachineWorkCenter> {
}
