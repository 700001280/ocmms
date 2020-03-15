package com.ocmms.cmms.web;
import com.ocmms.cmms.model.hrm.OrgComInformation;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = OrgComInformationsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = OrgComInformation.class, type = ControllerType.ITEM)
@RooThymeleaf
public class OrgComInformationsItemThymeleafController implements ConcurrencyManager<OrgComInformation> {
}
