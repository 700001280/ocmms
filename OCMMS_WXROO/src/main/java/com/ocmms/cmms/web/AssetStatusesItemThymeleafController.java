package com.ocmms.cmms.web;
import com.ocmms.cmms.model.asset.AssetStatus;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = AssetStatusesItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = AssetStatus.class, type = ControllerType.ITEM)
@RooThymeleaf
public class AssetStatusesItemThymeleafController implements ConcurrencyManager<AssetStatus> {
}
