package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.routine.PreventiveMaintenanceFinding;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PreventiveMaintenanceFindingRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PreventiveMaintenanceFinding.class)
public interface PreventiveMaintenanceFindingRepository extends DetachableJpaRepository<PreventiveMaintenanceFinding, Long>, PreventiveMaintenanceFindingRepositoryCustom {
}
