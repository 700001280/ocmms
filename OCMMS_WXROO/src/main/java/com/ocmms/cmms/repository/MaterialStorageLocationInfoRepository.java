package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.MaterialStorageLocationInfo;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = MaterialStorageLocationInfoRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaterialStorageLocationInfo.class, finders = {
		@RooFinder(value = "findByMaterialCatalogAndStorageLocation", returnType = MaterialStorageLocationInfo.class) })
public interface MaterialStorageLocationInfoRepository extends DetachableJpaRepository<MaterialStorageLocationInfo, Long>, MaterialStorageLocationInfoRepositoryCustom {
}
