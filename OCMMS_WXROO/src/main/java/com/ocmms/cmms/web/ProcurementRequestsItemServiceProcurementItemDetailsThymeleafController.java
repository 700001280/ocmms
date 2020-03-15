package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ProcurementRequestsItemServiceProcurementItemDetailsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ProcurementRequest.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "serviceProcurementItemDetails", views = { "list" })
@RooThymeleaf
public class ProcurementRequestsItemServiceProcurementItemDetailsThymeleafController {
}
