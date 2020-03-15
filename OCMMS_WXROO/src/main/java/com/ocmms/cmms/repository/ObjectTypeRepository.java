package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.ObjectType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ObjectTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ObjectType.class)
public interface ObjectTypeRepository extends DetachableJpaRepository<ObjectType, Long>, ObjectTypeRepositoryCustom {
}
