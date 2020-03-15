package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PlannerGroupRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PlannerGroup.class)
public interface PlannerGroupRepository extends DetachableJpaRepository<PlannerGroup, Long>, PlannerGroupRepositoryCustom {
}
