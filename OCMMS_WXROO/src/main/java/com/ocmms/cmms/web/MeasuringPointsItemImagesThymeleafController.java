package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringPoint;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooDetail;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MeasuringPointsItemImagesThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MeasuringPoint.class, type = ControllerType.DETAIL)
@RooDetail(relationField = "images", views = { "list" })
@RooThymeleaf
public class MeasuringPointsItemImagesThymeleafController {
}
