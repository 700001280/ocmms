package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.common.Region;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = RegionRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Region.class)
public interface RegionRepository extends DetachableJpaRepository<Region, Long>, RegionRepositoryCustom {
}
