package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.EquipmentScrappingRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = EquipmentScrappingRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = EquipmentScrappingRecord.class)
public interface EquipmentScrappingRecordRepository extends DetachableJpaRepository<EquipmentScrappingRecord, Long>, EquipmentScrappingRecordRepositoryCustom {
}
