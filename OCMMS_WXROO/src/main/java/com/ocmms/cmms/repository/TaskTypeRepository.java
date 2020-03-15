package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.task.TaskType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TaskTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TaskType.class)
public interface TaskTypeRepository extends DetachableJpaRepository<TaskType, Long>, TaskTypeRepositoryCustom {
}
