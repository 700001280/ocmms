package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.PelletizerCutterMaintenanceRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PelletizerCutterMaintenanceRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PelletizerCutterMaintenanceRecord.class)
public interface PelletizerCutterMaintenanceRecordRepository extends DetachableJpaRepository<PelletizerCutterMaintenanceRecord, Long>, PelletizerCutterMaintenanceRecordRepositoryCustom {
}
