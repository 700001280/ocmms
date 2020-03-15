package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.master.MaterialDiscipline;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MaterialDisciplineRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaterialDiscipline.class)
public interface MaterialDisciplineRepository extends DetachableJpaRepository<MaterialDiscipline, Long>, MaterialDisciplineRepositoryCustom {
}
