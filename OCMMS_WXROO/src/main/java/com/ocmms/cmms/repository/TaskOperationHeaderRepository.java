package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.task.TaskOperationHeader;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TaskOperationHeaderRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TaskOperationHeader.class)
public interface TaskOperationHeaderRepository extends DetachableJpaRepository<TaskOperationHeader, Long>, TaskOperationHeaderRepositoryCustom {
}
