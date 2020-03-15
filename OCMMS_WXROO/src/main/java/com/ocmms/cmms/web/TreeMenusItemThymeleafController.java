package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.TreeMenu;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = TreeMenusItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TreeMenu.class, type = ControllerType.ITEM)
@RooThymeleaf
public class TreeMenusItemThymeleafController implements ConcurrencyManager<TreeMenu> {
}
