package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.hrm.OrganizationCatalog;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = OrganizationCatalogRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = OrganizationCatalog.class)
public interface OrganizationCatalogRepository extends DetachableJpaRepository<OrganizationCatalog, Long>, OrganizationCatalogRepositoryCustom {
}
