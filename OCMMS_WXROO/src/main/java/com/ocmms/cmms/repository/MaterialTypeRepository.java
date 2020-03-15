package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.master.MaterialType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MaterialTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaterialType.class)
public interface MaterialTypeRepository extends DetachableJpaRepository<MaterialType, Long>, MaterialTypeRepositoryCustom {
}
