package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.master.MROCatalog;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MROCatalogRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MROCatalog.class)
public interface MROCatalogRepository extends DetachableJpaRepository<MROCatalog, Long>, MROCatalogRepositoryCustom {
}
