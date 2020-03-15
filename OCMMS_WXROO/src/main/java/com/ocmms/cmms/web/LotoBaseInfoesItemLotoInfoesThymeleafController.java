package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoBaseInfo;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = LotoBaseInfoesItemLotoInfoesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = LotoBaseInfo.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "lotoInfoes", views = { "list" })
@RooThymeleaf
public class LotoBaseInfoesItemLotoInfoesThymeleafController {
}
