package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PartMaintenanceRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PartMaintenanceRecord.class)
public interface PartMaintenanceRecordRepository extends DetachableJpaRepository<PartMaintenanceRecord, Long>, PartMaintenanceRecordRepositoryCustom {
}
