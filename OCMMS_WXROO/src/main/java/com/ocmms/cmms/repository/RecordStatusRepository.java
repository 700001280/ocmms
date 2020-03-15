package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.system.RecordStatus;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = RecordStatusRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = RecordStatus.class)
public interface RecordStatusRepository extends DetachableJpaRepository<RecordStatus, Long>, RecordStatusRepositoryCustom {
}
