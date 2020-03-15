package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.notification.FailureDamageType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = FailureDamageTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = FailureDamageType.class)
public interface FailureDamageTypeRepository extends DetachableJpaRepository<FailureDamageType, Long>, FailureDamageTypeRepositoryCustom {
}
