package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.master.MaterialDiscipline;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MaterialDisciplineService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MaterialDiscipline.class)
public interface MaterialDisciplineService extends EntityResolver<MaterialDiscipline, Long>, ValidatorService<MaterialDiscipline> {
}
