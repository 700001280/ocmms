package com.ocmms.cmms.web;
import com.ocmms.cmms.model.loto.LotoDetail;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = LotoDetailsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = LotoDetail.class, type = ControllerType.ITEM)
@RooThymeleaf
public class LotoDetailsItemThymeleafController implements ConcurrencyManager<LotoDetail> {
}
