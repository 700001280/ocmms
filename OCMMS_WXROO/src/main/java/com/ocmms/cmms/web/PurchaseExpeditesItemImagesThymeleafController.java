package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.PurchaseExpedite;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PurchaseExpeditesItemImagesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PurchaseExpedite.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "images", views = { "list" })
@RooThymeleaf
public class PurchaseExpeditesItemImagesThymeleafController {
}
