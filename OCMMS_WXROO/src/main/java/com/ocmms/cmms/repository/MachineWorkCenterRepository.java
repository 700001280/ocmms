package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.MachineWorkCenter;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MachineWorkCenterRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MachineWorkCenter.class)
public interface MachineWorkCenterRepository extends DetachableJpaRepository<MachineWorkCenter, Long>, MachineWorkCenterRepositoryCustom {
}
