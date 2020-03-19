package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.master.InstockType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = InstockTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = InstockType.class)
public interface InstockTypeRepository extends DetachableJpaRepository<InstockType, Long>, InstockTypeRepositoryCustom {
}
