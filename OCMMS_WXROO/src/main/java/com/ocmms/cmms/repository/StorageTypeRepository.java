package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.StorageType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = StorageTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = StorageType.class)
public interface StorageTypeRepository extends DetachableJpaRepository<StorageType, Long>, StorageTypeRepositoryCustom {
}
