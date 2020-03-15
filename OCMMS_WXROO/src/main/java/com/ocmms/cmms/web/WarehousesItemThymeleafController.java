package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.Warehouse;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WarehousesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Warehouse.class, type = ControllerType.ITEM)
@RooThymeleaf
public class WarehousesItemThymeleafController implements ConcurrencyManager<Warehouse> {
}
