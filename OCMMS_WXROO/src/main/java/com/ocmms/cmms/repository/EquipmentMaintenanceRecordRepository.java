package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.EquipmentMaintenanceRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = EquipmentMaintenanceRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = EquipmentMaintenanceRecord.class)
public interface EquipmentMaintenanceRecordRepository extends DetachableJpaRepository<EquipmentMaintenanceRecord, Long>, EquipmentMaintenanceRecordRepositoryCustom {
}
