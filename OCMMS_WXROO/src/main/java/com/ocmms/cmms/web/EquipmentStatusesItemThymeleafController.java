package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatus;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = EquipmentStatusesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = EquipmentStatus.class, type = ControllerType.ITEM)
@RooThymeleaf
public class EquipmentStatusesItemThymeleafController implements ConcurrencyManager<EquipmentStatus> {
}
