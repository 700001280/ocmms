package com.ocmms.cmms.web;
import com.ocmms.cmms.model.fico.CostCenter;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CostCentersItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = CostCenter.class, type = ControllerType.ITEM)
@RooThymeleaf
public class CostCentersItemThymeleafController implements ConcurrencyManager<CostCenter> {
}
