package com.ocmms.cmms.web;
import com.ocmms.cmms.model.fico.CostCenter;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = CostCentersItemDocumentsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = CostCenter.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "documents", views = { "list" })
@RooThymeleaf
public class CostCentersItemDocumentsThymeleafController {
}
