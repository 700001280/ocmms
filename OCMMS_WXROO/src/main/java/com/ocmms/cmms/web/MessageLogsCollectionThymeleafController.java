package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.MessageLog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MessageLogsCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MessageLog.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class MessageLogsCollectionThymeleafController {
}
