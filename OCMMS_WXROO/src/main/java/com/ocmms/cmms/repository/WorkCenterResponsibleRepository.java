package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WorkCenterResponsibleRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = WorkCenterResponsible.class)
public interface WorkCenterResponsibleRepository extends DetachableJpaRepository<WorkCenterResponsible, Long>, WorkCenterResponsibleRepositoryCustom {
}
