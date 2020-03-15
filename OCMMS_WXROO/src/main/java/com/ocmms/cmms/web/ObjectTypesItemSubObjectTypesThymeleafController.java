package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.ObjectType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ObjectTypesItemSubObjectTypesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ObjectType.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "subObjectTypes", views = { "list" })
@RooThymeleaf
public class ObjectTypesItemSubObjectTypesThymeleafController {
}
