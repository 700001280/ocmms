package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.plan.PlanStrategy;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PlanStrategyRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PlanStrategy.class)
public interface PlanStrategyRepository extends DetachableJpaRepository<PlanStrategy, Long>, PlanStrategyRepositoryCustom {
}
