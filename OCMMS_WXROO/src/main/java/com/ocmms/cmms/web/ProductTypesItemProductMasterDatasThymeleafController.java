package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.configuration.ProductType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ProductTypesItemProductMasterDatasThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProductType.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "productMasterDatas", views = { "list" })
@RooThymeleaf
public class ProductTypesItemProductMasterDatasThymeleafController {
}
