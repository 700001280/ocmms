package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WorkOrderUserStatusWithNumberRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = WorkOrderUserStatusWithNumber.class)
public interface WorkOrderUserStatusWithNumberRepository extends DetachableJpaRepository<WorkOrderUserStatusWithNumber, Long>, WorkOrderUserStatusWithNumberRepositoryCustom {
}
