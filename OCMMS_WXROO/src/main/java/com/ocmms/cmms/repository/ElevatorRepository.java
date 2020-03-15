package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.Elevator;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ElevatorRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Elevator.class)
public interface ElevatorRepository extends DetachableJpaRepository<Elevator, Long>, ElevatorRepositoryCustom {
}
