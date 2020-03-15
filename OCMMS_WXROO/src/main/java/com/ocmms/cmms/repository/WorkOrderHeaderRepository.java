package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WorkOrderHeaderRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = WorkOrderHeader.class)
public interface WorkOrderHeaderRepository extends DetachableJpaRepository<WorkOrderHeader, Long>, WorkOrderHeaderRepositoryCustom {
}
