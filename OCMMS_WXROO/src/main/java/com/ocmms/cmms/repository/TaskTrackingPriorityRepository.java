package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.assistance.TaskTrackingPriority;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TaskTrackingPriorityRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TaskTrackingPriority.class)
public interface TaskTrackingPriorityRepository extends DetachableJpaRepository<TaskTrackingPriority, Long>, TaskTrackingPriorityRepositoryCustom {
}
