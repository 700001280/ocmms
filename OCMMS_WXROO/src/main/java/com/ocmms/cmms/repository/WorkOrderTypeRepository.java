package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.workorder.WorkOrderType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WorkOrderTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = WorkOrderType.class)
public interface WorkOrderTypeRepository extends DetachableJpaRepository<WorkOrderType, Long>, WorkOrderTypeRepositoryCustom {
}
