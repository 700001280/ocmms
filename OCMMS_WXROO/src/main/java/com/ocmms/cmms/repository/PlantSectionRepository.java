package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PlantSectionRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PlantSection.class)
public interface PlantSectionRepository extends DetachableJpaRepository<PlantSection, Long>, PlantSectionRepositoryCustom {
}
