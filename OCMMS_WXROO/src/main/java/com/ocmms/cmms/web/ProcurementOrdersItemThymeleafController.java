package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ProcurementOrdersItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProcurementOrder.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ProcurementOrdersItemThymeleafController implements ConcurrencyManager<ProcurementOrder> {
}
