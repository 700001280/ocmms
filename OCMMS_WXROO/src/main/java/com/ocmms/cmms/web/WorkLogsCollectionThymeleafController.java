package com.ocmms.cmms.web;
import com.ocmms.cmms.model.assistance.WorkLog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkLogsCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkLog.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class WorkLogsCollectionThymeleafController {
}
