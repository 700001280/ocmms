package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.storage.RepairMaterialInstockDetail;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = RepairMaterialInstockDetailsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = RepairMaterialInstockDetail.class, type = ControllerType.ITEM)
@RooThymeleaf
public class RepairMaterialInstockDetailsItemThymeleafController implements ConcurrencyManager<RepairMaterialInstockDetail> {
}
