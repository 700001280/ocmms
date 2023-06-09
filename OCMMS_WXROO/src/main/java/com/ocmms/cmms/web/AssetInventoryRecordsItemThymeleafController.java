package com.ocmms.cmms.web;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = AssetInventoryRecordsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = AssetInventoryRecord.class, type = ControllerType.ITEM)
@RooThymeleaf
public class AssetInventoryRecordsItemThymeleafController implements ConcurrencyManager<AssetInventoryRecord> {
}
