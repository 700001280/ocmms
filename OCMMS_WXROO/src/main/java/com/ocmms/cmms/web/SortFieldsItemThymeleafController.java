package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.SortField;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = SortFieldsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = SortField.class, type = ControllerType.ITEM)
@RooThymeleaf
public class SortFieldsItemThymeleafController implements ConcurrencyManager<SortField> {
}
