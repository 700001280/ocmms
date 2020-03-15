package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.common.City;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = CityRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = City.class)
public interface CityRepository extends DetachableJpaRepository<City, Long>, CityRepositoryCustom {
}
