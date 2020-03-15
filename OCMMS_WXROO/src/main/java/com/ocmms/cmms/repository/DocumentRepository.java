package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.edm.Document;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = DocumentRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Document.class)
public interface DocumentRepository extends DetachableJpaRepository<Document, Long>, DocumentRepositoryCustom {
}
