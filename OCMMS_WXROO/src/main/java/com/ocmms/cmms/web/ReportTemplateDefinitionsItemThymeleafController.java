package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.ReportTemplateDefinition;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ReportTemplateDefinitionsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ReportTemplateDefinition.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ReportTemplateDefinitionsItemThymeleafController implements ConcurrencyManager<ReportTemplateDefinition> {
}
