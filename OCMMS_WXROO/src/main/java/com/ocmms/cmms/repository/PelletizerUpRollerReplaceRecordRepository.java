package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerReplaceRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PelletizerUpRollerReplaceRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PelletizerUpRollerReplaceRecord.class)
public interface PelletizerUpRollerReplaceRecordRepository extends DetachableJpaRepository<PelletizerUpRollerReplaceRecord, Long>, PelletizerUpRollerReplaceRecordRepositoryCustom {
}
