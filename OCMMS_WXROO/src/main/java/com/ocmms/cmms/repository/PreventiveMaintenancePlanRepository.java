package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.plan.PreventiveMaintenancePlan;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PreventiveMaintenancePlanRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PreventiveMaintenancePlan.class)
public interface PreventiveMaintenancePlanRepository extends DetachableJpaRepository<PreventiveMaintenancePlan, Long>, PreventiveMaintenancePlanRepositoryCustom {
}
