package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PlanItem;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PlanItemsCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlanItem.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class PlanItemsCollectionThymeleafController {
}
