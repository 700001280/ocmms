package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MaterialInstockDetailsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MaterialInstockDetail.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MaterialInstockDetailsItemThymeleafController implements ConcurrencyManager<MaterialInstockDetail> {
}
