package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithNumber;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = NotificationUserStatusWithNumbersItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationUserStatusWithNumber.class, type = ControllerType.ITEM)
@RooThymeleaf
public class NotificationUserStatusWithNumbersItemThymeleafController implements ConcurrencyManager<NotificationUserStatusWithNumber> {
}
