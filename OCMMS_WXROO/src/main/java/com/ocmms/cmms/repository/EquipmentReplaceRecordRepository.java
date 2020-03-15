package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.EquipmentReplaceRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = EquipmentReplaceRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = EquipmentReplaceRecord.class)
public interface EquipmentReplaceRecordRepository extends DetachableJpaRepository<EquipmentReplaceRecord, Long>, EquipmentReplaceRecordRepositoryCustom {
}
