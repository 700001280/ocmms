package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = ServiceReceiveDetailsItemDocumentsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = ServiceReceiveDetail.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "documents", views = { "list" })
@RooThymeleaf
public class ServiceReceiveDetailsItemDocumentsThymeleafController {
}
