package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.task.TaskOperationMaterial;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TaskOperationMaterialRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TaskOperationMaterial.class)
public interface TaskOperationMaterialRepository extends DetachableJpaRepository<TaskOperationMaterial, Long>, TaskOperationMaterialRepositoryCustom {
}
