package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.task.TaskHeaderText;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TaskHeaderTextRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TaskHeaderText.class)
public interface TaskHeaderTextRepository extends DetachableJpaRepository<TaskHeaderText, Long>, TaskHeaderTextRepositoryCustom {
}
