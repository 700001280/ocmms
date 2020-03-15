package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WorkOrderMaterialRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = WorkOrderMaterial.class)
public interface WorkOrderMaterialRepository extends DetachableJpaRepository<WorkOrderMaterial, Long>, WorkOrderMaterialRepositoryCustom {
}
