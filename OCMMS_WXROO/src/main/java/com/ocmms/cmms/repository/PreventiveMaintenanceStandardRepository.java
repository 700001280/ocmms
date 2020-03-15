package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PreventiveMaintenanceStandardRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PreventiveMaintenanceStandard.class)
public interface PreventiveMaintenanceStandardRepository extends DetachableJpaRepository<PreventiveMaintenanceStandard, Long>, PreventiveMaintenanceStandardRepositoryCustom {
}
