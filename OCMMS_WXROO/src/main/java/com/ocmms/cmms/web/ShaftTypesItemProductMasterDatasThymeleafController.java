package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pp.configuration.ShaftType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ShaftTypesItemProductMasterDatasThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ShaftType.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "productMasterDatas", views = { "list" })
@RooThymeleaf
public class ShaftTypesItemProductMasterDatasThymeleafController {
}
