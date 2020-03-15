package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringRecord;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MeasuringRecordRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MeasuringRecord.class)
public interface MeasuringRecordRepository extends DetachableJpaRepository<MeasuringRecord, Long>, MeasuringRecordRepositoryCustom {
}
