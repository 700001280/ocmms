package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = EquipmentsItemAssetStatusChangeRecordsThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Equipment.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "assetStatusChangeRecords", views = { "list" })
@RooThymeleaf
public class EquipmentsItemAssetStatusChangeRecordsThymeleafController {
}
