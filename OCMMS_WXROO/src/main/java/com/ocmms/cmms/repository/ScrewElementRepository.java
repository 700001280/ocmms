package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.master.ScrewElement;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ScrewElementRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ScrewElement.class)
public interface ScrewElementRepository extends DetachableJpaRepository<ScrewElement, Long>, ScrewElementRepositoryCustom {
}
