package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.ExtruderShaftReplaceRecord;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ExtruderShaftReplaceRecordsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ExtruderShaftReplaceRecord.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ExtruderShaftReplaceRecordsItemThymeleafController implements ConcurrencyManager<ExtruderShaftReplaceRecord> {
}
