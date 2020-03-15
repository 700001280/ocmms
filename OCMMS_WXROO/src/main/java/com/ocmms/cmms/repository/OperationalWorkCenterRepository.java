package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.OperationalWorkCenter;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = OperationalWorkCenterRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = OperationalWorkCenter.class)
public interface OperationalWorkCenterRepository extends DetachableJpaRepository<OperationalWorkCenter, Long>, OperationalWorkCenterRepositoryCustom {
}
