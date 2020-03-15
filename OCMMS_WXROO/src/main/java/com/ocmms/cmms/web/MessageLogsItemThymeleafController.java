package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.MessageLog;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MessageLogsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MessageLog.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MessageLogsItemThymeleafController implements ConcurrencyManager<MessageLog> {
}
