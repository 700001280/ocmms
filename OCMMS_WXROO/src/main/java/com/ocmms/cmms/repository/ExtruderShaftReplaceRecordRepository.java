package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.ExtruderShaftReplaceRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ExtruderShaftReplaceRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ExtruderShaftReplaceRecord.class)
public interface ExtruderShaftReplaceRecordRepository extends DetachableJpaRepository<ExtruderShaftReplaceRecord, Long>, ExtruderShaftReplaceRecordRepositoryCustom {
}
