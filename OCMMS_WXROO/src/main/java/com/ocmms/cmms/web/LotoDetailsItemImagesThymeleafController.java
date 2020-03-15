package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoDetail;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = LotoDetailsItemImagesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = LotoDetail.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "images", views = { "list" })
@RooThymeleaf
public class LotoDetailsItemImagesThymeleafController {
}
