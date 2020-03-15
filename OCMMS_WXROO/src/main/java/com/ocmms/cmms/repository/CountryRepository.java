package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.common.Country;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = CountryRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Country.class)
public interface CountryRepository extends DetachableJpaRepository<Country, Long>, CountryRepositoryCustom {
}
