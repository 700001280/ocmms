package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PartMaintenanceRecordsItemRepairMaterialInstockDetailsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PartMaintenanceRecord.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "repairMaterialInstockDetails", views = { "list" })
@RooThymeleaf
public class PartMaintenanceRecordsItemRepairMaterialInstockDetailsThymeleafController {
}
