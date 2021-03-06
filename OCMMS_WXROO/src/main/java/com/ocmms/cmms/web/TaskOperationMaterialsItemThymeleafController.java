package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskOperationMaterial;
import io.springlets.web.mvc.util.concurrency.ConcurrencyManager;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = TaskOperationMaterialsItemThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = TaskOperationMaterial.class, type = ControllerType.ITEM)
@RooThymeleaf
public class TaskOperationMaterialsItemThymeleafController implements ConcurrencyManager<TaskOperationMaterial> {
}
