package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.MovementType;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MovementTypesItemOutstockDetailsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MovementType.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "outstockDetails", views = { "list" })
@RooThymeleaf
public class MovementTypesItemOutstockDetailsThymeleafController {
}
