package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.routine.PartScrappingRecord;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PartScrappingRecordsItemImagesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PartScrappingRecord.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "images", views = { "list" })
@RooThymeleaf
public class PartScrappingRecordsItemImagesThymeleafController {
}
