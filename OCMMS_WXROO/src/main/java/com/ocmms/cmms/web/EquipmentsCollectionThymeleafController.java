package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = EquipmentsCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Equipment.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class EquipmentsCollectionThymeleafController {
}
