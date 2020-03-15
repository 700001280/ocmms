package com.ocmms.cmms.web;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = MaterialProcurementItemDetailsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = MaterialProcurementItemDetail.class, type = ControllerType.ITEM)
@RooThymeleaf
public class MaterialProcurementItemDetailsItemThymeleafController implements ConcurrencyManager<MaterialProcurementItemDetail> {
}
