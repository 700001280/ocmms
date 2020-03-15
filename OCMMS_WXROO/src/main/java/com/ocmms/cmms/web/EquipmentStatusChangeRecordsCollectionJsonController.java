package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatusChangeRecord;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = EquipmentStatusChangeRecordsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = EquipmentStatusChangeRecord.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class EquipmentStatusChangeRecordsCollectionJsonController {
}
