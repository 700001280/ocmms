package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.MovementType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MovementTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MovementType.class)
public interface MovementTypeRepository extends DetachableJpaRepository<MovementType, Long>, MovementTypeRepositoryCustom {
}
