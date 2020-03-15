package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = StorageLocationRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = StorageLocation.class)
public interface StorageLocationRepository extends DetachableJpaRepository<StorageLocation, Long>, StorageLocationRepositoryCustom {
}
