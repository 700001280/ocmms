package com.ocmms.cmms.service.api;
import com.ocmms.cmms.model.edm.Document;
import io.springlets.data.web.validation.ValidatorService;
import io.springlets.format.EntityResolver;
import org.springframework.roo.addon.layers.service.annotations.RooService;

/**
 * = DocumentService
 TODO Auto-generated class documentation
 *
 */
@RooService(entity = Document.class)
public interface DocumentService extends EntityResolver<Document, Long>, ValidatorService<Document> {
}
