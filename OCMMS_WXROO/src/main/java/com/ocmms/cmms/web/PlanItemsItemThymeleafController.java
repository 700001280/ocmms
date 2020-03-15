package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.plan.PlanItem;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PlanItemsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlanItem.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PlanItemsItemThymeleafController implements ConcurrencyManager<PlanItem> {
}
