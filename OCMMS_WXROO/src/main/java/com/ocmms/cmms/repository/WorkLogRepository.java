package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.assistance.WorkLog;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WorkLogRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = WorkLog.class)
public interface WorkLogRepository extends DetachableJpaRepository<WorkLog, Long>, WorkLogRepositoryCustom {
}
