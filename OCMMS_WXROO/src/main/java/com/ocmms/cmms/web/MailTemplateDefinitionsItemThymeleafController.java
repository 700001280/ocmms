package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.MailTemplateDefinition;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MailTemplateDefinitionsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MailTemplateDefinition.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MailTemplateDefinitionsItemThymeleafController implements ConcurrencyManager<MailTemplateDefinition> {
}
