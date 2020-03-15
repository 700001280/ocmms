package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.plan.PreventiveMaintenanceType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PreventiveMaintenanceTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PreventiveMaintenanceType.class)
public interface PreventiveMaintenanceTypeRepository extends DetachableJpaRepository<PreventiveMaintenanceType, Long>, PreventiveMaintenanceTypeRepositoryCustom {
}
