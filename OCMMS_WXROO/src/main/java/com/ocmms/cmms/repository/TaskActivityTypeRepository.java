package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.task.TaskActivityType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TaskActivityTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TaskActivityType.class)
public interface TaskActivityTypeRepository extends DetachableJpaRepository<TaskActivityType, Long>, TaskActivityTypeRepositoryCustom {
}
