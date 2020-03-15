package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.workorder.WorkOrderControlkey;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WorkOrderControlkeyRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = WorkOrderControlkey.class)
public interface WorkOrderControlkeyRepository extends DetachableJpaRepository<WorkOrderControlkey, Long>, WorkOrderControlkeyRepositoryCustom {
}
