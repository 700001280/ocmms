package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.Hoist;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = HoistRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Hoist.class)
public interface HoistRepository extends DetachableJpaRepository<Hoist, Long>, HoistRepositoryCustom {
}
