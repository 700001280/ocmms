package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ProcurementOrdersCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProcurementOrder.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class ProcurementOrdersCollectionThymeleafController {
}
