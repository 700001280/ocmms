package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.AbcIndicator;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = AbcIndicatorRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = AbcIndicator.class)
public interface AbcIndicatorRepository extends DetachableJpaRepository<AbcIndicator, Long>, AbcIndicatorRepositoryCustom {
}
