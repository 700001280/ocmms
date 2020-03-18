package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.PartScrappingOutstockDetail;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = PartScrappingOutstockDetailsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = PartScrappingOutstockDetail.class, type = ControllerType.ITEM)
@RooThymeleaf
public class PartScrappingOutstockDetailsItemThymeleafController implements ConcurrencyManager<PartScrappingOutstockDetail> {
}
