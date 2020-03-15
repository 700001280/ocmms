package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.edm.Document;

/**
 * = DocumentRepositoryImpl
 *
 * Implementation of DocumentRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = DocumentRepositoryCustom.class)
public class DocumentRepositoryImpl extends QueryDslRepositorySupportExt<Document> implements DocumentRepositoryCustom{

    /**
     * Default constructor
     */
    DocumentRepositoryImpl() {
        super(Document.class);
    }
}