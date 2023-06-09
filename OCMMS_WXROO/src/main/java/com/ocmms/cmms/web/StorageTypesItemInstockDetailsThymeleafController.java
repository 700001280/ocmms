package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.StorageType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = StorageTypesItemInstockDetailsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = StorageType.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "instockDetails", views = { "list" })
@RooThymeleaf
public class StorageTypesItemInstockDetailsThymeleafController {
}
