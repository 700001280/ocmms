package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MaterialInstockDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaterialInstockDetail.class)
public interface MaterialInstockDetailRepository extends DetachableJpaRepository<MaterialInstockDetail, Long>, MaterialInstockDetailRepositoryCustom {
}
