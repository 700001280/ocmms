package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.MaterialType;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MaterialTypesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MaterialType.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MaterialTypesItemThymeleafController implements ConcurrencyManager<MaterialType> {
}
