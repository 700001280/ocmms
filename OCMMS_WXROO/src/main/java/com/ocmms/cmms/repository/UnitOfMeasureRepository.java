package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = UnitOfMeasureRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = UnitOfMeasure.class)
public interface UnitOfMeasureRepository extends DetachableJpaRepository<UnitOfMeasure, Long>, UnitOfMeasureRepositoryCustom {
}
