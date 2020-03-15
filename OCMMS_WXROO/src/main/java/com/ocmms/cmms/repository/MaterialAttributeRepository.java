package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.master.MaterialAttribute;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MaterialAttributeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaterialAttribute.class)
public interface MaterialAttributeRepository extends DetachableJpaRepository<MaterialAttribute, Long>, MaterialAttributeRepositoryCustom {
}
