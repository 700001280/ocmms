package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.assistance.TaskTrackingStatus;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TaskTrackingStatusRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TaskTrackingStatus.class)
public interface TaskTrackingStatusRepository extends DetachableJpaRepository<TaskTrackingStatus, Long>, TaskTrackingStatusRepositoryCustom {
}
