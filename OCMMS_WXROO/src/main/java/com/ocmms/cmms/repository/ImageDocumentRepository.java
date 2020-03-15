package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.edm.ImageDocument;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ImageDocumentRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ImageDocument.class)
public interface ImageDocumentRepository extends DetachableJpaRepository<ImageDocument, Long>, ImageDocumentRepositoryCustom {
}
