package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.EquipmentReplaceRecord;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = EquipmentReplaceRecordsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = EquipmentReplaceRecord.class, type = ControllerType.ITEM)
@RooThymeleaf
public class EquipmentReplaceRecordsItemThymeleafController implements ConcurrencyManager<EquipmentReplaceRecord> {
}
