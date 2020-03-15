package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MaterialCatalogRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaterialCatalog.class)
public interface MaterialCatalogRepository extends DetachableJpaRepository<MaterialCatalog, Long>, MaterialCatalogRepositoryCustom {
}
