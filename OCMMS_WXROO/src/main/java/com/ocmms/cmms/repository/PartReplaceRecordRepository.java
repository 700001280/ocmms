package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.PartReplaceRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PartReplaceRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PartReplaceRecord.class)
public interface PartReplaceRecordRepository extends DetachableJpaRepository<PartReplaceRecord, Long>, PartReplaceRecordRepositoryCustom {
}
