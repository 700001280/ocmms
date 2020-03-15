package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = EquipmentMaintenanceRecordsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = EquipmentMaintenanceRecord.class, type = ControllerType.ITEM)
@RooThymeleaf
public class EquipmentMaintenanceRecordsItemThymeleafController implements ConcurrencyManager<EquipmentMaintenanceRecord> {
}
