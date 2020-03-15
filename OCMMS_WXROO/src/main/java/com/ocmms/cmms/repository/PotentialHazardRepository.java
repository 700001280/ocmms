package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.loto.PotentialHazard;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PotentialHazardRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PotentialHazard.class)
public interface PotentialHazardRepository extends DetachableJpaRepository<PotentialHazard, Long>, PotentialHazardRepositoryCustom {
}
