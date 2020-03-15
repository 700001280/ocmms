package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.FunctionalLocation;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = FunctionalLocationRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = FunctionalLocation.class)
public interface FunctionalLocationRepository extends DetachableJpaRepository<FunctionalLocation, Long>, FunctionalLocationRepositoryCustom {
}
