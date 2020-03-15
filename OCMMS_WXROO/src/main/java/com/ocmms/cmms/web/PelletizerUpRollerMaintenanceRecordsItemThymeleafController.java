package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerMaintenanceRecord;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PelletizerUpRollerMaintenanceRecordsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PelletizerUpRollerMaintenanceRecord.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PelletizerUpRollerMaintenanceRecordsItemThymeleafController implements ConcurrencyManager<PelletizerUpRollerMaintenanceRecord> {
}
