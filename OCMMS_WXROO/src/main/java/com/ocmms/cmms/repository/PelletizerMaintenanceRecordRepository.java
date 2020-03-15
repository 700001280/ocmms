package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.PelletizerMaintenanceRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PelletizerMaintenanceRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PelletizerMaintenanceRecord.class)
public interface PelletizerMaintenanceRecordRepository extends DetachableJpaRepository<PelletizerMaintenanceRecord, Long>, PelletizerMaintenanceRecordRepositoryCustom {
}
