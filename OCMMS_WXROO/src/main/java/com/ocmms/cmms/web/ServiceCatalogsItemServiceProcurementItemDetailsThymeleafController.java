package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.ServiceCatalog;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ServiceCatalogsItemServiceProcurementItemDetailsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ServiceCatalog.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "serviceProcurementItemDetails", views = { "list" })
@RooThymeleaf
public class ServiceCatalogsItemServiceProcurementItemDetailsThymeleafController {
}
