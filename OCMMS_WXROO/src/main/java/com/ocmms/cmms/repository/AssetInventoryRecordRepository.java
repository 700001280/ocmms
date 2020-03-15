package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = AssetInventoryRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = AssetInventoryRecord.class)
public interface AssetInventoryRecordRepository extends DetachableJpaRepository<AssetInventoryRecord, Long>, AssetInventoryRecordRepositoryCustom {
}
