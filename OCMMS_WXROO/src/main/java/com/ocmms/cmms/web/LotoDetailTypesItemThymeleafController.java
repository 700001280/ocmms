package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoDetailType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = LotoDetailTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = LotoDetailType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class LotoDetailTypesItemThymeleafController implements ConcurrencyManager<LotoDetailType> {
}
