package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.notification.FailureObjectPart;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = FailureObjectPartRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = FailureObjectPart.class)
public interface FailureObjectPartRepository extends DetachableJpaRepository<FailureObjectPart, Long>, FailureObjectPartRepositoryCustom {
}
