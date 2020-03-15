package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.task.TaskHeader;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TaskHeaderRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TaskHeader.class)
public interface TaskHeaderRepository extends DetachableJpaRepository<TaskHeader, Long>, TaskHeaderRepositoryCustom {
}
