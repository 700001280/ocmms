package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.mdrm.MaterialDictionary;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MaterialDictionariesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MaterialDictionary.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MaterialDictionariesItemThymeleafController implements ConcurrencyManager<MaterialDictionary> {
}
