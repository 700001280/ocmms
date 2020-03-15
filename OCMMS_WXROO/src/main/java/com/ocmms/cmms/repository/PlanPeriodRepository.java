package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.plan.PlanPeriod;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PlanPeriodRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PlanPeriod.class)
public interface PlanPeriodRepository extends DetachableJpaRepository<PlanPeriod, Long>, PlanPeriodRepositoryCustom {
}
