package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.SubObjectType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = SubObjectTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = SubObjectType.class)
public interface SubObjectTypeRepository extends DetachableJpaRepository<SubObjectType, Long>, SubObjectTypeRepositoryCustom {
}
