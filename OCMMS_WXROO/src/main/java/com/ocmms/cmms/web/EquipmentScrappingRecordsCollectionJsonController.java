package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.EquipmentScrappingRecord;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;

/**
 * = EquipmentScrappingRecordsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = EquipmentScrappingRecord.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class EquipmentScrappingRecordsCollectionJsonController {
}
