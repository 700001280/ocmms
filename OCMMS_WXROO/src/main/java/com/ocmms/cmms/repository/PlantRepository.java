package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.hrm.Plant;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PlantRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Plant.class)
public interface PlantRepository extends DetachableJpaRepository<Plant, Long>, PlantRepositoryCustom {
}
