package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.mm.mdrm.MaterialDictionary;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = MaterialDictionaryService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = MaterialDictionary.class)
public interface MaterialDictionaryService extends EntityResolver<MaterialDictionary, Long>, ValidatorService<MaterialDictionary> {
}
