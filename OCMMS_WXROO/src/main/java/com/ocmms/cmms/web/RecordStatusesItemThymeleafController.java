package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.RecordStatus;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = RecordStatusesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = RecordStatus.class, type = ControllerType.ITEM)
@RooThymeleaf
public class RecordStatusesItemThymeleafController implements ConcurrencyManager<RecordStatus> {
}
