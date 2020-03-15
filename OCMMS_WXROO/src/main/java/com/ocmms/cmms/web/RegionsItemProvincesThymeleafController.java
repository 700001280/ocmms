package com.ocmms.cmms.web;
import com.ocmms.cmms.model.common.Region;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = RegionsItemProvincesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Region.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "provinces", views = { "list" })
@RooThymeleaf
public class RegionsItemProvincesThymeleafController {
}
