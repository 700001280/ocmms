package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.PartScrappingRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PartScrappingRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PartScrappingRecord.class)
public interface PartScrappingRecordRepository extends DetachableJpaRepository<PartScrappingRecord, Long>, PartScrappingRecordRepositoryCustom {
}
