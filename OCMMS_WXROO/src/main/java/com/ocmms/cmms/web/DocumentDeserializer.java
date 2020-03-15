package com.ocmms.cmms.web;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.service.api.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = DocumentDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Document.class)
public class DocumentDeserializer extends JsonObjectDeserializer<Document> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private DocumentService documentService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param documentService
     * @param conversionService
     */
    @Autowired
    public DocumentDeserializer(@Lazy DocumentService documentService, ConversionService conversionService) {
        this.documentService = documentService;
        this.conversionService = conversionService;
    }
}
