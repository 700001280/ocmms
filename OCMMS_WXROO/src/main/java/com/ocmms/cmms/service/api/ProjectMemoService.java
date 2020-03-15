package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.system.ProjectMemo;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ProjectMemoService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ProjectMemo.class)
public interface ProjectMemoService extends EntityResolver<ProjectMemo, Long>, ValidatorService<ProjectMemo> {
}
