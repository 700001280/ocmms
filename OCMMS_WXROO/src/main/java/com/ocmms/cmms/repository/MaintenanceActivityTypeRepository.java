package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MaintenanceActivityTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaintenanceActivityType.class)
public interface MaintenanceActivityTypeRepository extends DetachableJpaRepository<MaintenanceActivityType, Long>, MaintenanceActivityTypeRepositoryCustom {
}
