package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.edm.ImageDocument;

/**
 * = ImageDocumentRepositoryImpl
 *
 * Implementation of ImageDocumentRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ImageDocumentRepositoryCustom.class)
public class ImageDocumentRepositoryImpl extends QueryDslRepositorySupportExt<ImageDocument> implements ImageDocumentRepositoryCustom{

    /**
     * Default constructor
     */
    ImageDocumentRepositoryImpl() {
        super(ImageDocument.class);
    }
}