package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PlantLocationRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PlantLocation.class)
public interface PlantLocationRepository extends DetachableJpaRepository<PlantLocation, Long>, PlantLocationRepositoryCustom {
}
