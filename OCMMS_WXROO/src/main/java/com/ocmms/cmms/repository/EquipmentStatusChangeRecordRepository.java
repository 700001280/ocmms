package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatusChangeRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = EquipmentStatusChangeRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = EquipmentStatusChangeRecord.class)
public interface EquipmentStatusChangeRecordRepository extends DetachableJpaRepository<EquipmentStatusChangeRecord, Long>, EquipmentStatusChangeRecordRepositoryCustom {
}
