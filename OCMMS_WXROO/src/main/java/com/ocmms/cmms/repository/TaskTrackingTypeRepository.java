package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.assistance.TaskTrackingType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TaskTrackingTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TaskTrackingType.class)
public interface TaskTrackingTypeRepository extends DetachableJpaRepository<TaskTrackingType, Long>, TaskTrackingTypeRepositoryCustom {
}
