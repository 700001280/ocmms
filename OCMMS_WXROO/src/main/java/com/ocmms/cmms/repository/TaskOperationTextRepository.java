package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.task.TaskOperationText;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TaskOperationTextRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TaskOperationText.class)
public interface TaskOperationTextRepository extends DetachableJpaRepository<TaskOperationText, Long>, TaskOperationTextRepositoryCustom {
}
