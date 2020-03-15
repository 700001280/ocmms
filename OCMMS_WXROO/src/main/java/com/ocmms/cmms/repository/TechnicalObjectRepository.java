package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = TechnicalObjectRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TechnicalObject.class)
public interface TechnicalObjectRepository extends DetachableJpaRepository<TechnicalObject, Long>, TechnicalObjectRepositoryCustom {
}
