package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PreventiveMaintenanceContentRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PreventiveMaintenanceContent.class)
public interface PreventiveMaintenanceContentRepository extends DetachableJpaRepository<PreventiveMaintenanceContent, Long>, PreventiveMaintenanceContentRepositoryCustom {
}
