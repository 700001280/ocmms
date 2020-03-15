package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.asset.AssetStatus;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = AssetStatusRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = AssetStatus.class)
public interface AssetStatusRepository extends DetachableJpaRepository<AssetStatus, Long>, AssetStatusRepositoryCustom {
}
