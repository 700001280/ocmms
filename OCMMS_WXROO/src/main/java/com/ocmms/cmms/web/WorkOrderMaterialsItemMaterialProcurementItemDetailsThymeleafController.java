package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkOrderMaterialsItemMaterialProcurementItemDetailsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderMaterial.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "materialProcurementItemDetails", views = { "list" })
@RooThymeleaf
public class WorkOrderMaterialsItemMaterialProcurementItemDetailsThymeleafController {
}
