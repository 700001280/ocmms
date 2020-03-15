package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.PelletizerCutterReplaceRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PelletizerCutterReplaceRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PelletizerCutterReplaceRecord.class)
public interface PelletizerCutterReplaceRecordRepository extends DetachableJpaRepository<PelletizerCutterReplaceRecord, Long>, PelletizerCutterReplaceRecordRepositoryCustom {
}
