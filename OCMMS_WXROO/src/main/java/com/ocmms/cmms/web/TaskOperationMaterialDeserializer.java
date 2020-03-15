package com.ocmms.cmms.web;
import com.ocmms.cmms.model.pm.task.TaskOperationMaterial;
import com.ocmms.cmms.service.api.TaskOperationMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = TaskOperationMaterialDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = TaskOperationMaterial.class)
public class TaskOperationMaterialDeserializer extends JsonObjectDeserializer<TaskOperationMaterial> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private TaskOperationMaterialService taskOperationMaterialService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param taskOperationMaterialService
     * @param conversionService
     */
    @Autowired
    public TaskOperationMaterialDeserializer(@Lazy TaskOperationMaterialService taskOperationMaterialService, ConversionService conversionService) {
        this.taskOperationMaterialService = taskOperationMaterialService;
        this.conversionService = conversionService;
    }
}
