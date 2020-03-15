package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceExecution;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PreventiveMaintenanceExecutionRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PreventiveMaintenanceExecution.class)
public interface PreventiveMaintenanceExecutionRepository extends DetachableJpaRepository<PreventiveMaintenanceExecution, Long>, PreventiveMaintenanceExecutionRepositoryCustom {
}
