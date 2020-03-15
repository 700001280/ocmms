package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.notification.FailureDamageCause;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = FailureDamageCauseRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = FailureDamageCause.class)
public interface FailureDamageCauseRepository extends DetachableJpaRepository<FailureDamageCause, Long>, FailureDamageCauseRepositoryCustom {
}
