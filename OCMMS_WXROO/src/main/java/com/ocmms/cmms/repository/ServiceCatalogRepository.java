package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.master.ServiceCatalog;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ServiceCatalogRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ServiceCatalog.class)
public interface ServiceCatalogRepository extends DetachableJpaRepository<ServiceCatalog, Long>, ServiceCatalogRepositoryCustom {
}
