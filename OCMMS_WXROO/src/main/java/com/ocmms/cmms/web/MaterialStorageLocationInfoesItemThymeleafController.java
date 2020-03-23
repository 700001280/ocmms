package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MaterialStorageLocationInfoesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MaterialStorageLocationInfo.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MaterialStorageLocationInfoesItemThymeleafController implements ConcurrencyManager<MaterialStorageLocationInfo> {
}
