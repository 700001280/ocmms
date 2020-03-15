package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PlannerGroupsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PlannerGroup.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PlannerGroupsItemThymeleafController implements ConcurrencyManager<PlannerGroup> {
}
