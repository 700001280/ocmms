package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.measuringpoint.Medium;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MediumRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Medium.class)
public interface MediumRepository extends DetachableJpaRepository<Medium, Long>, MediumRepositoryCustom {
}
