package com.ocmms.cmms.web;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.service.api.ImageDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;

/**
 * = ImageDocumentDeserializer
 TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = ImageDocument.class)
public class ImageDocumentDeserializer extends JsonObjectDeserializer<ImageDocument> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ImageDocumentService imageDocumentService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param imageDocumentService
     * @param conversionService
     */
    @Autowired
    public ImageDocumentDeserializer(@Lazy ImageDocumentService imageDocumentService, ConversionService conversionService) {
        this.imageDocumentService = imageDocumentService;
        this.conversionService = conversionService;
    }
}
