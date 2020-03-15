package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.AuthourizationGroup;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = AuthourizationGroupsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = AuthourizationGroup.class, type = ControllerType.ITEM)
@RooThymeleaf
public class AuthourizationGroupsItemThymeleafController implements ConcurrencyManager<AuthourizationGroup> {
}
