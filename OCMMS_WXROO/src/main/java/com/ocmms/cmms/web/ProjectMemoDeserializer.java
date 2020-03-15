package com.ocmms.cmms.web;
import com.ocmms.cmms.model.system.ProjectMemo;
import com.ocmms.cmms.service.api.ProjectMemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ProjectMemoDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ProjectMemo.class)
public class ProjectMemoDeserializer extends JsonObjectDeserializer<ProjectMemo> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ProjectMemoService projectMemoService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param projectMemoService
     * @param conversionService
     */
    @Autowired
    public ProjectMemoDeserializer(@Lazy ProjectMemoService projectMemoService, ConversionService conversionService) {
        this.projectMemoService = projectMemoService;
        this.conversionService = conversionService;
    }
}
