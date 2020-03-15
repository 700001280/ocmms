package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithoutNumber;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = NotificationUserStatusWithoutNumbersItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = NotificationUserStatusWithoutNumber.class, type = ControllerType.ITEM)
@RooThymeleaf
public class NotificationUserStatusWithoutNumbersItemThymeleafController implements ConcurrencyManager<NotificationUserStatusWithoutNumber> {
}
