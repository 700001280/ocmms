package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.procurement.CatalogType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = CatalogTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = CatalogType.class)
public interface CatalogTypeRepository extends DetachableJpaRepository<CatalogType, Long>, CatalogTypeRepositoryCustom {
}
