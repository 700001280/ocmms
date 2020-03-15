package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.asset.AssetClassification;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = AssetClassificationRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = AssetClassification.class)
public interface AssetClassificationRepository extends DetachableJpaRepository<AssetClassification, Long>, AssetClassificationRepositoryCustom {
}
