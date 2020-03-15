package com.ocmms.cmms.web;
import com.ocmms.cmms.model.common.Address;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = AddressesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Address.class, type = ControllerType.ITEM)
@RooThymeleaf
public class AddressesItemThymeleafController implements ConcurrencyManager<Address> {
}
