package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.edm.ImageDocument;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = ImageDocumentService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = ImageDocument.class)
public interface ImageDocumentService extends EntityResolver<ImageDocument, Long>, ValidatorService<ImageDocument> {
}
