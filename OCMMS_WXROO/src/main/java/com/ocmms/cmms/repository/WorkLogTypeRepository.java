package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.assistance.WorkLogType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = WorkLogTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = WorkLogType.class)
public interface WorkLogTypeRepository extends DetachableJpaRepository<WorkLogType, Long>, WorkLogTypeRepositoryCustom {
}
