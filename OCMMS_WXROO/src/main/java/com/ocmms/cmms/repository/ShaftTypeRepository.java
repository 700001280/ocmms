package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pp.configuration.ShaftType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ShaftTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ShaftType.class)
public interface ShaftTypeRepository extends DetachableJpaRepository<ShaftType, Long>, ShaftTypeRepositoryCustom {
}
