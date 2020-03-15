package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.workorder.WorkOrderSystemStatus;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WorkOrderSystemStatusRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = WorkOrderSystemStatus.class)
public interface WorkOrderSystemStatusRepository extends DetachableJpaRepository<WorkOrderSystemStatus, Long>, WorkOrderSystemStatusRepositoryCustom {
}
