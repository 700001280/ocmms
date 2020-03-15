package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ProcurementRequestsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProcurementRequest.class, type = ControllerType.ITEM)
@RooThymeleaf
public class ProcurementRequestsItemThymeleafController implements ConcurrencyManager<ProcurementRequest> {
}
