package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pp.operation.AutonomousMaintenanceFinding;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = AutonomousMaintenanceFindingRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = AutonomousMaintenanceFinding.class)
public interface AutonomousMaintenanceFindingRepository extends DetachableJpaRepository<AutonomousMaintenanceFinding, Long>, AutonomousMaintenanceFindingRepositoryCustom {
}
