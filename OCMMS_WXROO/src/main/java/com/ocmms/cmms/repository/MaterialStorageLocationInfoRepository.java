package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MaterialStorageLocationInfoRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaterialStorageLocationInfo.class)
public interface MaterialStorageLocationInfoRepository extends DetachableJpaRepository<MaterialStorageLocationInfo, Long>, MaterialStorageLocationInfoRepositoryCustom {
}
