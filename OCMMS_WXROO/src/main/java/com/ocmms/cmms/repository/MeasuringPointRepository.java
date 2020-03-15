package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.measuringpoint.MeasuringPoint;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MeasuringPointRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MeasuringPoint.class)
public interface MeasuringPointRepository extends DetachableJpaRepository<MeasuringPoint, Long>, MeasuringPointRepositoryCustom {
}
