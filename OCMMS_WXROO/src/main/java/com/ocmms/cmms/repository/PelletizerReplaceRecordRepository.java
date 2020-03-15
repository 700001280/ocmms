package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.PelletizerReplaceRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PelletizerReplaceRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PelletizerReplaceRecord.class)
public interface PelletizerReplaceRecordRepository extends DetachableJpaRepository<PelletizerReplaceRecord, Long>, PelletizerReplaceRecordRepositoryCustom {
}
