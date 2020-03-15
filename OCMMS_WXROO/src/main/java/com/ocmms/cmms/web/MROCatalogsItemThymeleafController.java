package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.master.MROCatalog;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MROCatalogsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MROCatalog.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MROCatalogsItemThymeleafController implements ConcurrencyManager<MROCatalog> {
}
