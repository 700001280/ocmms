package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.loto.LotoDetailType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = LotoDetailTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = LotoDetailType.class)
public interface LotoDetailTypeRepository extends DetachableJpaRepository<LotoDetailType, Long>, LotoDetailTypeRepositoryCustom {
}
