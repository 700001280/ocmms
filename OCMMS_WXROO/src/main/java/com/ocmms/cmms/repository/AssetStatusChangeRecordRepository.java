package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.asset.AssetStatusChangeRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = AssetStatusChangeRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = AssetStatusChangeRecord.class)
public interface AssetStatusChangeRecordRepository extends DetachableJpaRepository<AssetStatusChangeRecord, Long>, AssetStatusChangeRecordRepositoryCustom {
}
