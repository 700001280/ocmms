package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = OutstockDetailsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = OutstockDetail.class, type = ControllerType.ITEM)
@RooThymeleaf
public class OutstockDetailsItemThymeleafController implements ConcurrencyManager<OutstockDetail> {
}
