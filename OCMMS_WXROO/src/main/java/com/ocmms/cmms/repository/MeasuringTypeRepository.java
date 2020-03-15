package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MeasuringTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MeasuringType.class)
public interface MeasuringTypeRepository extends DetachableJpaRepository<MeasuringType, Long>, MeasuringTypeRepositoryCustom {
}
