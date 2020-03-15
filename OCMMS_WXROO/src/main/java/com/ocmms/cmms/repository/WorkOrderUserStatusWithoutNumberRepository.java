package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithoutNumber;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WorkOrderUserStatusWithoutNumberRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = WorkOrderUserStatusWithoutNumber.class)
public interface WorkOrderUserStatusWithoutNumberRepository extends DetachableJpaRepository<WorkOrderUserStatusWithoutNumber, Long>, WorkOrderUserStatusWithoutNumberRepositoryCustom {
}
