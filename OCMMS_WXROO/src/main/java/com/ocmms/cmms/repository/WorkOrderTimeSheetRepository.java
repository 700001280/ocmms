package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.workorder.WorkOrderTimeSheet;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WorkOrderTimeSheetRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = WorkOrderTimeSheet.class)
public interface WorkOrderTimeSheetRepository extends DetachableJpaRepository<WorkOrderTimeSheet, Long>, WorkOrderTimeSheetRepositoryCustom {
}
