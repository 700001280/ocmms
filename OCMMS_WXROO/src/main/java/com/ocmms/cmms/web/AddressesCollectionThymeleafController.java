package com.ocmms.cmms.web;
import com.ocmms.cmms.model.common.Address;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = AddressesCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Address.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class AddressesCollectionThymeleafController {
}
