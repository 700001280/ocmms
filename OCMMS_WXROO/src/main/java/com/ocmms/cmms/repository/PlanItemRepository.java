package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.plan.PlanItem;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PlanItemRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PlanItem.class)
public interface PlanItemRepository extends DetachableJpaRepository<PlanItem, Long>, PlanItemRepositoryCustom {
}
