package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureVessel;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PressureVesselRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PressureVessel.class)
public interface PressureVesselRepository extends DetachableJpaRepository<PressureVessel, Long>, PressureVesselRepositoryCustom {
}
