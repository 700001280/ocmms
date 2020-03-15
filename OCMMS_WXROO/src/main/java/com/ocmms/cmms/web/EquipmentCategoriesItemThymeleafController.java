package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentCategory;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = EquipmentCategoriesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = EquipmentCategory.class, type = ControllerType.ITEM)
@RooThymeleaf
public class EquipmentCategoriesItemThymeleafController implements ConcurrencyManager<EquipmentCategory> {
}
