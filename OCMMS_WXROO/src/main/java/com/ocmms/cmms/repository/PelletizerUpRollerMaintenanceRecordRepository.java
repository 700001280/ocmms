package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerMaintenanceRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PelletizerUpRollerMaintenanceRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PelletizerUpRollerMaintenanceRecord.class)
public interface PelletizerUpRollerMaintenanceRecordRepository extends DetachableJpaRepository<PelletizerUpRollerMaintenanceRecord, Long>, PelletizerUpRollerMaintenanceRecordRepositoryCustom {
}
