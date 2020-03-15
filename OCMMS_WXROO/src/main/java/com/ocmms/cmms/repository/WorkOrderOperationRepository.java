package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.workorder.WorkOrderOperation;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WorkOrderOperationRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = WorkOrderOperation.class)
public interface WorkOrderOperationRepository extends DetachableJpaRepository<WorkOrderOperation, Long>, WorkOrderOperationRepositoryCustom {
}
