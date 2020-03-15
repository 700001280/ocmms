package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ServiceProcurementItemDetailsItemServiceReceiveDetailsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ServiceProcurementItemDetail.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "serviceReceiveDetails", views = { "list" })
@RooThymeleaf
public class ServiceProcurementItemDetailsItemServiceReceiveDetailsThymeleafController {
}
