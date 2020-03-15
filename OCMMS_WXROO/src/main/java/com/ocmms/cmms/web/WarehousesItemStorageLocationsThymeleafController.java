package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.Warehouse;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WarehousesItemStorageLocationsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Warehouse.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "storageLocations", views = { "list" })
@RooThymeleaf
public class WarehousesItemStorageLocationsThymeleafController {
}
