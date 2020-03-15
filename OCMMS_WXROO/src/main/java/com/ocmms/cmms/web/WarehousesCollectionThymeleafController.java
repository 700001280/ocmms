package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.Warehouse;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WarehousesCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Warehouse.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class WarehousesCollectionThymeleafController {
}
