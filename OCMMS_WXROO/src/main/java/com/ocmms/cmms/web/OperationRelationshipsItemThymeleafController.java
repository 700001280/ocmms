package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.configuration.OperationRelationship;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = OperationRelationshipsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = OperationRelationship.class, type = ControllerType.ITEM)
@RooThymeleaf
public class OperationRelationshipsItemThymeleafController implements ConcurrencyManager<OperationRelationship> {
}
