package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MaterialCatalogsItemMaterialStorageLocationInfosThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MaterialCatalog.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "materialStorageLocationInfos", views = { "list" })
@RooThymeleaf
public class MaterialCatalogsItemMaterialStorageLocationInfosThymeleafController {
}
