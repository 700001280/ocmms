package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.procurement.PriorityType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PriorityTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PriorityType.class)
public interface PriorityTypeRepository extends DetachableJpaRepository<PriorityType, Long>, PriorityTypeRepositoryCustom {
}
