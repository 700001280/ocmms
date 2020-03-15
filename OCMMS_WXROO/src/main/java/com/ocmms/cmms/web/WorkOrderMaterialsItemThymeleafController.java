package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = WorkOrderMaterialsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = WorkOrderMaterial.class, type = ControllerType.ITEM)
@RooThymeleaf
public class WorkOrderMaterialsItemThymeleafController implements ConcurrencyManager<WorkOrderMaterial> {
}
